package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;
import main.metamodel.Transition.ConditionTypes;
import main.metamodel.Transition.OperationTypes;

public class StateMachine {
	
	List<State> states = new ArrayList<State>();
	State initialState;
	String when = null;
	String to = null;
	HashMap<String, Integer> integers = new HashMap<String, Integer>();
	OperationTypes operationType;
	String operationName;
	int operationI;
	ConditionTypes conditionType;
	String conditionName;
	int conditionI;

	public Machine build() {
		this.addTransition();
		for (int i = 0; i < this.states.size(); i++) {
			if (this.states.get(i).getTransitions().isEmpty()) {
				continue;
			}
			for (int j = 0; j < this.states.get(i).getTransitions().size(); j++) {
				String tempTo = this.states.get(i).getTransitions().get(j).getTempTo();
				for (int k = 0; k < this.states.size(); k++) {
					if (this.states.get(k).getName().equals(tempTo)) {
						this.states.get(i).getTransitions().get(j).setTarget(this.states.get(k));
					}
				}
			}
		}
		Machine machine = new Machine(this.states, this.initialState, this.integers);
		return machine;
	}

	public StateMachine state(String string) {
		this.addTransition();
		states.add(new State(string));
		return this;
	}

	public StateMachine initial() {
		this.initialState = states.get(states.size() - 1);
		return this;
	}
	
	private void addTransition() {
		if (when != null) {
			states.get(states.size() - 1).addTransition(
					new Transition(
							this.when,
							this.to,
							this.operationType,
							this.operationName,
							this.operationI,
							this.conditionType,
							this.conditionName,
							this.conditionI
							));
		}
		this.when = null;
		this.to = null;
		this.operationType = null;
		this.conditionType = null;
	}

	public StateMachine when(String string) {
		addTransition();
		this.when = string;
		return this;
	}

	public StateMachine to(String string) {
		this.to = string;
		return this;
	}

	public StateMachine integer(String string) {
		this.integers.put(string, 0);
		return this;
	}

	public StateMachine set(String string, int i) {
		this.operationType = OperationTypes.SET;
		this.operationName = string;
		this.operationI = i;
		return this;
	}

	public StateMachine increment(String string) {
		this.operationType = OperationTypes.INCREMENT;
		this.operationName = string;
		return this;
	}

	public StateMachine decrement(String string) {
		this.operationType = OperationTypes.DECREMENT;
		this.operationName = string;
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		this.conditionType = ConditionTypes.IFEQUALS;
		this.conditionName = string;
		this.conditionI = i;
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		this.conditionType = ConditionTypes.IFGREATERTHAN;
		this.conditionName = string;
		this.conditionI = i;
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		this.conditionType = ConditionTypes.IFLESSTHAN;
		this.conditionName = string;
		this.conditionI = i;
		return this;
	}

}
