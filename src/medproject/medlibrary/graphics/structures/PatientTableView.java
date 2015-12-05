package medproject.medlibrary.graphics.structures;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import medproject.medlibrary.patient.Patient;

public class PatientTableView extends TableView<Patient>{

	public PatientTableView(){
		setColumns();
		setEditable(false);
	}

	private void setColumns(){	

		TableColumn<Patient, String> cnpColumn = new TableColumn<Patient, String>("CNP");
		cnpColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getCNP());
			}
		});	
		
		getColumns().add(cnpColumn);

		TableColumn<Patient, String> firstNameColumn = new TableColumn<Patient, String>("Nume");
		firstNameColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getFirstName());
			}
		});
		getColumns().add(firstNameColumn);

		TableColumn<Patient, String> lastNameColumn = new TableColumn<Patient, String>("Prenume");
		lastNameColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getLastName());
			}
		});
		getColumns().add(lastNameColumn);

		TableColumn<Patient, String> genderColumn = new TableColumn<Patient, String>("Sex");
		genderColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getSex().toString());
			}
		});
		getColumns().add(genderColumn);

		TableColumn<Patient, String> categoryColumn = new TableColumn<Patient, String>("Categorie");
		categoryColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getCategory().toString());
			}
		});
		getColumns().add(categoryColumn);

		TableColumn<Patient, String> birthDateColumn = new TableColumn<Patient, String>("Data Nastere");
		birthDateColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getBirthDateString());
			}
		});
		getColumns().add(birthDateColumn);

		TableColumn<Patient, String> deceaseDateColumn = new TableColumn<Patient, String>("Data Deces");
		deceaseDateColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getDeceaseDateString());
			}
		});
		getColumns().add(deceaseDateColumn);

		TableColumn<Patient, String> registrationDateColumn = new TableColumn<Patient, String>("Data Inscriere");
		registrationDateColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getRegistrationRecord().getRegistrationDateString());
			}
		});
		getColumns().add(registrationDateColumn);

		TableColumn<Patient, String> unregistrationDateColumn = new TableColumn<Patient, String>("Data Iesire");
		unregistrationDateColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getRegistrationRecord().getUnregistrationDateString());
			}
		});
		getColumns().add(unregistrationDateColumn);

		TableColumn<Patient, String> countyColumn = new TableColumn<Patient, String>("Judet");
		countyColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getAddress().getCounty());
			}
		});
		getColumns().add(countyColumn);

		TableColumn<Patient, String> cityColumn = new TableColumn<Patient, String>("Localitate");
		cityColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getAddress().getCity());
			}
		});
		getColumns().add(cityColumn);

		TableColumn<Patient, String> streetColumn = new TableColumn<Patient, String>("Strada");
		streetColumn.setCellValueFactory(new Callback<CellDataFeatures<Patient, String>, ObservableValue<String>>() {
			public ObservableValue<String> call(CellDataFeatures<Patient, String> p) {
				return new ReadOnlyObjectWrapper<String>(p.getValue().getPatientRecord().getAddress().getStreet());
			}
		});
		getColumns().add(streetColumn);
	}

	public Patient getSelectedPatient(){
		return getSelectionModel().getSelectedItem();
	}
}
