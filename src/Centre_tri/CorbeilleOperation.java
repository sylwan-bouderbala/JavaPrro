package Centre_tri;

import java.util.Date;
import Centre_tri.MenageCompte;

public class CorbeilleOperation {
    private Poubelle poubelle;
    private MenageCompte menageCompte;
    private int nbDechets;
    private Float quantite;
    private String typeDechet;
    private Date date;
    private boolean valeurVerifier;
    private String couleurBacUtilise;
    private int idDechet;


    public CorbeilleOperation(Poubelle poubelle, MenageCompte menageCompte, int nbDechets, 
    Float quantite, String typeDechet ,Date date, boolean valeurVerifier, String couleurBacUtilise, int idDechet) {
        this.poubelle = poubelle;
        this.menageCompte = menageCompte;
        this.nbDechets = nbDechets;
        this.quantite = quantite;
        this.typeDechet = typeDechet;
        this.date = date;
        this.valeurVerifier = valeurVerifier;
        this.couleurBacUtilise = couleurBacUtilise;
        this.idDechet=idDechet;
    }

    public Poubelle getPoubelle() {
        return poubelle;
    }

    public void setPoubelle(Poubelle poubelle) {
        this.poubelle = poubelle;
    }

    public MenageCompte getMenageCompte() {
        return menageCompte;
    }

    public void setMenageCompte(MenageCompte menageCompte) {
        this.menageCompte = menageCompte;
    }

    public int getNbDechets() {
        return nbDechets;
    }

    public void setNbDechets(int nbDechets) {
        this.nbDechets = nbDechets;
    }

    public Float getQuantite() {
        return quantite;
    }

    public void setQuantite(Float quantite) {
        this.quantite = quantite;
    }

    public String getTypeDechet() {
        return typeDechet;
    }

    public void setTypeDechet(String typeBac) {
        this.typeDechet = typeBac;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isValeurVerifier() {
        return valeurVerifier;
    }

    public void setValeurVerifier(boolean valeurVerifier) {
        this.valeurVerifier = valeurVerifier;
    }

    public String getCouleurBac() {
        return couleurBacUtilise;
    }

    public void setCouleurBac(String couleurBacUtilise) {
        this.couleurBacUtilise = couleurBacUtilise;
    }
    public int getIdDechets() {
    	return idDechet;
    }
    
    public 

    // Pb ajouterDechets
    public void ajouterDechets(MenageCompte c, int nbDechets, CorbeilleOperation o) {
        this.nbDechets += nbDechets;
        this.quantite = quantite;
        this.typeDechet = typeDechet;
        this.date = date;
        this.valeurVerifier = valeurVerifier;
        this.couleurBacUtilise = couleurBacUtilise;
        o.getMenageCompte().setPtsFidelite(o.getMenageCompte().getptsFidelite());
    }
}
