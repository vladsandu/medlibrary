package medproject.medlibrary.account;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Operator implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6667759883103529007L;
	/**
	 * 
	 */
	private final int operatorID;
	private final String username;
	private final String encryptedPassword;
	
	public Operator(int operatorID, String username, String encryptedPassword) {
		this.operatorID = operatorID;
		this.username = username;
		this.encryptionKey = "unset";
		this.encryptedPassword = encryptedPassword;
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

	boolean isValid(){
		return true;	
	}

	public Integer getAccountID() {
		return accountID;
	}

	public String getUsername() {
		return username;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public String getEncryptedKey() {
		return encryptedKey;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
}
