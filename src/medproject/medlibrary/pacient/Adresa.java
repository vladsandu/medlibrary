package medproject.medlibrary.pacient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Adresa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String judet, localitate, strada;

	public Adresa(String judet, String localitate) {
		this.judet = judet;
		this.localitate = localitate;
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

	public String getJudet() {
		return judet;
	}

	public void setJudet(String judet) {
		this.judet = judet;
	}

	public String getLocalitate() {
		return localitate;
	}

	public void setLocalitate(String localitate) {
		this.localitate = localitate;
	}

	public String getStrada() {
		return strada;
	}

	public void setStrada(String strada) {
		this.strada = strada;
	}

}
