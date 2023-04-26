package com.cytech.Poubelle;

public class Depot {
	private int identifiant;
	public String quartier;
	private String couleurBac;
	private float quantite;
	private int nbDechets;
	private boolean valeurVerifier;


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