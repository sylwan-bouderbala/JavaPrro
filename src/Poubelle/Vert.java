package Poubelle;

public class Vert extends Bac {

static String couleur = "vert";
	
	public Vert(int identifiant) {
	    super(identifiant, "vert");
	}
	
	@Override
	public String getCouleur() {
		return "vert";
	}
	public void setCouleur(String vert) {
		Vert.couleur = "vert";
	}
}

