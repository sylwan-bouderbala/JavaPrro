package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.cytech.Menage.MenageCompte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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
	public void HandleMenageCompte(ActionEvent event)throws IOException {
		
	}
}
