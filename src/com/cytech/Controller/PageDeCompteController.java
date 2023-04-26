package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

import com.cytech.Menage.MenageCompte;
import com.cytech.Poubelle.Bac;
import com.cytech.Poubelle.Poubelle;
import com.cytech.Menage.CorbeilleOperation;
import com.cytech.Main.Main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;
import java.util.Scanner;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.io.FileNotFoundException;

public class PageDeCompteController {
	private ObservableList<CorbeilleOperation> operationData = FXCollections.observableArrayList();
	@FXML
    private TableView<CorbeilleOperation> CorbeilleOperationTable;
    @FXML
    private TableColumn<CorbeilleOperation, String> identifiantColumn;
    @FXML
    private TableColumn<CorbeilleOperation, String> nbDechetsColumn;

    @FXML
    private Label identifiantLabel;
    @FXML
    private Label nbDechetsLabel;
    @FXML
    private Label quantiteLabel;
    @FXML
    private Label valeurVerIfierLabel;
    @FXML
    private Label couleurBacUtilise;
    @FXML
    private Label idDechet;
    
    @FXML
	private TextField ChampUsername;
	@FXML
	private TextField ChampPassword;



public PageDeCompteController() {
}

@FXML
private void initialize() {
	MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	Bac[] bacs = new Bac[4];
	 bacs[0] = new Bac(0, "jaune");
	 bacs[1] = new Bac(1, "vert");
	 bacs[2] = new Bac(2, "classique");
	 bacs[3] = new Bac(3, "bleu");
 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
 	LocalDate nvdate = LocalDate.of(2023,4,9);
    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",2);
    CorbeilleOperation o1 = new CorbeilleOperation(poubelle,compte1,1,0.5f, "plastique",nvdate, false, "bleu",10);
    CorbeilleOperation o2 = new CorbeilleOperation(poubelle,compte1,1,0.5f, "carton",nvdate, false, "vert",57);
    CorbeilleOperation o3 = new CorbeilleOperation(poubelle,compte1,1,0.5f, "metal",nvdate, false, "classique",77);
    CorbeilleOperation o4 = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "bleu",130);
    operationData.add(o);
	operationData.add(o1);
	operationData.add(o2);
	operationData.add(o3);
	operationData.add(o4);
	// Initialize the corbeilleOperation table with the two columns.
//    identifiantColumn.setCellValueFactory(cellData -> cellData.getValue().getMenageCompte().getIdentifiant()));
 //   nbDechetsColumn.setCellValueFactory(cellData -> cellData.getValue().toString(getNbDechets()));
}




@FXML
public void gestionBouton(ActionEvent e)throws IOException {
	
}
public void showOperationOverview() {
    try {
        // Load PageDeCompte
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("H:\\Documents\\GitHub\\JavaPrro\\src\\Views\\PageDeCompte.fxml"));
        AnchorPane operationOverview = (AnchorPane) loader.load();

        // Set PageDeCompte into the center of root layout.
   //     rootLayout.setCenter(operationOverview);

        // Give the controller access to the main.
        PageDeCompteController controller = loader.getController();
  //      controller.setMain(this);

    } catch (IOException e) {
        e.printStackTrace();
    }
}
// Pour page de compte 

public ObservableList<CorbeilleOperation> getOperationData() {
	return operationData;
}

public void setMain(Main main) {
  //  this.main = main;

    // Add observable list data to the table
//    CorbeilleOperationTable.setItems(main.getOperationData());
    
}


}