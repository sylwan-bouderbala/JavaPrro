package com.cytech.Controller;

import java.io.IOException;

import com.cytech.Centre_tri.centre_tri;
import com.cytech.Poubelle.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import com.cytech.Menage.*;


public class PageDeCompteController {
	private MenageCompte compte;
	@FXML
    private TableView<Depot> DepotTable;
    @FXML
    private TableColumn<Depot, String> identifiantColumn;
    @FXML
    private TableColumn<Depot, String> quartierColumn;
    @FXML
    private TableColumn<Depot, String> quantiteColumn;
    @FXML
    private TableColumn<Depot, String> couleurColumn;
    @FXML
    private TableColumn<Depot, String> nbDechetColumn;

    @FXML
    private Label identifiantLabel;
    @FXML
    private Label quartier;
    @FXML
    private Label quantiteLabel;
    @FXML
    private Label nbDechetsLabel;
    @FXML
    private Label couleurBacUtilise;
    @FXML
    private Label valeurVerIfierLabel;

    
private HomeController homeController;


public PageDeCompteController() {
}

@FXML
private void initialize() {
	// Initialize the person table with the two columns.
    identifiantColumn.setCellValueFactory(cellData -> cellData.getValue().identifiantProperty().asString());
    quartierColumn.setCellValueFactory(cellData -> cellData.getValue().quartierProperty());
    quantiteColumn.setCellValueFactory(cellData -> cellData.getValue().quantiteProperty().asString());
    couleurColumn.setCellValueFactory(cellData -> cellData.getValue().couleurProperty());
    nbDechetColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty().asString());
}

/**
 * Is called by the HomeController to give a reference back to itself.
 * 
 * @param homeController
 */
public void setHomeController(HomeController homeController) {
    this.homeController = homeController;

    // Add observable list data to the table
    DepotTable.setItems(homeController.getDepotData());
}

public MenageCompte getMenageCompte() {
	return compte;
}
public void setMenageCompte(MenageCompte compte) {
	this.compte = compte;
}

@FXML
public void update() {
	identifiant.setText("Bonjour" + this.compte.getIdentifiant());
}
@FXML
public void gestionBouton(ActionEvent e)throws IOException {
	
}



}
