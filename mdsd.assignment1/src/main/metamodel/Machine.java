package main.metamodel;

import java.util.HashMap;
import java.util.List;

public class Machine {
	
	List<State> states;
	State initialState;
	HashMap<String, Integer> integers;
	
	public int getIntegerValue(String name) {
		return this.integers.get(name);
	}
	
	public void setIntegerValue(String name, int value) {
		this.integers.put(name, value);
	}

	public Machine(List<State> states, State initialState, HashMap<String, Integer> integers) {
		this.states = states;
		this.initialState = initialState;
		this.integers = integers;
	}
	
	public List<State> getStates() {
		return this.states;
	}

	public State getInitialState() {
		return this.initialState;
	}

	public State getState(String string) {
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getName().equals(string)) {
				return states.get(i);
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		return this.integers.size();
	}

	public boolean hasInteger(String string) {
		return this.integers.containsKey(string);
	}
}

