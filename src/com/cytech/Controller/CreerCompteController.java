package com.cytech.Controller;

import java.io.File;
import java.io.IOException;

import com.cytech.Menage.MenageCompte;
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
    
    public void gestionBouton(ActionEvent e)throws IOException {
    	 FXMLLoader loader = new FXMLLoader(getClass().getResource("src\\Views\\HomePage.fxml"));
         Parent root = loader.load();

               // Cr�ation d'une nouvelle sc�ne avec la page "CreerCompte.fxml"
         Scene scene = new Scene(root);

               // R�cup�ration de la fen�tre principale
         Stage stage = (Stage) retourButton.getScene().getWindow();

               // Affichage de la nouvelle sc�ne dans la fen�tre principale
         stage.setScene(scene);
    }
    public void initialize() {
        creerCompteButton.setOnAction(event -> {
            String identifiant = identifiantField.getText();
            String quartier = quartierField.getText();
            String mdp = mdpField.getText();
            String nbPersonnes = nbPersonnesField.getText();
            
            int id = Integer.parseInt(identifiant);
            int nbPers = Integer.parseInt(nbPersonnes);
            // Code pour traiter les donn�es du formulaire de cr�ation de compte � rajouter
            MenageCompte compte = new MenageCompte(id,quartier,mdp,nbPers,0);
            compte.enregistrerMenageCompte(compte);
        });
        
    }
}
