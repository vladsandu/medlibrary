package medproject.medlibrary.concurrency;

import java.util.concurrent.CountDownLatch;

import medproject.medlibrary.graphics.requestLoadingWindow.RequestLoadingWindow;

public abstract class CustomTask implements Runnable{

	protected Object data;
	private final int requestCode;
	protected RequestStatus requestStatus;
	private final CountDownLatch latch;
	protected final RequestLoadingWindow loadingWindow;
	
	public CustomTask(int requestCode, String message) {
		this.requestCode = requestCode;
		this.latch = new CountDownLatch(1);
		this.requestStatus = RequestStatus.REQUEST_PENDING;
		this.loadingWindow = new RequestLoadingWindow(message);
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getRequestCode() {
		return requestCode;
	}

	public CountDownLatch getLatch() {
		return latch;
	}

	public RequestStatus getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(RequestStatus requestStatus) {
		this.requestStatus = requestStatus;
	}
}
