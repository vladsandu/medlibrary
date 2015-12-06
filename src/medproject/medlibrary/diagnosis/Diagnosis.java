package medproject.medlibrary.diagnosis;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

public class Diagnosis implements Serializable{

	private static final long serialVersionUID = 1L;
	private final int ID;
	private final int examinationID;
	private int diagnosisID;
	private String observations;
	private boolean active;
	private final Date startDate;
	private Date endDate;
	private DiagnosisInfo diagnosisInfo;
	
	public Diagnosis(int iD, int examinationID, int diagnosisID, String observations, boolean active, Date startDate, Date endDate) {
		diagnosisInfo = null;
		ID = iD;
		this.examinationID = examinationID;
		this.diagnosisID = diagnosisID;
		this.observations = observations;
		this.active = active;
		this.startDate = startDate;
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
	
	public int getDiagnosisID() {
		return diagnosisID;
	}

	public void setDiagnosisID(int diagnosisID) {
		this.diagnosisID = diagnosisID;
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

	public String getEndDateString() {
		if(endDate == null)
			return "-";
		
		return endDate.toString();
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

	public DiagnosisInfo getDiagnosisInfo() {
		return diagnosisInfo;
	}

	public void setDiagnosisInfo(DiagnosisInfo diagnosisInfo) {
		this.diagnosisInfo = diagnosisInfo;
	}

	public String getStartDateString() {
		return startDate.toString();
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}	
}
