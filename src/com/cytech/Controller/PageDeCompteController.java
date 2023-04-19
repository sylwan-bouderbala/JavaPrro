package com.cytech.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import com.cytech.Menage.MenageCompte;
import com.cytech.Menage.CorbeilleOperation;
import com.cytech.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class PageDeCompteController {
	@FXML
    private TableView<CorbeilleOperation> CorbeilleOperationTable;
    @FXML
    private TableColumn<CorbeilleOperation, String> identifiantColumn;
    @FXML
    private TableColumn<CorbeilleOperation, String> nbDechetsColumn;

    @FXML
    private Label identifiantLabel;
    @FXML
    private Label nbDechetsLabel;
    @FXML
    private Label quantiteLabel;
    @FXML
    private Label valeurVerIfierLabel;
    @FXML
    private Label couleurBacUtilise;
    @FXML
    private Label idDechet;


private Main main;

public PageDeCompteController() {
}

@FXML
private void initialize() {
	// Initialize the corbeilleOperation table with the two columns.
    identifiantColumn.setCellValueFactory(cellData -> cellData.getValue().Integer.toString(getMenageCompte.getIdentifiant()));
    nbDechetsColumn.setCellValueFactory(cellData -> cellData.getValue().Integer.toString(getNbDechets()));
}

public void setMain(Main main) {
    this.main = main;

    // Add observable list data to the table
    CorbeilleOperationTable.setItems(main.getOperationData());
}

}