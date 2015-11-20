package medproject.medlibrary.concurrency;

public class RequestCodes {
	public static final int LOGIN_TYPE_REQUEST = 0;
	
	public static final int EMPTY_REQUEST = 0;
	
	public static final int OPERATOR_LOOKUP_REQUEST = 1;
	public static final int LOGIN_REQUEST = 3;
		
	public static int getRequestType(Request request){
		if(request.getREQUEST_CODE() == LOGIN_REQUEST ||
				request.getREQUEST_CODE() == OPERATOR_LOOKUP_REQUEST)
			return LOGIN_TYPE_REQUEST;
	
		return -1;
	}
}
