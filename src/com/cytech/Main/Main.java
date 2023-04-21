package com.cytech.Main;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import com.cytech.Controller.*;
import java.io.File;
import java.net.URL;

public class Main extends Application {


	@FXML
	private ChoiceBox<String> choiceBox;
	@FXML
	private Button Button;
	
	

	@Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file
		String absolutePath = "src\\Views\\HomePage.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
		Parent root = loader.load();
        // Set the scene
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        HomeController controller = loader.getController();

        controller.initChoice();
    }
	

	

	
    public static void main(String[] args) {

        launch(args);

    }

	
}

