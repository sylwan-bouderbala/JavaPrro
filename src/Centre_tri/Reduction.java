package net.codejava;

public class Reduction {
public float taux;
public String produit;
public int pointsdefidélité;
public Contrat contrat;

public float getTaux() {return taux;}

public void setTaux(float taux) {this.taux = taux;}

public String getProduit() {return produit;}

public void setProduit(String produit) {this.produit = produit;}

public int getpointsdefidélité() {return pointsdefidélité;}

public void setpointsdefidélité(int pointsdefidélité) {this.pointsdefidélité = pointsdefidélité;}

public Reduction(float taux, String produit, Contrat contrat, int pointsdefidélité) {
	this.taux = taux;
	this.produit = produit;
	this.pointsdefidélité = pointsdefidélité;
	this.contrat = contrat;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
