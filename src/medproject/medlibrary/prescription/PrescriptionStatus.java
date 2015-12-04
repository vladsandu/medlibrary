package medproject.medlibrary.prescription;

public enum PrescriptionStatus {
	NEW(0), PENDING(1), COMPLETE(2);
	
	private final int ID;

	private PrescriptionStatus(int iD) {
		ID = iD;
	}

	public int getID() {
		return ID;
	}
	
	public static PrescriptionStatus getStatusByID(int value){
		for(PrescriptionStatus status : PrescriptionStatus.values()){
			if(status.getID() == value)
				return status;
		}
		
		return null;
	}
}
