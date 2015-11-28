package medproject.medlibrary.patient;

public enum BloodType {
	A("A", 0), B("B", 1), AB("AB", 2), Zero("0", 3);
	
	private BloodType(String name, int intValue) {
		this.name = name;
		this.intValue = intValue;
	}

	private final String name;
	private final int intValue;
	
	public int getIntValue() {
		return intValue;
	}

	public String toString(){
		return name;
	}
	
	public static BloodType getBloodTypeFromInt(int value){
		
		for(BloodType type : BloodType.values()){
			if(type.getIntValue() == value)
				return type;
		}
		
		return null;
	}
}
