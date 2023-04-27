package com.cytech.Poubelle;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.ObjectProperty;

public class Depot {
	private int identifiant;
	public String quartier;
	private String couleurBac;
	private float quantite;
	private int nbDechets;
	private boolean valeurVerifier;
	
	/**
	 * Constructor with some initial data.
	 * 
	 * @param identifiant
	 * @param quartier
	 */
	public Depot (int identifiant, String quartier,String couleurBac,float quantite, int nbDechets) {
		this.identifiant= identifiant;
		this.quartier = quartier;
		this.couleurBac = couleurBac;
		this.quantite = quantite;
		this.nbDechets = nbDechets;
		this.valeurVerifier = false;

}

public void setIdentifiant(int identifiant){
	this.identifiant= identifiant;
}

public int getIdentifiant() {
	return identifiant;
}

public StringProperty quartierProperty() {
	StringProperty quartierProperty = new SimpleStringProperty(quartier);
	return quartierProperty;
}

public IntegerProperty identifiantProperty() {
	IntegerProperty identifiantProperty = new SimpleIntegerProperty(identifiant);
	return identifiantProperty;
}

public int getNbDechets() {
	return nbDechets;
}

public void setNbDechets(int nbDechets) {
	this.nbDechets=nbDechets;
}

public float getQuantite() {
    return quantite;
}

public void setQuantite(float quantite) {
    this.quantite=quantite;
}

public String getCouleurBac() {
    return couleurBac;
}
public String getQuartier() {
    return quartier;
}

public boolean valeurVerifier() {
    return valeurVerifier;
}
}