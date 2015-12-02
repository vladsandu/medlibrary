package medproject.medlibrary.patient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import medproject.medlibrary.examination.Examination;

public class Patient implements Serializable{

	private static final long serialVersionUID = 1L;

	private final int patientID;

	private PatientRecord patientRecord;
	private final RegistrationRecord registrationRecord;
	private final List<Examination> examinationList;
	
	public Patient(int patientID, PatientRecord patientRecord, RegistrationRecord registrationRecord) {
		this.patientID = patientID;
		this.patientRecord = patientRecord;
		this.registrationRecord = registrationRecord;
		this.examinationList = new ArrayList<Examination>();
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

	public RegistrationRecord getRegistrationRecord() {
		return registrationRecord;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientRecord(PatientRecord patientRecord) {
		this.patientRecord = patientRecord;
	}

	public List<Examination> getExaminationList() {
		return examinationList;
	}
	
	public void addExamination(Examination examination){
		examinationList.add(examination);
	}
}
