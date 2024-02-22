package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private String name;
	List<Transition> transitions;

	public List<Transition> getTransitionsByEvent(String string) {
		List<Transition> tempTransitions = new ArrayList<Transition>();
		for (int i = 0; i < this.transitions.size(); i++) {
			if (this.transitions.get(i).getEvent().equals(string)) {
				tempTransitions.add(this.transitions.get(i));
			}
		}
		return tempTransitions;
	}
	
	public State(String name) {
		this.name = name;
		this.transitions = new ArrayList<Transition>();
	}
	
	public void addTransition(Transition transition) {
		this.transitions.add(transition);
	}

	public Object getName() {
		return this.name;
	}

	public List<Transition> getTransitions() {
		return this.transitions;
	}

	public Transition getTransitionByEvent(String string) {
		for (int i = 0; i < this.transitions.size(); i++) {
			if (this.transitions.get(i).getEvent().equals(string)) {
				return this.transitions.get(i);
			}
		}
		return null;
	}
}
