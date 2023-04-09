package Centre_tri;

public class Jaune extends Bac {

	static String couleur = "jaune";
	
	public Jaune(int identifiant) {
        super(identifiant, "jaune");
    }
	@Override
	public String getCouleur() {
		return "jaune";
	}
	public void setCouleur(String jaune) {
		Jaune.couleur = "jaune";
	}
}
