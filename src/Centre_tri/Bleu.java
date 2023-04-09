package Centre_tri;

public class Bleu extends Bac {
	static String couleur = "bleu";
	
	public Bleu(int identifiant) {
        super(identifiant, "bleu");
    }
	
	@Override
	public String getCouleur() {
		return "bleu";
	}
	
	public void setCouleur(String bleu) {
		Bleu.couleur = "bleu";
	}
	
}

