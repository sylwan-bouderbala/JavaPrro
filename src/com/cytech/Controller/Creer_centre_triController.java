package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.cytech.Centre_tri.centre_tri;
import com.cytech.Test.CentretriTest;
import com.cytech.Usuelles.LectureFichier;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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
		LectureFichier lecture = new LectureFichier("src\\datas\\Centre_trri.csv");

		if (nom.getText().isEmpty() || mot_de_passe.getText().isEmpty() || adresse.getText().isEmpty()){
			Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Pas de champs null");
	        alert.setHeaderText("l'un des champs est nul");
	        alert.showAndWait();
		}
		else if (lecture.IsinFile(1, nom.getText())) {
			Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Le compte existe deja");
	        alert.setHeaderText("le nom de compte est déja présent dans notre base");
	        alert.showAndWait();
		}
		else {
			centre_tri centre = new centre_tri(adresse.getText(), nom.getText(), mot_de_passe.getText());
			String absolutePath = "src\\Views\\HomePage.fxml";
			URL url = new File(absolutePath).toURI().toURL();
			FXMLLoader loader = new FXMLLoader(url);
		    Parent root = loader.load();
		    Scene scene = new Scene(root);
		    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		    stage.setScene(scene);
		    stage.show();
		}
	}
}
