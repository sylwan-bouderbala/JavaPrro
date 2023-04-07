package Centre_tri;

import java.util.ArrayList;
import java.util.HashMap;


public class centre_tri {
	private int identifiant ;
	private char[] nom;
	private char[] adresse;
	public  Statistiques stats;
	private ArrayList<Contrat> contrats;
	private HashMap<Integer,Poubelle> Poubelles;

	public static void main(String[] args) {
		centre_tri Centre = new centre_tri("7à chemin de vin".toCharArray(),"le centre".toCharArray(),123);
		System.out.println(Centre);
	}
	public centre_tri(char[] adresse, char[] nom, int identifiant){
		this.adresse = adresse;
		this.nom = nom;
		this.identifiant = identifiant;
	}
	
	public void placer(Poubelle p) {
		Poubelles.put(p.getIdentifiant(), p);
	}
	//à voir
	public void Retirer(Poubelle p) {
		Poubelles.remove(p.getIdentifiant());
	}
	//ajouter ou placer ?
	public void Ajouter(Poubelle p) {
		Poubelles.put(p.getIdentifiant(), p);
	}
	public void Collecter(Poubelle p) {
		if(Poubelles.containsKey(p.getIdentifiant())) {
			//methode pour collecter les poubelles
			//p.vider();
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

	public char[] getNom() {
		return nom;
	}

	public void setNom(char[] nom) {
		this.nom = nom;
	}

	public char[] getAdresse() {
		return adresse;
	}

	public void setAdresse(char[] adresse) {
		this.adresse = adresse;
	}

	public ArrayList<Contrat> getContrats() {
		return contrats;
	}

	public void setContrat(ArrayList<Contrat> contrat) {
		this.contrats = contrat;
	}


	public HashMap<Integer,Poubelle> getPoubelles() {
		return Poubelles;
	}


	public void setPoubelles(HashMap<Integer,Poubelle> poubelles) {
		Poubelles = poubelles;
	}
	
}
