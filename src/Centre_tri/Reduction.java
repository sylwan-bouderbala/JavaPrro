package net.codejava;

public class Reduction {
public float taux;
public String produit;
public int pointsdefid�lit�;
public Contrat contrat;

public float getTaux() {return taux;}

public void setTaux(float taux) {this.taux = taux;}

public String getProduit() {return produit;}

public void setProduit(String produit) {this.produit = produit;}

public int getpointsdefid�lit�() {return pointsdefid�lit�;}

public void setpointsdefid�lit�(int pointsdefid�lit�) {this.pointsdefid�lit� = pointsdefid�lit�;}

public Reduction(float taux, String produit, Contrat contrat, int pointsdefid�lit�) {
	this.taux = taux;
	this.produit = produit;
	this.pointsdefid�lit� = pointsdefid�lit�;
	this.contrat = contrat;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
