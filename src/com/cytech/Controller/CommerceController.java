package com.cytech.Controller;

import com.cytech.Main.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import com.cytech.Centre_tri.Commerce;

public class CommerceController {
	@FXML
	private TextField txtNom, txtAdresse; 
	@FXML
	private Button button;
	
	private Commerce commerce;
	public CommerceController() {
		
		commerce = new Commerce("88 Rue Voltaire",0,"Poste");	
	}
	
	@FXML
    private void initialize() {

    }
	

	
	@FXML
	public void handleButtonClick(ActionEvent event) { 

		String nom = txtNom.getText();
		String adresse = txtAdresse.getText();
		commerce.NouveauContrat(nom, commerce, new java.util.Date(), new java.util.Date());
		System.out.println("Contrat crée");
	}
}
