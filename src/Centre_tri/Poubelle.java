package Centre_tri;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;


public class Poubelle {
	private int identifiant;
	protected float quantiteMaximale;
	protected float quantite;
	private int codeAcces;
	public String quartier;
	private centre_tri Centre;
	private ArrayList<Bacs> bacs;
	private HashMap<Integer,Bacs> Bacs;
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
	
	public void PrintjsonStat(operation operation) {
		Gson gson = new Gson();
		 
        try (FileWriter writer = new FileWriter("stat.json")) {
            gson.toJson(operation, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void setIdentfiant(int identifiant) {
		this.identifiant=identifiant;
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
	
	
	public void identifier(operation operation) {
		System.out.println(operation.identifiant);
	}
	
	public void envoyerNotifs(operation operation, poubelle p) {
		if (p.quantite > p.capaciteMaximale) {
			estPleine = true;
		}
	}

	public boolean verifier(Dechet dechet, Bacs bacs) {
	    if (dechet.getType().equals("Verre") && bacs.getCouleur().equals("Vert")) {
	        return true;
	    }
	    else if (dechet.getType().equals("Papier") && bacs.getCouleur().equals("Bleu"))) {
	        return true; 
	    } 
	    else if (dechet.getType().equals("Plastique") || (dechet.getType().equals("Carton") or dechet.getType().equals("Metal"))  && (bacs.getCouleur().equals("Jaune")) {
	        return true; 
		}
	    else if ((dechet.getType().equals("Autres")  && (bacs.getCouleur().equals("Classique")) {
		return true; 
	    } 
	    else {
	        return false;
	    }
	}
		      
	public void attribuer(Dechet dechet, Bacs bacs) {
		if (verifier(Dechet dechet, Bacs bacs== True){
			this.ptsFidelite += 1;
		}
		else {
			this.ptsFidelite -= 1;
		}
	}
}
		    