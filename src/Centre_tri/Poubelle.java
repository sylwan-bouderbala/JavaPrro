package Centre_tri;

import java.util.ArrayList;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Poubelle {
	private int identifiant;
	protected float quantiteMaximale;
	protected float quantite;
	private int codeAcces;
	public String quartier;
	private centre_tri Centre;
	private ArrayList<Bac> bacs;
	private HashMap<Integer,Bac> Bacs;
	private boolean estPleine;
	private float capaciteMaximale;


	public Poubelle (int identifiant, float capaciteMaximale, float quantite, int codeAcces, String quartier) {
		this.identifiant = identifiant;
		this.capaciteMaximale = capaciteMaximale;
		this.quantite = quantite;
		this.codeAcces = codeAcces;
		this.quartier = quartier;
		this.estPleine = false;
		
	}
	
	public void setIdentfiant(int identifiant) {
		this.identifiant=identifiant;
	}

	public int getIdentifiant() {
		return this.identifiant;
	}
	
	public float getQuantiteMaximale() {
	    return quantiteMaximale;
	}

	public float getQuantite() {
	    return quantite;
	}

	public int getCodeAcces() {
	    return codeAcces;
	}

	public String getQuartier() {
	    return quartier;
	}

	public ArrayList<Bac> getBacs() {
	    return bacs;
	}

	public HashMap<Integer, Bac> getBacsMap() {
	    return Bacs;
	}

	public boolean estPleine() {
	    return estPleine;
	}
	
	public void setCapacitemaximale(float capaciteMaximale) {
		this.capaciteMaximale = capaciteMaximale;
	}
	
	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}
	
	public void setCodeAcces(int codeAcces) {
		this.codeAcces = codeAcces;
	}
	
	
	public void identifier(CorbeilleOperation operation) {
		System.out.println(operation.getIdentifiant());
	}
	
	public void envoyerNotifs(CorbeilleOperation operation, Poubelle p) {
		if (p.quantite > p.capaciteMaximale) {
			estPleine = true;
		}
	}

	public boolean verifier(Dechet dechet, Bac bacs) {
	    if (dechet.getType().equals("Verre") && bacs.getCouleur().equals("Vert")) {
	        return true;
	    }
	    else if (dechet.getType().equals("Papier") && bacs.getCouleur().equals("Bleu")) {
	        return true; 
	    }
		else if (dechet.getType().equals("Plastique") || (dechet.getType().equals("Carton") || dechet.getType().equals("Metal"))  && (bacs.getCouleur().equals("Jaune"))) {
	        return true; 
		}
	    else if (dechet.getType().equals("Autres")  && (bacs.getCouleur().equals("Classique"))) {
			return true;
	    } 
	    else {
	        return false;
	    }
	}
		      
	public void attribuer(Dechet dechet, Bac bacs, CorbeilleOperation corbeilleOperation) {
		if (verifier(dechet, bacs)) {
			corbeilleOperation.getMenageCompte().incrementFidelite();
		}
		else {
			corbeilleOperation.getMenageCompte().decrementFidelite();
		}
	}
	

	

		    
