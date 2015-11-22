package medproject.medlibrary.patient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public enum PatientStatus{
	ASIGURAT;
	
	public static PatientStatus getStatusByID(int id){
		return ASIGURAT;
	}
}
