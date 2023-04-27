package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

import com.cytech.Poubelle.*;
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
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;


public class PageDeCompteController {
	@FXML
    private TableView<Depot> DepotTable;
    @FXML
    private TableColumn<Depot, String> identifiantColumn;
    @FXML
    private TableColumn<Depot, String> quartierColumn;

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
    private Label quartier;
    
private HomeController homeController;


public PageDeCompteController() {
}

@FXML
private void initialize() {
	// Initialize the person table with the two columns.
    identifiantColumn.setCellValueFactory(cellData -> cellData.getValue().identifiantProperty());
    quartierColumn.setCellValueFactory(cellData -> cellData.getValue().toString(getNbDechets()));
}

/**
 * Is called by the HomeController to give a reference back to itself.
 * 
 * @param homeController
 */
public void setHomeController(HomeController homeController) {
    this.homeController = homeController;

    // Add observable list data to the table
    depotTable.setItems(homeController.getDepotData());
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
