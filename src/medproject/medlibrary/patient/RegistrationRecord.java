package medproject.medlibrary.patient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

public class RegistrationRecord implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Date registrationDate;
	private Date unregistrationDate;
	private boolean registered;

	public RegistrationRecord(Date registrationDate, Date unregistrationDate, boolean registered) {
		this.registrationDate = registrationDate;
		this.unregistrationDate = unregistrationDate;
		this.registered = registered;
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

	public String getUnregistrationDateString(){
		if(unregistrationDate == null)
			return "-";
		else
			return unregistrationDate.toString();
	}
	
	public String getRegistrationDateString(){
		return registrationDate.toString();
	}

	public Date getUnregistrationDate() {
		return unregistrationDate;
	}

	public void setUnregistrationDate(Date unregistrationDate) {
		this.unregistrationDate = unregistrationDate;
	}
	
	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}
}
