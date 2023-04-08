package Centre_tri;

public class StatsAEnregistrer {
	private int identifiantMenage;
    private String quartierMenage;
    private String couleurPoubelle;
    private int identifiantPoubelle;
    private float poidsDechet;
    private int nbDechets;
    private boolean valeurVerifier;
    

    public StatsAEnregistrer(int idMenage, String quartier, String couleur, int idPoubelle, float poids, int nbDechets, boolean verif) {
        this.identifiantMenage = idMenage;
        this.quartierMenage = quartier;
        this.couleurPoubelle = couleur;
        this.identifiantPoubelle = idPoubelle;
        this.poidsDechet = poids;
        this.nbDechets = nbDechets;
        this.valeurVerifier = valeurVerifier;
    }
    public int getIdentifiantMenage() {
        return identifiantMenage;
    }

    public void setIdentifiantMenage(int identifiantMenage) {
        this.identifiantMenage = identifiantMenage;
    }

    public String getQuartierMenage() {
        return quartierMenage;
    }

    public void setQuartierMenage(String quartierMenage) {
        this.quartierMenage = quartierMenage;
    }

    public String getCouleurPoubelle() {
        return couleurPoubelle;
    }

    public void setCouleurPoubelle(String couleurPoubelle) {
        this.couleurPoubelle = couleurPoubelle;
    }

    public int getIdentifiantPoubelle() {
        return identifiantPoubelle;
    }

    public void setIdentifiantPoubelle(int identifiantPoubelle) {
        this.identifiantPoubelle = identifiantPoubelle;
    }

    public float getPoidsDechet() {
        return poidsDechet;
    }

    public void setPoidsDechet(float poidsDechet) {
        this.poidsDechet = poidsDechet;
    }

    public int getNbDechets() {
        return nbDechets;
    }

    public void setNbDechets(int nbDechets) {
        this.nbDechets = nbDechets;
    }

    public boolean isValeurVerifier() {
        return valeurVerifier;
    }

    public void setValeurVerifier(boolean valeurVerifier) {
        this.valeurVerifier = valeurVerifier;
    }
}
    
    
