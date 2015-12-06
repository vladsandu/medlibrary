package medproject.medlibrary.graphics.structures;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import medproject.medlibrary.diagnosis.DiagnosisInfo;
import medproject.medlibrary.examination.Examination;

public class DiagnosisInfoTableView extends TableView<DiagnosisInfo>{

	public DiagnosisInfoTableView(){
		setColumns();
		setEditable(false);
	}
	
	private void setColumns(){
		TableColumn<DiagnosisInfo, Integer> idColumn = new TableColumn<DiagnosisInfo, Integer>("Cod");
		idColumn.setCellValueFactory(new Callback<CellDataFeatures<DiagnosisInfo, Integer>, ObservableValue<Integer>>() {
		     public ObservableValue<Integer> call(CellDataFeatures<DiagnosisInfo, Integer> p) {
		         return new ReadOnlyObjectWrapper<Integer>(p.getValue().getID());
		     }
		  });
		getColumns().add(idColumn);
		
		TableColumn<DiagnosisInfo, String> nameColumn = new TableColumn<DiagnosisInfo, String>("Denumire");
		nameColumn.setCellValueFactory(new Callback<CellDataFeatures<DiagnosisInfo, String>, ObservableValue<String>>() {
		     public ObservableValue<String> call(CellDataFeatures<DiagnosisInfo, String> p) {
		         return new ReadOnlyObjectWrapper<String>(p.getValue().getName());
		     }
		  });
		getColumns().add(nameColumn);
	}
	
	public DiagnosisInfo getSelectedDiagnosis(){
		return getSelectionModel().getSelectedItem();
	}

}
