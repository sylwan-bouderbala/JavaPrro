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
        return "Impossible : cette couleur n'existe pas;
    }

    public void setCouleur(String couleur)
    {
        this.couleur = couleur;
    }
}
