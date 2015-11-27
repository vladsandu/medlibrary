package medproject.medlibrary.concurrency;

import java.util.concurrent.CountDownLatch;

import javafx.concurrent.Task;

public abstract class CustomTask implements Runnable{

	protected Object data;
	private final int requestCode;
	private final CountDownLatch latch;
	
	public CustomTask(int requestCode) {
		this.requestCode = requestCode;
		this.latch = new CountDownLatch(1);
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
	
	
}
