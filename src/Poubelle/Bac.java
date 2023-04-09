package Poubelle;

public class Bac
{
    private int identifiant;
    private String couleur;

    public Bac(int identifiant, String couleur) {
        this.identifiant = identifiant;
        this.couleur=couleur;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getCouleur() {
    	if (!couleur.equals("vert") && !couleur.equals("bleu") && !couleur.equals("jaune") && !couleur.equals("classique")) {
            throw new UnsupportedOperationException("Impossible : cette couleur n'existe pas");
    	}
    	return couleur;
    }
}

