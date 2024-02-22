package main.metamodel;

public class Transition{
	
	String when;
	String tempTo;
	State to;
	OperationTypes operationType;
	String operationName;
	int operationI;
	ConditionTypes conditionType;
	String conditionName;
	int conditionI;
	
	
	public enum OperationTypes {
		SET,
		INCREMENT,
		DECREMENT
	}
	
	public enum ConditionTypes {
		IFEQUALS,
		IFGREATERTHAN,
		IFLESSTHAN
	}
	
	public String getTempTo() {
		return this.tempTo;
	}
	
	public void setTarget(State to) {
		this.to = to;
	}
	
	public int getOperationI() {
		return this.operationI;
	}
	
	public Transition(
			String when,
			String tempTo,
			OperationTypes operationType,
			String operationName, 
			int operationI,
			ConditionTypes conditionType,
			String conditionName,
			int conditionI) {
		this.when = when;
		this.tempTo = tempTo;
		this.operationType = operationType;
		this.operationName = operationName;
		this.operationI = operationI;
		this.conditionType = conditionType;
		this.conditionName = conditionName;
		this.conditionI = conditionI;
	}
	
	public Object getEvent() {
		return this.when;
	}

	public State getTarget() {
		return this.to;
	}

	public boolean hasSetOperation() {
		return this.operationType.equals(OperationTypes.SET);
	}

	public boolean hasIncrementOperation() {
		return this.operationType.equals(OperationTypes.INCREMENT);
	}

	public boolean hasDecrementOperation() {
		return this.operationType.equals(OperationTypes.DECREMENT);
	}

	public Object getOperationVariableName() {
		return this.operationName;
	}

	public boolean isConditional() {
		return this.conditionType != null;
	}

	public Object getConditionVariableName() {
		return this.conditionName;
	}

	public Integer getConditionComparedValue() {
		return this.conditionI;
	}

	public boolean isConditionEqual() {
		return this.conditionType.equals(ConditionTypes.IFEQUALS);
	}

	public boolean isConditionGreaterThan() {
		return this.conditionType.equals(ConditionTypes.IFGREATERTHAN);
	}

	public boolean isConditionLessThan() {
		return this.conditionType.equals(ConditionTypes.IFLESSTHAN);
	}

	public boolean hasOperation() {
		return this.operationType != null;
	}

}
