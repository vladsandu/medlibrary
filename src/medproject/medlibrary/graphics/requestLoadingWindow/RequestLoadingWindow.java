package medproject.medlibrary.graphics.requestLoadingWindow;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import medproject.medlibrary.logging.LogWriter;

public class RequestLoadingWindow {
	//TODO: Refactor
	private final Logger LOG = LogWriter.getLogger(this.getClass().getName());
	
	private String message;
	private Stage loadingWindow;
	
	public RequestLoadingWindow(String message) {
		this.message = message;
	}

	private void initializeWindow(){
		loadingWindow = new Stage();
		loadingWindow.setTitle("Incarcare");//TODO: Constants class refactoring
		loadingWindow.initModality(Modality.APPLICATION_MODAL);
		loadingWindow.initStyle(StageStyle.UTILITY);
		loadingWindow.setResizable(false);
		
		loadingWindow.setOnCloseRequest(new EventHandler<WindowEvent>() {
			public void handle(WindowEvent we) {
				stop();
			}
		});  
		
		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("./RequestLoadingScene.fxml"));
			Pane pane = (Pane) loader.load();
			Scene scene = new Scene(pane);
			loadingWindow.setScene(scene);
			RequestLoadingController controller = (RequestLoadingController)loader.getController();
			controller.initialize(message);
		} catch (IOException e) {
			LOG.severe("Couldn't find request loading scene: " + e.getMessage());
		}
	}

	public void start(){
		runAndWait(new Runnable(){

			@Override
			public void run() {
				initializeWindow();
				loadingWindow.show();
			}
		});    
	}

	public void stop(){
		runAndWait(new Runnable(){

			@Override
			public void run() {
				loadingWindow.close();
			}
		});    
	}


	public void runAndWait(final Runnable runnable) {
		if (Platform.isFxApplicationThread()) {
			runnable.run();
			return;
		}

		try {
			FutureTask<Void> future = new FutureTask<>(runnable, null);
			Platform.runLater(future);
			future.get();
		}
		catch (InterruptedException | ExecutionException e) {
			LOG.severe("Couldn't process request on JavaFX thread: " + e.getMessage());
		}
	}
}
