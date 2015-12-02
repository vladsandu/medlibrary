package medproject.medlibrary.examination;

public enum ExaminationType {
	Normala(1);
	
	private ExaminationType(int iD) {
		ID = iD;
	}

	private final int ID;
	
	public int getID() {
		return ID;
	}

	public static ExaminationType getExaminationTypeByInt(int value){
		for(ExaminationType type : ExaminationType.values())
			if(type.getID() == value)
				return type;
		return null;
	}
}
