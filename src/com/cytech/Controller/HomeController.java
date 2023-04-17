package com.cytech.Controller;

import java.util.ArrayList;

import com.cytech.Main.Main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import com.cytech.Main.*;

public class HomeController {
	@FXML
	private ChoiceBox<String> ChoiceBox;
	@FXML
	private Button Button;
	
	private Main mainApp;
	
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
	public void handleButtonClick(ActionEvent event) {
        // Code to execute on button click
			String newValue = ChoiceBox.getSelectionModel().getSelectedItem();
            System.out.println("Selected item: " + newValue);
    }

}
