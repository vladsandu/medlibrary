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

	private final int PID;
	private final String CNP;
	private String firstName, lastName;
	private final String gender;
	private final String birthDate;
	private String nationality;
	private Address address;
	private PatientCategory category;
	private final String enlistingDate;
	private String delistingDate, deceaseDate;
	private PatientStatus status;
	//	GRUPA_SANGUINA//
	//RH//

	public Patient(int pID, String cNP, String firstName, String lastName, String gender, String birthDate,
			String nationality, Address address, PatientCategory category, String enlistingDate, PatientStatus status) {
		super();
		PID = pID;
		CNP = cNP;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.nationality = nationality;
		this.address = address;
		this.category = category;
		this.enlistingDate = enlistingDate;
		this.status = status;
		delistingDate = "-";
		deceaseDate = "-";
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PatientCategory getCategory() {
		return category;
	}

	public void setCategory(PatientCategory category) {
		this.category = category;
	}

	public String getDelistingDate() {
		return delistingDate;
	}

	public void setDelistingDate(String delistingDate) {
		this.delistingDate = delistingDate;
	}

	public String getDeceaseDate() {
		return deceaseDate;
	}

	public void setDeceaseDate(String deceaseDate) {
		this.deceaseDate = deceaseDate;
	}

	public PatientStatus getStatus() {
		return status;
	}

	public void setStatus(PatientStatus status) {
		this.status = status;
	}

	public int getPID() {
		return PID;
	}

	public String getCNP() {
		return CNP;
	}

	public String getGender() {
		return gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getEnlistingDate() {
		return enlistingDate;
	}

}
