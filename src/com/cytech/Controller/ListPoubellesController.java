package com.cytech.Controller;
import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.io.File;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cytech.Centre_tri.Statistiques;
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
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ListPoubellesController {
	@FXML
	private Button ajouter;
	@FXML
	private TextField Quartier,Quantité,quantitémax,Code;

	@FXML
	private Button Quitter;
	@FXML
	private BarChart<String,Float> Charts;
	@FXML
	private TableView<Poubelle> tableau;
	@FXML
	private Text nom;
	private ObservableList<Poubelle> Poubellesobj = FXCollections.observableArrayList();
	
	private Statistiques stats = new Statistiques("datas\\stats_poubelle.csv");
	
	private centre_tri centretri;
	
	public void initiate() {
		nom.setText("Bonjour  " + this.centretri.getNom() );
		for (Poubelle i : centretri.getPoubelles()) {
			if (i != null) {
				//System.out.println(i.getIdentifiant());
				Poubellesobj.add(i);
			}
		}
		TableColumn<Poubelle, Integer> id = new TableColumn<>("ID");
		id.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getIdentifiant()).asObject());
		
		TableColumn<Poubelle, String> quartier = new TableColumn<>("quartier");
		quartier.setCellValueFactory(new PropertyValueFactory<>("quartier"));
		
		TableColumn<Poubelle, Float> quantité = new TableColumn<>("quantité");
		quantité.setCellValueFactory(new PropertyValueFactory<>("quantite"));
		tableau.getColumns().addAll(id, quartier, quantité);
		tableau.setItems(Poubellesobj);
		
	}

	public void BounttonQuiter(ActionEvent event) throws IOException{
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
	public void upjour() {
		ObservableList<Poubelle> Poubellesobj2 = FXCollections.observableArrayList();
		for (Poubelle i : centretri.getPoubelles()) {
			if (i != null) {
				//System.out.println(i.getIdentifiant());
				Poubellesobj2.add(i);
			}
		}
		tableau.setItems(Poubellesobj2);
	}
	public centre_tri getCentretri() {
		return centretri;
	}
	public void setCentretri(centre_tri centretri) {
		this.centretri = centretri;
	}
	@FXML
	void Ajouter_Poubelles(ActionEvent event) throws IOException{
		Poubelle p = new Poubelle(0, Float.parseFloat(quantitémax.getText()), Float.parseFloat(Quantité.getText()), Integer.parseInt(Code.getText()),Quartier.getText());
		centretri.Ajouter(p);
		this.upjour();
	}
}
