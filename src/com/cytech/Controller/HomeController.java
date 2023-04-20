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
	
	public static boolean Connected;
	
	private String Choice;
	
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
	public void handleButtonClick(ActionEvent event) throws IOException {

        // Code to execute on button click
		String absolutePath;
		URL url;
		FXMLLoader loader;
		Parent root;
		Scene scene;
		switch (Choice) {
				case "Commerce" :
					absolutePath = "C:\\Users\\sylwa\\JavaPrro\\src\\Views\\HomePage.fxml";
					url = new File(absolutePath).toURI().toURL();
					loader = new FXMLLoader(url);
				    root = loader.load();
				    scene = new Scene(root);
				    break;
				case "Centre de tri":
					absolutePath = "C:\\Users\\sylwa\\JavaPrro\\src\\Views\\HomePage.fxml";
					url = new File(absolutePath).toURI().toURL();
					loader = new FXMLLoader(url);
				    root = loader.load();
				    scene = new Scene(root);
				    break;
				case "Ménages":
					absolutePath = "C:\\Users\\sylwa\\JavaPrro\\src\\Views\\HomePage.fxml";
					url = new File(absolutePath).toURI().toURL();
					loader = new FXMLLoader(url);
				    root = loader.load();
				    scene = new Scene(root);
				    break;
				default :
					absolutePath = "C:\\Users\\sylwa\\JavaPrro\\src\\Views\\HomePage.fxml";
					url = new File(absolutePath).toURI().toURL();
					loader = new FXMLLoader(url);
					root = loader.load();
					scene = new Scene(root);
					break;
			
		}
		

	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();

    }

}
