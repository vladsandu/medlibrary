package medproject.medlibrary.examination;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Examination implements Serializable{

	private static final long serialVersionUID = -8864285944490559461L;

	private final int examinationID;
	private final int patientID;
	private final Date examinationDate;
	private final List<Diagnosis> diagnosisList;
	private final List<Prescription> prescriptionList;
	
	private final Diagnosis mainDiagnosis;
	private final String observations;
	private final ExaminationType examinationType;
	
	public Examination(int examinationID, int patientID, Date examinationDate, Diagnosis mainDiagnosis, 
			String observations, ExaminationType examinationType) {
		this.examinationID = examinationID;
		this.patientID = patientID;
		this.examinationDate = examinationDate;
		this.diagnosisList = new ArrayList<Diagnosis>();
		this.prescriptionList = new ArrayList<Prescription>();
		
		this.mainDiagnosis = mainDiagnosis;
		this.observations = observations;
		this.examinationType = examinationType;
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

	public void addDiagnosis(Diagnosis diagnosis){
		diagnosisList.add(diagnosis);
	}
	
	public int getExaminationID() {
		return examinationID;
	}

	public int getPatientID() {
		return patientID;
	}

	public Date getExaminationDate() {
		return examinationDate;
	}

	public List<Diagnosis> getDiagnosisList() {
		return diagnosisList;
	}

	public Diagnosis getMainDiagnosis() {
		return mainDiagnosis;
	}

	public String getObservations() {
		return observations;
	}

	public ExaminationType getExaminationType() {
		return examinationType;
	}

	public List<Prescription> getPrescriptionList() {
		return prescriptionList;
	}
}
