package Centre_tri;

public class Vert extends Bac {

static String couleur = "vert";
	
	public Vert(int identifiant) {
	    super(identifiant, "vert");
	}
	public String getCouleur() {
		return "vert";
	}
	public void setCouleur(String vert) {
		Vert.couleur = "vert";
	}
}

