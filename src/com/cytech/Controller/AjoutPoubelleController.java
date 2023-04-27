package com.cytech.Controller;


import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.cytech.Centre_tri.centre_tri;
import com.cytech.Poubelle.Poubelle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AjoutPoubelleController {
	@FXML
	private Button boutton;
	@FXML

	private Button Quitter_page;
	@FXML
	private TextField Nom,Quartier,Quantité,quantitémax,Code;

	
	private centre_tri centre;
	
	public void QuitPage(ActionEvent event) throws IOException {
        // Code to execute on button click
		
		String absolutePath = "H:Documents\\GitHub\\JavaPrro\\src\\Views\\AjoutPoubelle.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();

	}
	
	centre_tri getCentre() {
		return centre;
	}
	
	void SetCentre(centre_tri centre) {
		this.centre = centre;
	}
	
	void Ajouter_Poubelles(ActionEvent event) throws IOException{
		
		centre.Ajouter(new Poubelle(0, 0, 0, 0, null));
	}
}
