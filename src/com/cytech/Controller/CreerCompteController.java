package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.cytech.Centre_tri.centre_tri;
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
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CreerCompteController {
	  
    @FXML
    private TextField identifiant;
    
    @FXML
    private TextField quartier;
    
    @FXML
    private TextField mdp;
    
    @FXML
    private TextField nbPersonnes;
    
    @FXML
    private Button creerCompteButton;
    
    @FXML
    private Button retourButton;
    
    @FXML
	public void retourBouton(ActionEvent event) throws IOException{
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
	public void HandleCreerMenageCompte(ActionEvent event)throws IOException {
		LectureFichier lecture = new LectureFichier("datas\\compteMenage.csv");

		if (identifiant.getText().isEmpty() || quartier.getText().isEmpty() || mdp.getText().isEmpty() || nbPersonnes.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Pas de champs null");
	        alert.setHeaderText("l'un des champs est nul");
	        alert.showAndWait();
		}
		else if (lecture.IsinFile(1, identifiant.getText())) {
			Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Le compte existe deja");
	        alert.setHeaderText("le nom de compte est dÃ©ja prÃ©sent dans notre base");
	        alert.showAndWait();
		}
		else {
			int id = Integer.parseInt(identifiant.getText());
			int nbPers = Integer.parseInt(nbPersonnes.getText());
			MenageCompte compte = new MenageCompte(id,mdp.getText(),quartier.getText(),nbPers,0);
			compte.enregistrerMenageCompte(compte);
			System.out.println("Votre Compte a bien été créé");
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
	@FXML
	public void HandleMenageCompte(ActionEvent event)throws IOException {
		
	}
}
