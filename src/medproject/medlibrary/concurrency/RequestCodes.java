package medproject.medlibrary.concurrency;

public class RequestCodes {
	//TODO: enums requestCodes and requestType; REFACTOR ALL THIS
	public static final int LOGIN_TYPE_REQUEST = 0;
	public static final int PATIENT_TYPE_REQUEST = 1;
	public static final int EXAMINATION_TYPE_REQUEST = 2;
	public static final int DIAGNOSIS_TYPE_REQUEST = 3;
	public static final int PRESCRIPTION_TYPE_REQUEST = 4;
	public static final int MEDICATION_TYPE_REQUEST = 5;
	
	public static final int EMPTY_REQUEST = -1;
	public static final int LOGIN_REQUEST = 1;
	public static final int PATIENT_LIST_REQUEST = 2;
	public static final int PATIENT_RECORD_BY_CNP_REQUEST = 3;
	public static final int ADD_PATIENT_REQUEST = 4;
	public static final int UPDATE_PATIENT_ADDRESS_REQUEST = 5;
	public static final int DELETE_PATIENT_REQUEST = 6;
	public static final int UNREGISTER_PATIENT_REQUEST = 7;
	public static final int REGISTER_PATIENT_REQUEST = 8;
	public static final int DECEASED_PATIENT_REQUEST = 9;

	public static final int EXAMINATION_LIST_REQUEST = 10;
	public static final int DIAGNOSIS_LIST_REQUEST = 11;
	
	public static final int PRESCRIPTION_LIST_REQUEST = 12;
	public static final int DIAGNOSIS_INFO_LIST_REQUEST = 13;
	public static final int DRUG_LIST_REQUEST = 14;
	public static final int MEDICATION_LIST_REQUEST = 15;
	

	public static final int ADD_EXAMINATION_REQUEST = 16;
	
	public static int getRequestType(Request request){
		if(request.getREQUEST_CODE() == LOGIN_REQUEST)
			return LOGIN_TYPE_REQUEST;
		
		else if(request.getREQUEST_CODE() == PATIENT_LIST_REQUEST ||
				request.getREQUEST_CODE() == PATIENT_RECORD_BY_CNP_REQUEST ||
				request.getREQUEST_CODE() == ADD_PATIENT_REQUEST ||
				request.getREQUEST_CODE() == UPDATE_PATIENT_ADDRESS_REQUEST ||
				request.getREQUEST_CODE() == DELETE_PATIENT_REQUEST ||
				request.getREQUEST_CODE() == REGISTER_PATIENT_REQUEST ||
				request.getREQUEST_CODE() == UNREGISTER_PATIENT_REQUEST ||
				request.getREQUEST_CODE() == DECEASED_PATIENT_REQUEST)
			return PATIENT_TYPE_REQUEST;
		
		else if(request.getREQUEST_CODE() == EXAMINATION_LIST_REQUEST ||
				request.getREQUEST_CODE() == ADD_EXAMINATION_REQUEST)
			return EXAMINATION_TYPE_REQUEST;

		else if(request.getREQUEST_CODE() == DIAGNOSIS_LIST_REQUEST ||
				request.getREQUEST_CODE() == DIAGNOSIS_INFO_LIST_REQUEST)
			return DIAGNOSIS_TYPE_REQUEST;

		else if(request.getREQUEST_CODE() == PRESCRIPTION_LIST_REQUEST)
			return PRESCRIPTION_TYPE_REQUEST;
		else if(request.getREQUEST_CODE() == DRUG_LIST_REQUEST ||
				request.getREQUEST_CODE() == MEDICATION_LIST_REQUEST)
			return MEDICATION_TYPE_REQUEST;
		
		return -1;
	}
}
