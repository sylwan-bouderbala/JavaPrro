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
import javafx.stage.Stage;

public class AjoutPoubelleController {
	@FXML
	private Button boutton;
	
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
}
