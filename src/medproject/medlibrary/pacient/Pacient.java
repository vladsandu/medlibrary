package medproject.medlibrary.pacient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pacient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int PID;
	private final int CNP;
	private String nume, prenume;
	private final String GEN;
	private final String DATA_NASTERE;
	private String cetatenie;
	private Adresa adresa;
	private int categorie;
	private final String DATA_INSCRIERE;
	private String DATA_IESIRE, DATA_DECES;
	private int STARE_ASIGURAT;
	//	GRUPA_SANGUINA//
	//RH//
	public Pacient(int PID, int CNP, String nume, String prenume, String GEN, String DATA_NASTERE, String cetatenie,
			Adresa adresa, int categorie, String DATA_INSCRIERE,
			int STARE_ASIGURAT) {
		this.PID = PID;
		this.CNP = CNP;
		this.nume = nume;
		this.prenume = prenume;
		this.GEN = GEN;
		this.DATA_NASTERE = DATA_NASTERE;
		this.cetatenie = cetatenie;
		this.categorie = categorie;
		this.adresa = adresa; 	
		this.DATA_INSCRIERE = DATA_INSCRIERE;
		this.STARE_ASIGURAT = STARE_ASIGURAT;
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

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getCetatenie() {
		return cetatenie;
	}
	public void setCetatenie(String cetatenie) {
		this.cetatenie = cetatenie;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	public int getCategorie() {
		return categorie;
	}
	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}
	public String getDATA_IESIRE() {
		return DATA_IESIRE;
	}
	public void setDATA_IESIRE(String dATA_IESIRE) {
		DATA_IESIRE = dATA_IESIRE;
	}
	public String getDATA_DECES() {
		return DATA_DECES;
	}
	public void setDATA_DECES(String dATA_DECES) {
		DATA_DECES = dATA_DECES;
	}
	public int getSTARE_ASIGURAT() {
		return STARE_ASIGURAT;
	}
	public void setSTARE_ASIGURAT(int sTARE_ASIGURAT) {
		STARE_ASIGURAT = sTARE_ASIGURAT;
	}
	public int getPID() {
		return PID;
	}
	public int getCNP() {
		return CNP;
	}
	public String getGEN() {
		return GEN;
	}
	public String getDATA_NASTERE() {
		return DATA_NASTERE;
	}
	public String getDATA_INSCRIERE() {
		return DATA_INSCRIERE;
	}
}
