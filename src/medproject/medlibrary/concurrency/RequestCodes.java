package medproject.medlibrary.concurrency;

public class RequestCodes {
//gonna be an enum that returns values. and in dataLoader if it returns value 1 it's profilerequest
	//if it returns value 2 it's ... statusrequest
	public static final int REQUEST_PENDING = 0;
	public static final int REQUEST_SUCCESSFUL = 1;
	public static final int REQUEST_FAILED = 2;
	public static final int REQUEST_COMPLETE = 3;
	public static final int REQUEST_UNAUTHORIZED = 4;
	public static final int REQUEST_TERMINATED = 5;

	public static final int LOGIN_TYPE_REQUEST = 0;
	public static final int PROFILE_TYPE_REQUEST = 1;
	public static final int STATUS_TYPE_REQUEST = 2;
	public static final int REGISTRATION_TYPE_REQUEST = 3;
	public static final int FRIEND_GROUP_TYPE_REQUEST = 4;
	public static final int FRIEND_TYPE_REQUEST = 5;
	public static final int SEARCH_TYPE_REQUEST = 6;
	public static final int NOTIFICATION_TYPE_REQUEST = 7;
	public static final int MESSAGE_TYPE_REQUEST = 8;
	
	public static final int EMPTY_REQUEST = 0;
	public static final int LOGIN_ENCRYPTION_CODE = 1;
	public static final int USERNAME_AVAILABILITY_REQUEST = 2;
	public static final int LOGIN_REQUEST = 3;
	
	public static final int ACCOUNT_REGISTRATION_REQUEST = 4;
	public static final int PROFILE_CREATION_REQUEST = 5;
	public static final int STATUS_CREATION_REQUEST = 6;
	public static final int ACCOUNT_ID_SELECTION_REQUEST = 7;
	
	public static final int PROFILE_DISPLAY_NAME_CHANGE = 8;
	public static final int PROFILE_DISPLAY_IMAGE_CHANGE_REQUEST = 9;
	public static final int PROFILE_FETCH_REQUEST = 10;
	public static final int PROFILE_DISPLAY_IMAGE_FETCH_REQUEST = 11;
	
	public static final int LAST_STATUS_FETCH_REQUEST = 12;
	public static final int STATUS_UPDATE_REQUEST = 13;
	
	public static final int FRIEND_INFORMATION_REQUEST = 14;
	public static final int FRIEND_LIST_REQUEST = 15;
	public static final int FRIEND_ADD_REQUEST = 16;
	public static final int FRIEND_REQUEST_REQUEST = 17;
	public static final int FRIEND_REQUEST_UPDATE_REQUEST = 18;
	public static final int FRIEND_REQUEST_DELETE_REQUEST = 19;
	public static final int FRIEND_REQUEST_NOTIFY_REQUEST = 20;
	public static final int FRIEND_REQUEST_INFORMATION_REQUEST = 21;
	
	public static final int FRIEND_GROUPS_INFORMATION_REQUEST = 22;
	public static final int FRIEND_GROUP_ADD_REQUEST = 23;
	public static final int DEFAULT_FRIEND_GROUP_ADD_REQUEST = 24;
	
	public static final int SEARCH_CONTACT_INFORMATION_REQUEST = 25;

	public static final int NOTIFICATION_FRIEND_REQUEST = 26;
	public static final int NOTIFICATION_FRIEND_ADD = 27;
	public static final int NOTIFICATION_STATUS_CHANGE = 28;
	public static final int NOTIFICATION_MESSAGE_RECEIVED = 29;
	
	public static final int RECENT_MESSAGES_REQUEST = 30;
	public static final int OFFLINE_MESSAGES_REQUEST = 31;
	public static final int MESSAGE_INSERT_REQUEST = 32;
	public static final int MESSAGE_STATUS_UPDATE_REQUEST = 33;
	public static final int LOG_OFF_REQUEST = 34;
	
	public static int requestTypeGetter(Request request){
		if(request.getREQUEST_CODE() == LOGIN_REQUEST ||
				request.getREQUEST_CODE() == LOGIN_ENCRYPTION_CODE)
			return LOGIN_TYPE_REQUEST;
		
		if(request.getREQUEST_CODE() == USERNAME_AVAILABILITY_REQUEST ||
				request.getREQUEST_CODE() == ACCOUNT_REGISTRATION_REQUEST ||
				request.getREQUEST_CODE() == PROFILE_CREATION_REQUEST ||
				request.getREQUEST_CODE() == STATUS_CREATION_REQUEST ||
				request.getREQUEST_CODE() == ACCOUNT_ID_SELECTION_REQUEST ||
				request.getREQUEST_CODE() == DEFAULT_FRIEND_GROUP_ADD_REQUEST)
			return REGISTRATION_TYPE_REQUEST;
		
		if(request.getREQUEST_CODE() == PROFILE_DISPLAY_NAME_CHANGE ||
				request.getREQUEST_CODE() == PROFILE_DISPLAY_IMAGE_CHANGE_REQUEST ||
				request.getREQUEST_CODE() == PROFILE_FETCH_REQUEST ||
				request.getREQUEST_CODE() == PROFILE_DISPLAY_IMAGE_FETCH_REQUEST)
			return PROFILE_TYPE_REQUEST;
		
		if(request.getREQUEST_CODE() == LAST_STATUS_FETCH_REQUEST ||
				request.getREQUEST_CODE() == STATUS_UPDATE_REQUEST)
			return STATUS_TYPE_REQUEST;
		
		if(request.getREQUEST_CODE() == FRIEND_GROUPS_INFORMATION_REQUEST ||
				request.getREQUEST_CODE() == FRIEND_GROUP_ADD_REQUEST)
			return FRIEND_GROUP_TYPE_REQUEST;
		
		if(request.getREQUEST_CODE() == FRIEND_LIST_REQUEST ||
				request.getREQUEST_CODE() == FRIEND_REQUEST_REQUEST ||
				request.getREQUEST_CODE() == FRIEND_REQUEST_UPDATE_REQUEST ||
				request.getREQUEST_CODE() == FRIEND_REQUEST_DELETE_REQUEST ||
				request.getREQUEST_CODE() == FRIEND_REQUEST_NOTIFY_REQUEST ||
				request.getREQUEST_CODE() == FRIEND_REQUEST_INFORMATION_REQUEST)
			return FRIEND_TYPE_REQUEST;
		
		if(request.getREQUEST_CODE() == SEARCH_CONTACT_INFORMATION_REQUEST)
			return SEARCH_TYPE_REQUEST;
		
		if(request.getREQUEST_CODE() == NOTIFICATION_FRIEND_REQUEST ||
				request.getREQUEST_CODE() == NOTIFICATION_FRIEND_ADD ||
				request.getREQUEST_CODE() == NOTIFICATION_STATUS_CHANGE ||
				request.getREQUEST_CODE() == NOTIFICATION_MESSAGE_RECEIVED)
			return NOTIFICATION_TYPE_REQUEST;
	
		if(request.getREQUEST_CODE() == RECENT_MESSAGES_REQUEST ||
				request.getREQUEST_CODE() == MESSAGE_INSERT_REQUEST ||
				request.getREQUEST_CODE() == OFFLINE_MESSAGES_REQUEST)
			return MESSAGE_TYPE_REQUEST;
		
		return -1;
	}
}
