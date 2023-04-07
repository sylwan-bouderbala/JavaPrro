package Poubelle;

import java.util.ArrayList;
import java.util.HashMap;

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
	

	public void enregistrerStats(CorbeilleOperation operation) {
	    Gson gson = new Gson();
	    Stat stats = new Stat();
	    stats.setIdentifiantMenage(operation.getMenageCompte().getIdentifiant());
	    stats.setQuartier(operation.getMenageCompte().getQuartier());
	    stats.setCouleurPoubelle(operation.getPoubelle().getBac().getCouleur());
	    stats.setIdentifiantPoubelle(operation.getPoubelle().getIdentifiant());
	    stats.setPoidsDechet(operation.getDechet().getPoids());
	    stats.setNombreDechets(operation.getDechet().getNombre());
	    stats.setValeurVerifier(operation.isValeurVerifier());
	    
	    try (FileWriter writer = new FileWriter("stats.json", true)) {
	        gson.toJson(stats, writer);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}


		    
