package medproject.medlibrary.prescription;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import medproject.medlibrary.medication.Medication;

public class Prescription implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private final int ID;
	private final int examinationID;
	private final int dayCount;
	private final PrescriptionType type;
	private PrescriptionStatus status;
	private final List<Medication> medicationList;
	
	public Prescription(int iD, int examinationID, int dayCount, PrescriptionType type, PrescriptionStatus status) {
		ID = iD;
		this.examinationID = examinationID;
		this.dayCount = dayCount;
		this.type = type;
		this.status = status;
		
		medicationList = new ArrayList<Medication>();
	}

	public void addMedication(Medication medication){
		medicationList.add(medication);
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

	public PrescriptionStatus getStatus() {
		return status;
	}

	public void setStatus(PrescriptionStatus status) {
		this.status = status;
	}

	public int getID() {
		return ID;
	}

	public int getExaminationID() {
		return examinationID;
	}

	public int getDayCount() {
		return dayCount;
	}

	public PrescriptionType getType() {
		return type;
	}
}
