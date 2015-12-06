package medproject.medlibrary.examination;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import medproject.medlibrary.diagnosis.Diagnosis;
import medproject.medlibrary.patient.Patient;
import medproject.medlibrary.prescription.Prescription;

public class Examination implements Serializable{

	private static final long serialVersionUID = -8864285944490559461L;

	private int examinationID;
	private final int patientID;
	private Date examinationDate;
	private List<Diagnosis> diagnosisList;
	private List<Prescription> prescriptionList;
	
	private int mainDiagnosisID;
	private String observations;
	private ExaminationType examinationType;
	private Patient patient;
	
	public Examination(int patientID, ExaminationType examinationType) {
		this.mainDiagnosisID = -1;
		this.patientID = patientID;
		this.examinationType = examinationType;
	}

	public Examination(int examinationID, int patientID, Date examinationDate, int mainDiagnosisID, 
			String observations, ExaminationType examinationType) {
		this.examinationID = examinationID;
		this.patientID = patientID;
		this.examinationDate = examinationDate;
		this.diagnosisList = new ArrayList<Diagnosis>();
		this.prescriptionList = new ArrayList<Prescription>();
		
		this.mainDiagnosisID = mainDiagnosisID;
		this.observations = observations;
		this.examinationType = examinationType;
		patient = null;
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
	
	public void addPrescription(Prescription prescription){
		prescriptionList.add(prescription);
	}
	
	public String getMainDiagnosisName(){
		String name = "-";
		
		if(mainDiagnosisID == -1)
			return name;
		
		
		for(Diagnosis diagnosis : diagnosisList){
			if(diagnosis.getDiagnosisID() == mainDiagnosisID){
				if(diagnosis.getDiagnosisInfo() != null)
					name = diagnosis.getDiagnosisInfo().getName();
				break;
			}
		}
		
		return name;
	}
	
	public String getPatientName(){
		if(patient == null)
			return "";
		
		return patient.getPatientRecord().getFullName();
	}
	
	public String getPatientCNP(){
		if(patient == null)
			return "";
		
		return patient.getPatientRecord().getCNP();
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

	public int getMainDiagnosisID() {
		return mainDiagnosisID;
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
