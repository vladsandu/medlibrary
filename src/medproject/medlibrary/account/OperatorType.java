package medproject.medlibrary.account;

public enum OperatorType {
	MEDIC(1);

	private final int operatorID;

	private OperatorType(int operatorID) {
		this.operatorID = operatorID;
	}

	public int getOperatorID() {
		return operatorID;
	}
}
