package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

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
	    private TextField quantite;
	    
	    @FXML
	    private TextField couleurBac;
	    
	    @FXML
	    private TextField nbDechets;
	    
	    @FXML
	    private Button Jeter;
	    
	    @FXML
	    private Button retourButtonCompte;
	    
	    
	    
	    @FXML
		public void retourBoutonCompte(ActionEvent event) throws IOException{
			String absolutePath = "src\\Views\\PageDeCompte.fxml";
			URL url = new File(absolutePath).toURI().toURL();
			FXMLLoader loader = new FXMLLoader(url);
		    Parent root = loader.load();
		    Scene scene = new Scene(root);
		    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		    stage.setScene(scene);
		    stage.show();
		}
	    
	    public void jeterbis(MenageCompte compte, Poubelle poubelle) {
		 	int nbDe = Integer.parseInt(nbDechets.getText());
		 	String couleurB = couleurBac.getText();
		 	String typeDe = typeDechet.getText();
		 	String quanti = quantite.getText();
		 	float quant =  Float.parseFloat(quanti);
		 	int idP = Integer.parseInt(identifiantP.getText());
		 	// Utilisation de la m�thode LocalDate.of pour cr�er une instance de LocalDate
		 	LocalDate nvdate1 = LocalDate.of(2023, 26, 4);
		 	CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte,idP,quant, typeDe,nvdate1, false, couleurB,nbDe);
		 	Dechet dechet = new Dechet(operation.getIdDechet(),operation.getTypeDechet());
		    Bac bac = new Bac(poubelle.getIdentifiantBac(operation.getCouleurBac()), operation.getCouleurBac());
			Poubelle.calculer(operation);
			poubelle.verifier(dechet,bac);
			poubelle.attribuer(dechet,bac, operation);
			poubelle.envoyerNotifs(operation);
			poubelle.enregistrerStats(operation);	
			System.out.println("Vous avez bien jet� votre dechet");
		}	    

	    
	 

	@FXML
	public void HandleJeter(ActionEvent event)throws IOException {
		LectureFichier lecture = new LectureFichier("datas\\compteMenage.csv");
		System.out.println("je suis l� f");
		if (identifiant.getText().isEmpty() || identifiantP.getText().isEmpty() || typeDechet.getText().isEmpty() || couleurBac.getText().isEmpty() || nbDechets.getText().isEmpty()) {
			Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Pas de champs null");
	        alert.setHeaderText("l'un des champs est nul");
	        alert.showAndWait();
		}
	
		else {
			String idT = identifiantP.getText();
			int idP = Integer.parseInt(idT);
			System.out.println("idP:");
			System.out.println(idP);
			String idS = identifiant.getText();
			String motdp = mdp.getText();
			MenageCompte compte = lecture.handleLogin(idS,motdp);
			Poubelle poubelle = lecture.CreatePoubelle(idP);
			jeterbis(compte,poubelle);
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
