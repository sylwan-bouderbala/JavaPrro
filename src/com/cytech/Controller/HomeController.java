package com.cytech.Controller;

import java.beans.EventHandler;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
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
	
	private String Choice = "vide";
	
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
		
	}
	@FXML
	public void HandleConnection (ActionEvent event)throws IOException{
		
	}
	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {
		Scene scene = ((Node) event.getSource()).getScene();
		Stage stage = (Stage) scene.getWindow();
		String absolutePath = "src\\Views\\List_poubelles.fxml";

		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
		Parent root = loader.load();
		scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        // Code to execute on button click
		switch (Choice) {
				case "Commerce" :


					Creation_Compte.setVisible(true);
					
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
