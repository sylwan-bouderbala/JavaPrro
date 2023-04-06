package TriSelectifPoubelle;

import java.util.Date;

public class RelationPoubelleMenage {
    private Poubelle poubelle;
    private MenageCompte menageCompte;
    private int nbDechets;
    private int identifiant;
    private Date heure;
    private float quantite;
    private String nature;
    private Date date;
    private boolean valeurVerifier;
    private String couleurBacUtilise;
    private int ptsFidelite;

    public RelationPoubelleMenage(Poubelle poubelle, MenageCompte menageCompte, int nbDechets, int identifiant, Date heure, float quantite, String nature, Date date, boolean valeurVerifier, String couleurBacUtilise, int ptsFidelite) {
        this.poubelle = poubelle;
        this.menageCompte = menageCompte;
        this.nbDechets = nbDechets;
        this.identifiant = identifiant;
        this.heure = heure;
        this.quantite = quantite;
        this.nature = nature;
        this.date = date;
        this.valeurVerifier = valeurVerifier;
        this.couleurBacUtilise = couleurBacUtilise;
        this.ptsFidelite = ptsFidelite;
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

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public Date getHeure() {
        return heure;
    }

    public void setHeure(Date heure) {
        this.heure = heure;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
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

    public String getCouleurBacUtilise() {
        return couleurBacUtilise;
    }

    public void setCouleurBacUtilise(String couleurBacUtilise) {
        this.couleurBacUtilise = couleurBacUtilise;
    }

    public int getPtsFidelite() {
        return ptsFidelite;
    }

    public void setPtsFidelite(int ptsFidelite) {
        this.ptsFidelite = ptsFidelite;
    }
    
    public void ajouterDechets(int nbDechets, int identifiant, Date heure, float quantite, String nature, Date date, boolean valeurVerifier, String couleurBacUtilise, int ptsFidelite) {
        this.nbDechets += nbDechets;
        this.identifiant = identifiant;
        this.heure = heure;
        this.quantite = quantite;
        this.nature = nature;
        this.date = date;
        this.valeurVerifier = valeurVerifier;
        this.couleurBacUtilise = couleurBacUtilise;
        this.ptsFidelite += ptsFidelite;
    }
}
