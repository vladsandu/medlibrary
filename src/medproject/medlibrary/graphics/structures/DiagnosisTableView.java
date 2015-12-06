package medproject.medlibrary.graphics.structures;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import medproject.medlibrary.diagnosis.Diagnosis;

public class DiagnosisTableView extends TableView<Diagnosis>{

	public DiagnosisTableView(){
		setColumns();
		setEditable(false);
	}
	
	private void setColumns(){
		TableColumn<Diagnosis, Integer> idColumn = new TableColumn<Diagnosis, Integer>("Cod");
		idColumn.setCellValueFactory(new Callback<CellDataFeatures<Diagnosis, Integer>, ObservableValue<Integer>>() {
		     public ObservableValue<Integer> call(CellDataFeatures<Diagnosis, Integer> p) {
		         return new ReadOnlyObjectWrapper<Integer>(p.getValue().getDiagnosisInfo().getID());
		     }
		  });
		getColumns().add(idColumn);
		
		TableColumn<Diagnosis, String> nameColumn = new TableColumn<Diagnosis, String>("Denumire");
		nameColumn.setCellValueFactory(new Callback<CellDataFeatures<Diagnosis, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Diagnosis, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getDiagnosisInfo().getName());
		     }
		  });
		getColumns().add(nameColumn);
		
		TableColumn<Diagnosis, String> startDateColumn = new TableColumn<Diagnosis, String>("Data Inceput");
		startDateColumn.setCellValueFactory(new Callback<CellDataFeatures<Diagnosis, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Diagnosis, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getStartDateString());
		     }
		  });
		getColumns().add(startDateColumn);
		
		TableColumn<Diagnosis, String> endDateColumn = new TableColumn<Diagnosis, String>("Data Terminare");
		endDateColumn.setCellValueFactory(new Callback<CellDataFeatures<Diagnosis, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Diagnosis, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getEndDateString());
		     }
		  });
		getColumns().add(endDateColumn);
		
		TableColumn<Diagnosis, String> observationsColumn = new TableColumn<Diagnosis, String>("Observatii");
		observationsColumn.setCellValueFactory(new Callback<CellDataFeatures<Diagnosis, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Diagnosis, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getObservations());
		     }
		  });
		getColumns().add(observationsColumn);
	}
}
