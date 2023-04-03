package TriSelectifPoubelle;

import java.util.ArrayList;

public class compteMenage {
	private int identifiant;
	private String motDePasse; 
	public String quartier;
	private int nbPersonnes;
	private int ptsFidelite;
	private ArrayList<Operation> operation;
}

	public compteMenage(int identifiant,String motDePasse,String quartier,int nbPersonnes, int ptsFidelite) {
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.quartier = quartier;
		this.nbPersonnes = nbPersonnes;
		this.ptsFidelite = ptsFidelite;
	}
	
	private int getIdentifiant(){
		return identifiant;
	}
	
	private String getmotdePasse(){
		return motDePasse;
	}
	
	private int getnbPersonnes(){
		return nbPersonnes;
	}
	
	private int getptsFidelite(){
		return ptsFidelite;
	}
	
	public int consulter() {
		return this.ptsFidelite;
		
	}
	
	public compteMenage creerCompte(int identifiant,String motDePasse,String quartier, int nbPersonnes, int ptsFidelite) {
		compteMenage nvCompteMenage = new compteMenage(identifiant, motDePasse,quartier,nbPersonnes, ptsFidelite);
		return nvCompteMenage;
				
	}
	
	public void utiliser(int ptsFideliteAUtiliser) {
		if (ptsFideliteAUtiliser <= this.ptsFidelite) {
			this.ptsFidelite -= ptsFideliteAUtiliser;
		}
		else {
			System.out.println("Impossible : vous avez trop peu de points de fidélité");
		}
	}
	
	public int convertir(int taux, String produit,int ptsFidelietnecessaires) {
		if (ptsFidelitenecessaires <= this.ptsFidelite) {
			this.ptsFidelite -= ptsFidelietnecessaires;
			return taux;
		}
		else {
			System.out.println("Impossible : vous avez trop peu de points de fidélité");
		}
		
	}
