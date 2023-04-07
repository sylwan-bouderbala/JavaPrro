package Centre_tri;

public class Bac
{
    private int identifiant;

    private String couleur;

    public Bac(int identifiant, String couleur)
    {
        this.identifiant = identifiant;
    }

    public int getIdentifiant()
    {
        return this.identifiant;
    }

    public void setIdentifiant(int identifiant)
    {
        this.identifiant = identifiant;
    }

    public String getCouleur()
    {
        return couleur;
    }

    public void setCouleur(String couleur)
    {
        this.couleur = couleur;
    }
}
