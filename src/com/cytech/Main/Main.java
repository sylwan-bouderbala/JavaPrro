package com.cytech.Main;
import com.cytech.Test.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.cytech.Controller.*;
import com.cytech.Menage.*;
import com.cytech.Poubelle.Bac;
import com.cytech.Poubelle.Poubelle;
import javafx.scene.layout.AnchorPane;

import javafx.collections.ObservableList;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

public class Main extends Application {

	/*public static void main(String[] args) {
		AutresTest.main(args);
		BacTest.main(args);
		BleuTest.main(args);
		CartonTest.main(args);
		CentretriTest.main(args);
		ClassiqueTest.main(args);
		CommerceTest.main(args);
		ContratTest.main(args);
		CorbeilleOperationTest.main(args);
		DechetTest.main(args);
		JauneTest.main(args);
		MenageCompteTest.main(args);
		MetalTest.main(args);
		PapierTest.main(args);
		PlastiqueTest.main(args);
		PoubelleTest.main(args);
		VertTest.main(args);
		


		
	}*/
	
	private VBox page;
	private Stage primaryStage;
	@FXML
	private ChoiceBox<String> choiceBox;
	@FXML
	private Button Button;
	
	// Pour Page de compte 
	
	
	@Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file
		String absolutePath = "C:/Users/sylwa/JavaPrro/src/Views/HomePage.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
		Parent root = loader.load();
        // Set the scene
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        // Get the controller
        HomeController controller = loader.getController();

        // Use the controller
        controller.initChoice();
    }
	

	

	
	
    public static void main(String[] args) {

        launch(args);

    }

	
}

