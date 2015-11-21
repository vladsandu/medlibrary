package medproject.medlibrary.concurrency;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Request implements Serializable{

	private static final long serialVersionUID = 1L;

	private final int REQUEST_CODE;
	private Object DATA;
	private RequestStatus status;
	private boolean waitForReply;
	private String message;
	//TODO: request_code and status - enum
	
	
	public Request(int REQUEST_CODE, Object data) {
		this.REQUEST_CODE = REQUEST_CODE;
		this.DATA = data;
		this.status = RequestStatus.REQUEST_NEW;
		message = null;
		waitForReply = true;
	}

	public boolean isCompleted(){
		if(status == RequestStatus.REQUEST_COMPLETED ||
				status == RequestStatus.REQUEST_FAILED)
			return true;
		return false;
	}
	
	public int getREQUEST_CODE() {
		return REQUEST_CODE;
	}

	public Object getDATA() {
		return DATA;
	}

	public void setDATA(Object dATA) {
		DATA = dATA;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public boolean isWaitForReply() {
		return waitForReply;
	}

	public Request setWaitForReply(boolean waitForReply) {
		this.waitForReply = waitForReply;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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
}
