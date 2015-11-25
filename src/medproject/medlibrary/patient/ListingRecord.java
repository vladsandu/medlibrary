package medproject.medlibrary.patient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

public class ListingRecord implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Date enlistingDate;
	private Date delistingDate;
	private boolean enlisted;
	
	public ListingRecord(Date enlistingDate, Date delistingDate, boolean enlisted) {
		super();
		this.enlistingDate = enlistingDate;
		this.delistingDate = delistingDate;
		this.enlisted = enlisted;
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


	public Date getDelistingDate() {
		return delistingDate;
	}

	public void setDelistingDate(Date delistingDate) {
		this.delistingDate = delistingDate;
	}

	public boolean isEnlisted() {
		return enlisted;
	}

	public void setEnlisted(boolean enlisted) {
		this.enlisted = enlisted;
	}

	public Date getEnlistingDate() {
		return enlistingDate;
	}
	
	public String getDelistingDateString(){
		if(delistingDate == null)
			return "-";
		else
			return delistingDate.toString();
	}
	
	public String getEnlistingDateString(){
		return enlistingDate.toString();
	}
}
