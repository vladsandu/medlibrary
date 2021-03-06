package medproject.medlibrary.patient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

public class PatientRecord implements Serializable{

	private static final long serialVersionUID = 1L;
	private final int PERSON_ID;
	private final String CNP;
	private String firstName;
	private String lastName;
	private final Gender sex;
	private final Date birthDate;
	private Date deceaseDate;
	private String nationality;
	private BloodType bloodType;
	private RHType rhType;
	
	private PatientCategory category;
	private PatientStatus status;

	private Address address;
	//TODO: Refactor
	public PatientRecord(int PERSON_ID, Address address, String CNP, String firstName, String lastName, Gender sex, Date birthDate,
			Date deceaseDate,String nationality, PatientCategory category, PatientStatus status, BloodType bloodType, RHType rhType) {
		this.PERSON_ID = PERSON_ID;
		this.CNP = CNP;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.birthDate = birthDate;
		this.status = status;
		this.category = category;
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

	public RHType getRhType() {
		return rhType;
	}

	public void setRhType(RHType rhType) {
		this.rhType = rhType;
	}

	public String getCNP() {
		return CNP;
	}

	public Gender getSex() {
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

	public void setAddress(Address newAddress) {
		this.address.setCounty(newAddress.getCounty());
		this.address.setCity(newAddress.getCity());
		this.address.setStreet(newAddress.getStreet());
	}
	
	public boolean isInsured(){
		if(status == PatientStatus.ASIGURAT)
			return true;
		else
			return false;
	}
	
	public String getFullName(){
		return firstName + " " + lastName; 
	}
}
