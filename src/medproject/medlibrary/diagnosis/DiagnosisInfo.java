package medproject.medlibrary.diagnosis;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DiagnosisInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private final int ID;
	private final String name;
	
	public DiagnosisInfo(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	private void readObject(
			ObjectInputStream aInputStream
			) throws ClassNotFoundException, IOException {

		aInputStream.defaultReadObject();
	}

	private void writeObject(
			ObjectOutputStream aOutputStream
			) throws IOException {

		aOutputStream.defaultWriteObject();
	}

}
