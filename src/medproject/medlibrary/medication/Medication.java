package medproject.medlibrary.medication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Medication implements Serializable{

	private static final long serialVersionUID = 1L;
	private final int ID;
	private final int prescriptionID;
	private final int diagnosisID;
	private final int drugID;
	private final int quantity;
	private final int dayCount;
	private final MedicationAdministrationType type;
	private final TreatmentScheme scheme;
	private String observations;
	private Drug drug;
	
	public Medication(int iD, int prescriptionID, int diagnosisID, int drugID, int quantity, int dayCount,
			MedicationAdministrationType type, TreatmentScheme scheme, String observations) {
		ID = iD;
		this.prescriptionID = prescriptionID;
		this.diagnosisID = diagnosisID;
		this.drugID = drugID;
		this.quantity = quantity;
		this.dayCount = dayCount;
		this.type = type;
		this.scheme = scheme;
		this.observations = observations;
		drug = null;
	}

	public Medication(int iD, int prescriptionID, int diagnosisID, int drugID, int quantity, int dayCount,
			MedicationAdministrationType type, TreatmentScheme scheme) {
		super();
		ID = iD;
		this.prescriptionID = prescriptionID;
		this.diagnosisID = diagnosisID;
		this.drugID = drugID;
		this.quantity = quantity;
		this.dayCount = dayCount;
		this.type = type;
		this.scheme = scheme;
		drug = null;
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

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public int getID() {
		return ID;
	}

	public int getPrescriptionID() {
		return prescriptionID;
	}

	public int getDrugID() {
		return drugID;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getDayCount() {
		return dayCount;
	}

	public MedicationAdministrationType getType() {
		return type;
	}

	public TreatmentScheme getScheme() {
		return scheme;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public int getDiagnosisID() {
		return diagnosisID;
	}

	public String getDrugName() {
		if(drug == null)
			return "Unknown Data";
		
		return drug.getName();
	}
}
