package medproject.medlibrary.concurrency;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Request implements Serializable{

	private static final long serialVersionUID = 1L;

	private final int REQUEST_CODE;
	private final Object DATA;
	private RequestStatus status;
	private boolean waitForReply = true;
	//TODO: request_code and status - enum
	public Request(int REQUEST_CODE, Object data, RequestStatus status) {
		this.REQUEST_CODE = REQUEST_CODE;
		this.DATA = data;
		this.status = status;
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

	public Object getData() {
		return DATA;
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

	public void setWaitForReply(boolean waitForReply) {
		this.waitForReply = waitForReply;
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
