package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.cytech.Poubelle.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import com.cytech.Menage.*;
import java.util.Scanner;
import java.io.FileNotFoundException;


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
    

	private ObservableList<Depot> depotData = FXCollections.observableArrayList();

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
    
    @FXML
    private Button retourButton;
    
    @FXML
    private Button jeterDechet;
    
    @FXML
    private String idMenageS;

public PageDeCompteController() {
}

public void setidMenages(String idMenageS) {
	this.idMenageS=idMenageS;
}

public String getidMenages(String idMenageS) {
    return this.idMenageS;
}

@FXML
public void initiate() {
	// Initialize the person table with the two columns.
		DepotTable.setItems(depotData);
		
		getDepotById(String.valueOf(this.idMenageS));
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

// Cette fonction permet d'obtenir l'historique des dépôts du menage considéré identifié par son identifiant (unique)
public void getDepotById(String identifiant) {

    try (Scanner scanner = new Scanner(new File("datas\\stats_poubelle.csv"))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(";");

            // Vérifier si l'identifiant correspond à celui donné en paramètre
            if (values[0].equals(identifiant)) {
            	int id = Integer.parseInt(values[0]);
            	float quant = Float.parseFloat(values[4]);
            	int nbDech = Integer.parseInt(values[5]);
            	Depot depot = new Depot(id,values[1],values[2],quant,nbDech);
                depotData.add(depot);
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}



@FXML
	public void retourBouton(ActionEvent event) throws IOException{
		String absolutePath = "src\\Views\\HomePage.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();
	}

	public void jeterDechet(ActionEvent event) throws IOException{
		String absolutePath = "src\\Views\\JeterDechet.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();
}
}
