package medproject.medlibrary.account;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LoginStructure implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String username;
	private final String encrypted_password;
	private final int operatorType;
	
	public LoginStructure(String username, String encrypted_password, int operatorType) {
		this.operatorType = operatorType;
		this.username = username;
		this.encrypted_password = encrypted_password;
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
	
	public String getUsername() {
		return username;
	}
	
	public String getEncrypted_password() {
		return encrypted_password;
	}

	public int getOperatorType() {
		return operatorType;
	}
}
