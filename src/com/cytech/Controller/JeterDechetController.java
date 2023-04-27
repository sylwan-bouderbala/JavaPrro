package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.cytech.Menage.MenageCompte;
import com.cytech.Usuelles.LectureFichier;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import com.cytech.Poubelle.*;
import com.cytech.Menage.*;

public class JeterDechetController {
		  
	    @FXML
	    private TextField identifiant;
	    
	    @FXML
	    private TextField mdp;
	    
	    @FXML
	    private TextField identifiantP;
	    
	    @FXML
	    private TextField typeDechet;
	    
	    @FXML
	    private TextField date;
	    
	    @FXML
	    private TextField couleurBac;
	    
	    @FXML
	    private TextField nbDechets;
	    
	    @FXML
	    private Button Jeter;
	    
	    @FXML
	    private Button retourButton;

	    
	    
	 

	@FXML
	public void HandleJeter(ActionEvent event)throws IOException {
		LectureFichier lecture = new LectureFichier("datas\\compteMenage.csv");

		if (identifiant.getText().isEmpty() || identifiantP.getText().isEmpty() || typeDechet.getText().isEmpty() || date.getText().isEmpty() || couleurBac.getText().isEmpty() || nbDechets.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Pas de champs null");
	        alert.setHeaderText("l'un des champs est nul");
	        alert.showAndWait();
		}
	
		else {
			int id = Integer.parseInt(identifiant.getText());
			int idP = Integer.parseInt(identifiantP.getText());
			int nbDeche = Integer.parseInt(nbDechets.getText());
			MenageCompte compte = lecture.handleLogin(identifiant,mdp);
			Poubelle poubelle = trouverPoubelle(identifiantP);
			poubelle.jeterbis();
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
