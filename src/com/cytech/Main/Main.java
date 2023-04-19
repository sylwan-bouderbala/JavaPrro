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
	private ObservableList<CorbeilleOperation> operationData = FXCollections.observableArrayList();
	
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
	
	// Pour page de compte 
	
	public ObservableList<CorbeilleOperation> getOperationData() {
		return operationData;
	}
	
	public main() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    CorbeilleOperation o1 = new CorbeilleOperation(poubelle,compte1,1,0.5f, "plastique",nvdate, false, "bleu",10);
	    CorbeilleOperation o2 = new CorbeilleOperation(poubelle,compte1,1,0.5f, "carton",nvdate, false, "vert",57);
	    CorbeilleOperation o3 = new CorbeilleOperation(poubelle,compte1,1,0.5f, "metal",nvdate, false, "classique",57);
	    CorbeilleOperation o4 = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "bleu",130);
	    operationData.add(o);
		operationData.add(o1);
		operationData.add(o2);
		operationData.add(o3);
		operationData.add(o4);
	}
	
	public void showOperationOverview() {
	    try {
	        // Load person overview.
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("H:\\Documents\\GitHub\\JavaPrro\\src\\Views\\PageDeCompte.fxml"));
	        AnchorPane operationOverview = (AnchorPane) loader.load();

	        // Set person overview into the center of root layout.
	        rootLayout.setCenter(operationOverview);

	        // Give the controller access to the main app.
	        PageDeCompteController controller = loader.getController();
	        controller.setMain(this);

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    public static void main(String[] args) {

        launch(args);

    }

	
}

