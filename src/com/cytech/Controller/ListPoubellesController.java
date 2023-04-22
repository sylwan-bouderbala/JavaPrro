package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.cytech.Centre_tri.centre_tri;
import com.cytech.Poubelle.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ListPoubellesController {
	@FXML
	private Button boutton;
	@FXML
	private Button boutton_quitter;
	@FXML
	private TableView<String> tableau;
	
	private centre_tri centretri;
	public void initialize() {
		
		ObservableList<Poubelle> observableList = FXCollections.observableArrayList(this.centretri.getPoubelles());
	}
	public void AjoutPoubellePage(ActionEvent event) throws IOException {
        // Code to execute on button click
		String absolutePath = "H:\\Documents\\GitHub\\JavaPrro\\src\\Views\\List_poubelles.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();

	}
	public void Quiter_page(ActionEvent event) throws IOException{
		String absolutePath = "HomePage.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();
	}
	public centre_tri getCentretri() {
		return centretri;
	}
	public void setCentretri(centre_tri centretri) {
		this.centretri = centretri;
	}
}
