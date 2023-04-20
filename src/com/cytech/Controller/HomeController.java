package com.cytech.Controller;

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
	
	private Main mainApp;
	
	public static boolean Connected;
	
	public HomeController() {
		
	}
	
	@FXML
    private void initialize() {
    	// Initialize the person table with the two columns.
		initChoice();

    }
	
	public void initChoice() {
		ObservableList<String> items = FXCollections.observableArrayList("Commerce", "Centre de tri", "Ménages");
		ChoiceBox.setItems(items);
		ChoiceBox.setValue("Centre de tri");
	}
	public void handleButtonClick(ActionEvent event) throws IOException {
        // Code to execute on button click
		String absolutePath = "List_poubelles.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();

    }

}
