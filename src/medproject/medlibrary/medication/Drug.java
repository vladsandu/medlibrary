package medproject.medlibrary.medication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import medproject.medlibrary.account.MedicalDegree;

public class Drug implements Serializable{

	//TODO: Refactor the drug class
	
	private static final long serialVersionUID = 1L;
	private final int ID;
	private final String name;
	
	private final String substanceName;
	private final double concentration;
	
	private final String presentation;
	private final boolean fractionable;
	private final boolean compensated;
	private final boolean psychotic;
	private final double price;
	private final MedicalDegree degreeRequired;

	private final String producerName;
	private final String producerCountry;
	
	private int restriction;
	private final String warning;
	
	public Drug(int iD, String name, String substanceName, double concentration, String presentation,
			boolean fractionable, boolean compensated, boolean psychotic, double price,
			MedicalDegree degreeRequired, String producerName, String producerCountry, String warning) {
		ID = iD;
		this.name = name;
		this.substanceName = substanceName;
		this.concentration = concentration;
		this.presentation = presentation;
		this.fractionable = fractionable;
		this.compensated = compensated;
		this.psychotic = psychotic;
		this.price = price;
		this.degreeRequired = degreeRequired;
		this.producerName = producerName;
		this.producerCountry = producerCountry;
		this.warning = warning;
	}

	private void readObject(
		     ObjectInputStream aInputStream
		   ) throws ClassNotFoundException, IOException {
		     //always perform the default de-serialization first
		     aInputStream.defaultReadObject();

		     //ensure that object state has not been corrupted or tampered with maliciously
		   //  validateState();
		  }
	
	private void writeObject(
		      ObjectOutputStream aOutputStream
		    ) throws IOException {
		      //perform the default serialization for all non-transient, non-static fields
		      aOutputStream.defaultWriteObject();
		    }
	
	public int getRestriction() {
		return restriction;
	}

	public void setRestriction(int restriction) {
		this.restriction = restriction;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getSubstanceName() {
		return substanceName;
	}

	public double getConcentration() {
		return concentration;
	}

	public String getPresentation() {
		return presentation;
	}

	public boolean isFractionable() {
		return fractionable;
	}

	public boolean isCompensated() {
		return compensated;
	}

	public boolean isPsychotic() {
		return psychotic;
	}

	public double getPrice() {
		return price;
	}

	public MedicalDegree getDegreeRequired() {
		return degreeRequired;
	}

	public String getProducerName() {
		return producerName;
	}

	public String getProducerCountry() {
		return producerCountry;
	}

	public String getWarning() {
		return warning;
	}

}
