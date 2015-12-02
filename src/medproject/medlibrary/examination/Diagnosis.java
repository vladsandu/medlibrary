package medproject.medlibrary.examination;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

public class Diagnosis implements Serializable{

	private static final long serialVersionUID = 1L;
	private final int ID;
	private final int examinationID;
	private int diagnosisType;
	private String observations;
	private boolean active;
	private Date endDate;
	
	public Diagnosis(int iD, int examinationID, int diagnosisType, String observations, boolean active, Date endDate) {
		ID = iD;
		this.examinationID = examinationID;
		this.diagnosisType = diagnosisType;
		this.observations = observations;
		this.active = active;
		this.endDate = endDate;
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

	public int getDiagnosisType() {
		return diagnosisType;
	}

	public void setDiagnosisType(int diagnosisType) {
		this.diagnosisType = diagnosisType;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getID() {
		return ID;
	}

	public int getExaminationID() {
		return examinationID;
	}	
}
