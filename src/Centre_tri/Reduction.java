package Centre_tri;

import java.util.ArrayList;

public class Reduction {
	private int Taux;
	private ArrayList<String> Produits;
	
	//TODO : Ajouter la gestion de k'impression fichier et supression fichier

	public Reduction(int Taux,ArrayList<String> Produits) {
		this.setTaux(Taux);
		this.setProduits(Produits);
	}

	public ArrayList<String> getProduits() {
		return Produits;
	}

	public void setProduits(ArrayList<String> produits) {
		Produits = produits;
	}

	public int getTaux() {
		return Taux;
	}

	public void setTaux(int taux) {
		Taux = taux;
	}
}
