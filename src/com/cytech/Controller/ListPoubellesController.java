package com.cytech.Controller;
import javafx.application.Application;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ListPoubellesController {
	@FXML
	private Button AjoutPoubelle;
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
	/*public void initiate() {
		for (Poubelle i : centretri.getPoubelles()) {
			if (i != null) {
				Poubellesobj.add(i);
			}
		}
		TableColumn<Poubelle, Integer> id = new TableColumn<>("ID");
		id.setCellValueFactory(new PropertyValueFactory<>("identifiantP"));
		
		TableColumn<Poubelle, String> quartier = new TableColumn<>("quartier");
		quartier.setCellValueFactory(new PropertyValueFactory<>("quartier"));
		
		TableColumn<Poubelle, Float> quantité = new TableColumn<>("quantité");
		quantité.setCellValueFactory(new PropertyValueFactory<>("quantite"));
		tableau.getColumns().addAll(id, quartier, quantité);
		tableau.setItems(Poubellesobj);
        List<HashMap<String,Float>> data = getDataFromDatabase();
        addDataToChart(Charts, data);
		
	}
	private void addDataToChart(BarChart<String, Float> chart, List<ChartData> data) {
        XYChart.Series<String, Float> series = new XYChart.Series<>();
        for (ChartData chartData : data) {
            series.getData().add(new XYChart.Data<>(chartData.getName(), chartData.getValue()));
        }
        chart.getData().add(series);
    }
	private List<HashMap<String, Float>> getDataFromDatabase() {
		List<HashMap<String, Float>> liste;
		liste.add(Sta)
	}*/
	public void AjoutPoubelle(ActionEvent event) throws IOException {
        // Code to execute on button click
		String absolutePath = "src\\Views\\AjoutPoubelle.fxml";
		URL url = new File(absolutePath).toURI().toURL();
		FXMLLoader loader = new FXMLLoader(url);
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    stage.setScene(scene);
	    stage.show();
	    AjoutPoubelleController controller = loader.getController();
	    controller.SetCentre(centretri);

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
	public void update() {
		nom.setText("Bonjour" + this.centretri.getNom());
		for (Poubelle e : centretri.getPoubelles()) {
			System.out.println("les ids des pb" + String.valueOf(e.getIdentifiant()));
		}
	}
	public centre_tri getCentretri() {
		return centretri;
	}
	public void setCentretri(centre_tri centretri) {
		this.centretri = centretri;
	}
}
