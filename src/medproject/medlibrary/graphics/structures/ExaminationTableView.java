package medproject.medlibrary.graphics.structures;

import java.util.List;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import medproject.medlibrary.examination.Examination;

public class ExaminationTableView extends TableView<Examination>{

	public ExaminationTableView(){
		setColumns();
		setEditable(false);
	}
	
	private void setColumns(){
		TableColumn<Examination, Integer> idColumn = new TableColumn<Examination, Integer>("ID Consultatie");
		idColumn.setCellValueFactory(new Callback<CellDataFeatures<Examination, Integer>, ObservableValue<Integer>>() {
		     public ObservableValue<Integer> call(CellDataFeatures<Examination, Integer> p) {
		         return new ReadOnlyObjectWrapper<Integer>(p.getValue().getExaminationID());
		     }
		  });
		getColumns().add(idColumn);
		
		TableColumn<Examination, String> dateColumn = new TableColumn<Examination, String>("Data Consultatie");
		dateColumn.setCellValueFactory(new Callback<CellDataFeatures<Examination, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Examination, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getExaminationDate().toString());
		     }
		  });
		getColumns().add(dateColumn);
		
		TableColumn<Examination, String> patientColumn = new TableColumn<Examination, String>("Nume Pacient");
		patientColumn.setCellValueFactory(new Callback<CellDataFeatures<Examination, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Examination, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientName());
		     }
		  });
		getColumns().add(patientColumn);
		
		TableColumn<Examination, String> typeColumn = new TableColumn<Examination, String>("Tip Consultatie");
		typeColumn.setCellValueFactory(new Callback<CellDataFeatures<Examination, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Examination, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getExaminationType().toString());
		     }
		  });
		getColumns().add(typeColumn);
		
		TableColumn<Examination, String> diagnosisColumn = new TableColumn<Examination, String>("Diagnostic");
		diagnosisColumn.setCellValueFactory(new Callback<CellDataFeatures<Examination, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Examination, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getMainDiagnosisName());
		     }
		  });
		getColumns().add(diagnosisColumn);
		
		TableColumn<Examination, String> cnpColumn = new TableColumn<Examination, String>("CNP");
		cnpColumn.setCellValueFactory(new Callback<CellDataFeatures<Examination, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Examination, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientCNP());
		     }
		  });
		getColumns().add(cnpColumn);
		
		TableColumn<Examination, String> observationsColumn = new TableColumn<Examination, String>("Observatii");
		observationsColumn.setCellValueFactory(new Callback<CellDataFeatures<Examination, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Examination, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getObservations());
		     }
		  });
		getColumns().add(observationsColumn);
		
		TableColumn<Examination, String> medicColumn = new TableColumn<Examination, String>("Medic");		
	}
	
	public Examination getSelectedExamination(){
		return getSelectionModel().getSelectedItem();
	}

}
