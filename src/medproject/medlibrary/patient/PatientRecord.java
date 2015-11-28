package medproject.medlibrary.patient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

public class PatientRecord implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int PERSON_ID;
	private final String CNP;
	private String firstName;
	private String lastName;
	private final String sex;
	private final Date birthDate;
	private Date deceaseDate;
	private String nationality;
	private BloodType bloodType;
	private int rhType;
	
	private final Address address;
	
	public PatientRecord(int PERSON_ID, Address address, String CNP, String firstName, String lastName, String sex, Date birthDate,
			Date deceaseDate,String nationality, BloodType bloodType, int rhType) {
		this.PERSON_ID = PERSON_ID;
		this.CNP = CNP;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.birthDate = birthDate;
		this.address = address;
		this.deceaseDate = deceaseDate;
		this.nationality = nationality;
		this.bloodType = bloodType;
		this.rhType = rhType;
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

	public BloodType getBloodType() {
		return bloodType;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

	public int getRhType() {
		return rhType;
	}

	public void setRhType(int rhType) {
		this.rhType = rhType;
	}

	public String getCNP() {
		return CNP;
	}

	public String getSex() {
		return sex;
	}

	public Date getDeceaseDate() {
		return deceaseDate;
	}

	public void setDeceaseDate(Date deceaseDate) {
		this.deceaseDate = deceaseDate;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getBirthDateString(){
		return birthDate.toString();
	}

	public String getDeceaseDateString(){
		if(deceaseDate == null)
			return "-";
		else
			return deceaseDate.toString();
	}

	public Address getAddress() {
		return address;
	}

	public int getPERSON_ID() {
		return PERSON_ID;
	}
}
