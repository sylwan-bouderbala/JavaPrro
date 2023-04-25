package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Creer_centre_triController {
	@FXML
	private Button CreerCentreTri;
	@FXML
	private TextField adresse;
	@FXML
	private TextField nom;
	@FXML
	private PasswordField mot_de_passe;
	@FXML
	private Button Boutton_quitter;
	
	@FXML
	public void Boutton_quitter(ActionEvent event) throws IOException{
		String absolutePath = "src\\Views\\HomePage.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();
	}
	
	@FXML
	public void HandleCreerCentreTri(ActionEvent event)throws IOException {
		
	}
}
