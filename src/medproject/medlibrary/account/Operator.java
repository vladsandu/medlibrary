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
	private final int operatorType;
	
	public Operator(int operatorID, String username, int operatorType) {
		this.operatorID = operatorID;
		this.username = username;
		this.operatorType = operatorType;
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

	public String getUsername() {
		return username;
	}

	public int getOperatorType() {
		return operatorType;
	}

	public int getOperatorID() {
		return operatorID;
	}
}
