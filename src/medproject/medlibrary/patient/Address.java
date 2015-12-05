package medproject.medlibrary.patient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = 1L;

	private final int personID;
	private String county, city, street;

	public Address(int id, String county, String city, String street) {
		this.personID = id;
		this.county = county;
		this.city = city;
		this.street = street;
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

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPersonID() {
		return personID;
	}
}
