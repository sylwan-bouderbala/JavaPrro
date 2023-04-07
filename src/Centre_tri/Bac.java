package Centre_tri;

public class Bac
{
    private int identifiant;


    public Bac(int identifiant, String couleur)
    
    {
        this.identifiant = identifiant;
    }

    public int getIdentifiant()
    {
        return identifiant;
    }

    public void setIdentifiant(int identifiant)
    {
        this.identifiant = identifiant;
    }

    public String getCouleur() {
        return "Impossible : cette couleur n'existe pas";
    }
}

