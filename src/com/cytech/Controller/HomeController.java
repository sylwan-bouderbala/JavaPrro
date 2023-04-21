package com.cytech.Controller;

import java.beans.EventHandler;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

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
	public void handleButtonClick(ActionEvent event) throws IOException {

        // Code to execute on button click
		switch (Choice) {
				case "Commerce" :

					absolutePath = "src\\Views\\CreerCompte.fxml";

					url = new File(absolutePath).toURI().toURL();
					loader = new FXMLLoader(url);
				    root = loader.load();
				    scene = new Scene(root);
				    break;
				case "Centre de tri":

					absolutePath = "src\\Views\\CreerCompte.fxml";

					

					url = new File(absolutePath).toURI().toURL();
					loader = new FXMLLoader(url);
				    root = loader.load();
				    scene = new Scene(root);

				    break;

				case "Creer Compte":
					absolutePath = "src\\Views\\CreerCompte.fxml";
					url = new File(absolutePath).toURI().toURL();
					loader = new FXMLLoader(url);
				    root = loader.load();
				    scene = new Scene(root);
				    break;
				case "Page de compte ":

				case "Ménages":

					Boutton Creation_Compte.setVisible(true);

				    break;
				default :
					break;
			
		}
		

    }

}
