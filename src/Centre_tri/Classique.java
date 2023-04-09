package Centre_tri;

public class Classique extends Bac {

static String couleur = "classique";
		
	public Classique(int identifiant) {
	    super(identifiant, "classique");
	}
	
	@Override
	public String getCouleur() {
		return "classique";
	}
	public void setCouleur(String classique) {
		Classique.couleur = "classique";
	}

}
