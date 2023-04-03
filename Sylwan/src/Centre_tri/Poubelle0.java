package TriSelectifPoubelle;
import java.util.ArrayList;
import java.util.HashMap;


public class Poubelle {
	private int identifiant;
	protected float quantiteMaximale;
	protected float quantite;
	private int codeAcces;
	public String quartier;
	private centre_tri;
	private ArrayList<Bacs> bacs;
	private HashMap<Integer,Bacs> Bacs;
	private boolean estPleine;
}

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
