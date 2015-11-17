package medproject.medlibrary.account;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6667759883103529007L;
	/**
	 * 
	 */
	private int accountID;
	private final String username;
	private final String encryptedPassword;
	private final String encryptedKey;
	private String securityQuestion;
	private String securityAnswer;
	
	public Account(String username, String encryptedPassword,
			String encryptedKey, String securityQuestion, String securityAnswer) {
		this.username = username;
		this.encryptedPassword = encryptedPassword;
		this.encryptedKey = encryptedKey;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}

	public Account(int accountID, String username, String encryptedPassword) {
		this.accountID = accountID;
		this.username = username;
		this.encryptedKey = encryptedPassword;
		this.encryptedPassword = "unset";
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
