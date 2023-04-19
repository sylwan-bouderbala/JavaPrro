package com.cytech.Controller;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class CreerCompteController {
	  
    @FXML
    private TextField identifiantField;
    
    @FXML
    private TextField quartierField;
    
    @FXML
    private TextField mdpField;
    
    @FXML
    private TextField nbPersonnesField;
    
    @FXML
    private Button creerCompteButton;
    
    @FXML
    private Button retourButton;
    
    public void initialize() {
        creerCompteButton.setOnAction(event -> {
            String identifiant = identifiantField.getText();
            String quartier = quartierField.getText();
            String mdp = mdpField.getText();
            String nbPersonnes = nbPersonnesField.getText();
            
            // Code pour traiter les données du formulaire de création de compte
        });
        
        retourButton.setOnAction(event -> {
        	try {
                     // Chargement du fichier FXML de la page "HomePage.fxml"
               FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
               Parent root = loader.load();

                     // Création d'une nouvelle scène avec la page "CreerCompte.fxml"
               Scene scene = new Scene(root);

                     // Récupération de la fenêtre principale
               Stage stage = (Stage) creerCompteButton.getScene().getWindow();

                     // Affichage de la nouvelle scène dans la fenêtre principale
               stage.setScene(scene);

             } catch (Exception e) {
            	 e.printStackTrace();
             }

        });	
    }
}
