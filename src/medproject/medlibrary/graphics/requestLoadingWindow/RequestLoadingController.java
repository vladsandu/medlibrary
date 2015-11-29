package medproject.medlibrary.graphics.requestLoadingWindow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class RequestLoadingController {

	
	@FXML Label messageLabel;
	@FXML ProgressBar loadingBar;
	
	public void initialize(String message){
		messageLabel.setText(message);
		loadingBar.setProgress(ProgressIndicator.INDETERMINATE_PROGRESS);
	}
}
