package medproject.medlibrary.graphics.structures;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import medproject.medlibrary.medication.Medication;

public class MedicationTableView extends TableView<Medication>{

	public MedicationTableView(){
		setColumns();
		setEditable(false);
	}
	
	private void setColumns(){
		TableColumn<Medication, Integer> idColumn = new TableColumn<Medication, Integer>("Cod Diagnostic");
		idColumn.setCellValueFactory(new Callback<CellDataFeatures<Medication, Integer>, ObservableValue<Integer>>() {
		     public ObservableValue<Integer> call(CellDataFeatures<Medication, Integer> p) {
		         return new ReadOnlyObjectWrapper<Integer>(p.getValue().getDiagnosisID());
		     }
		  });
		getColumns().add(idColumn);
		
		TableColumn<Medication, String> nameColumn = new TableColumn<Medication, String>("Denumire");
		nameColumn.setCellValueFactory(new Callback<CellDataFeatures<Medication, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Medication, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getDrugName());
		     }
		  });
		getColumns().add(nameColumn);
		
		TableColumn<Medication, Integer> quantityColumn = new TableColumn<Medication, Integer>("Cantitate");
		quantityColumn.setCellValueFactory(new Callback<CellDataFeatures<Medication, Integer>, ObservableValue<Integer>>() {
		     public ObservableValue<Integer> call(CellDataFeatures<Medication, Integer> p) {
		         return new ReadOnlyObjectWrapper<Integer>(p.getValue().getQuantity());
		     }
		  });
		getColumns().add(quantityColumn);
		
		TableColumn<Medication, Integer> dayCountColumn = new TableColumn<Medication, Integer>("Nr. Zile");
		dayCountColumn.setCellValueFactory(new Callback<CellDataFeatures<Medication, Integer>, ObservableValue<Integer>>() {
		     public ObservableValue<Integer> call(CellDataFeatures<Medication, Integer> p) {
		         return new ReadOnlyObjectWrapper<Integer>(p.getValue().getDayCount());
		     }
		  });
		getColumns().add(dayCountColumn);
		
		TableColumn<Medication, String> administrationTypeColumn = new TableColumn<Medication, String>("Mod Administrare");
		administrationTypeColumn.setCellValueFactory(new Callback<CellDataFeatures<Medication, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Medication, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getType().toString());
		     }
		  });
		getColumns().add(administrationTypeColumn);
		
		TableColumn<Medication, String> schemaColumn = new TableColumn<Medication, String>("Schema Tratament");
		schemaColumn.setCellValueFactory(new Callback<CellDataFeatures<Medication, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Medication, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getScheme().toString());
		     }
		  });
		getColumns().add(schemaColumn);
		

		TableColumn<Medication, String> observationsColumn = new TableColumn<Medication, String>("Observatii");
		observationsColumn.setCellValueFactory(new Callback<CellDataFeatures<Medication, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<Medication, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getObservations());
		     }
		  });
		getColumns().add(observationsColumn);
	}
	
	public Medication getSelectedDiagnosis(){
		return getSelectionModel().getSelectedItem();
	}

}
