package com.cytech.Centre_tri;

import java.util.ArrayList;

import com.cytech.Poubelle.Poubelle;


public class centre_tri {
	private int identifiant ;
	private String nom;


	private String adresse;
	

	public  Statistiques stats;
	private ArrayList<Contrat> contrats;
	private ArrayList<Poubelle> Poubelles;


	public centre_tri(String adresse, String nom, int identifiant){
		this.adresse = adresse;
		this.nom = nom;
		this.identifiant = identifiant;
		this.stats = new Statistiques("stats_poubelle.csv");
	}
	
	public void placer(Poubelle p) {
		Poubelles.add( p);
		p.setIdentifiant(Poubelles.size());
	}
	public void Retirer(Poubelle p) {
		Poubelles.remove(p.getIdentifiant());
	}
	public void Ajouter(Poubelle p) {
		Poubelles.add( p);
		p.setIdentifiant(Poubelles.size());
	}
	public void Collecter(Poubelle p) {
		if( p.getIdentifiant() <= Poubelles.size()) {
			//methode pour collecter les poubelles
		}
		else {
			System.out.println("la poubelle : "+p.getIdentifiant()+" n'appartient pas au centre-de-tri");
		}
	}
	//GET ET SETTER
	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}


	public ArrayList<Contrat> getContrats() {
		return contrats;
	}

	public void setContrat(ArrayList<Contrat> contrat) {
		this.contrats = contrat;
	}

	public Statistiques getStats() {
		return stats;
	}

	public void setStats(Statistiques stats) {
		this.stats = stats;
	}

	public void setContrats(ArrayList<Contrat> contrats) {
		this.contrats = contrats;
	}

	public ArrayList<Poubelle> getPoubelles() {
		return Poubelles;
	}

	public void setPoubelles(ArrayList<Poubelle> poubelles) {
		Poubelles = poubelles;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
