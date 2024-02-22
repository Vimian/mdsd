package main;

import java.util.List;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	
	Machine machine;
	State currentState;
	
    public void run(Machine m) {
        this.machine = m;
        this.currentState = this.machine.getInitialState();
    }

    public State getCurrentState() {
        return this.currentState;
    }

    public void processEvent(String string) {
        List<Transition> transitions = currentState.getTransitionsByEvent(string);
        if (transitions.size() == 0) {
        	return;
        }
        
        for (int i = 0; i < transitions.size(); i++) {
        	Transition transition = transitions.get(i);
        	
        	if (transition.isConditional()) {
            	int value = this.machine.getIntegerValue((String)transition.getConditionVariableName());
            	int comparedValue = transition.getConditionComparedValue();
            	
            	if (transition.isConditionEqual() && value != comparedValue) {
            		continue;
            	} else if (transition.isConditionGreaterThan() && value <= comparedValue) {
            		continue;
            	} else if (transition.isConditionLessThan() && value >= comparedValue) {
            		continue;
            	}
            }
            
            if (transition.hasOperation()) {
            	int newValue = 0;
            	
            	if (transition.hasSetOperation()) {
            		newValue = transition.getOperationI();
            	} else if (transition.hasIncrementOperation()) {
            		newValue = this.machine.getIntegerValue((String)transition.getOperationVariableName()) + 1;
            	} else if (transition.hasDecrementOperation()) {
            		newValue = this.machine.getIntegerValue((String)transition.getOperationVariableName()) - 1;
            	}
            	
            	this.machine.setIntegerValue(
        				(String)transition.getOperationVariableName(),
        				newValue);
            }
            
            currentState = transition.getTarget();
            return;
        }
    }

    public int getInteger(String string) {
        return this.machine.getIntegerValue(string);
    }

}
