package com.cytech.Controller;

import java.beans.EventHandler;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import com.cytech.Main.Main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import com.cytech.Main.*;
import javafx.scene.*;
import javafx.stage.Stage;

public class HomeController {
	@FXML
	private ChoiceBox<String> ChoiceBox;
	@FXML
	private Button Button;
	@FXML 
	private Button Creation_Compte;
	@FXML
	private Button Se_connecter;
	@FXML
	private TextField ChampUsername;
	@FXML
	private TextField ChampPassword;

	public static boolean Connected;
	
	private String Choice = "Centre de tri";
	
	public HomeController() {
		
	}
	
	@FXML
    private void initialize() {
    	// Initialize the person table with the two columns.
		initChoice();
		ChoiceBox.setOnAction((event) -> {
		    ChoiceBox.getSelectionModel().getSelectedIndex();
		    ChoiceBox.getSelectionModel().getSelectedItem();
		    
		    Choice = ChoiceBox.getValue();
			ChampPassword.setVisible(false);
			ChampUsername.setVisible(false);
			Creation_Compte.setVisible(false);
			Se_connecter.setVisible(false);
			Button.setVisible(true);
		    
		});

    }
	
	public void initChoice() {
		ObservableList<String> items = FXCollections.observableArrayList("Commerce", "Centre de tri", "Ménages");
		ChoiceBox.setItems(items);
		ChoiceBox.setValue("Centre de tri");

	}
	@FXML
	public void HandleBouttonClick(ActionEvent event) throws IOException{
		String absolutepath = new String();
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		FXMLLoader loader;
		Parent root;
		Scene scene;
		URL url;
		switch (Choice) {
		case "Centre de tri":
			System.out.println(Choice);
			absolutepath = "src\\Views\\Creer_centretri.fxml";

			url = new File(absolutepath).toURI().toURL();
			loader = new FXMLLoader(url);
			root = loader.load();
	        // Set the scene
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	        //Creer_centre_triController controller = new Creer_centre_triController();
	        //controller = loader.getController();
	        break;
		case "Ménages":
			absolutepath = "src\\Views\\CreerCompte.fxml";

			url = new File(absolutepath).toURI().toURL();
			loader = new FXMLLoader(url);
			root = loader.load();
	        // Set the scene
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	        CreerCompteController controller2 = new CreerCompteController();
	        controller2 = loader.getController();
	        break;
		default :
			break;
		}
		
	}

	@FXML
	public void HandleConnection (ActionEvent event)throws IOException{
		Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Mot de passe incorect");
        alert.setHeaderText("Votre mot de passeet nom ne correspondent pas");
        alert.showAndWait();
	}
	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {

        // Code to execute on button click
		switch (Choice) {
				case "Commerce" :
					ChampPassword.setVisible(true);
					ChampUsername.setVisible(true);
					Creation_Compte.setVisible(true);
					Se_connecter.setVisible(true);
					Button.setVisible(false);
				    break;
				case "Centre de tri":
					ChampPassword.setVisible(true);
					ChampUsername.setVisible(true);
					Creation_Compte.setVisible(true);
					Se_connecter.setVisible(true);
					Button.setVisible(false);
				    break;

				case "Ménages":
					ChampPassword.setVisible(true);
					ChampUsername.setVisible(true);
					Creation_Compte.setVisible(true);
					Se_connecter.setVisible(true);
					Button.setVisible(false);
				    break;
				default :
					break;
			
		}
		

    }

}
