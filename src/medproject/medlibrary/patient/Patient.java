package medproject.medlibrary.patient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Patient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int patientID;
	private PatientCategory category;
	private PatientStatus status;

	private final PatientRecord patientRecord;
	private final ListingRecord listingRecord;

	public Patient(int patientID, PatientRecord patientRecord, ListingRecord listingRecord, 
			PatientCategory category, PatientStatus status) {
		this.patientID = patientID;
		this.category = category;
		this.patientRecord = patientRecord;
		this.listingRecord = listingRecord;
		this.status = status;
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

	public PatientRecord getPatientRecord() {
		return patientRecord;
	}

	public ListingRecord getListingRecord() {
		return listingRecord;
	}

	public PatientCategory getCategory() {
		return category;
	}

	public void setCategory(PatientCategory category) {
		this.category = category;
	}

	public PatientStatus getStatus() {
		return status;
	}

	public void setStatus(PatientStatus status) {
		this.status = status;
	}

	public int getPatientID() {
		return patientID;
	}

}
