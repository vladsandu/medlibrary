package medproject.medlibrary.prescription;

public enum PrescriptionType {
	FREE(0), GENERAL(1);
	
	private final int ID;

	private PrescriptionType(int iD) {
		ID = iD;
	}

	public int getID() {
		return ID;
	}
	
	public static PrescriptionType getTypeByID(int value){
		for(PrescriptionType type : PrescriptionType.values()){
			if(type.getID() == value)
				return type;
		}
		
		return null;
	}
}
