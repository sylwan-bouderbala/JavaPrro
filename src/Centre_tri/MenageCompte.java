package Centre_tri;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;



public class MenageCompte implements Serializable
{
	private int identifiant;

	private String motDePasse;

	public String quartier;

	private int nbPersonnes;

	private int ptsFidelite;

	private ArrayList<CorbeilleOperation> operation;

	public MenageCompte(int identifiant, String motDePasse, String quartier, int nbPersonnes, int ptsFidelite)
	{
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.quartier = quartier;
		this.nbPersonnes = nbPersonnes;
		this.ptsFidelite = ptsFidelite;
	}

	public int getIdentifiant()
	{
		return identifiant;
	}

	public String getmotdePasse()
	{
		return motDePasse;
	}

	public int getnbPersonnes()
	{
		return nbPersonnes;
	}

	public int getptsFidelite()
	{
		return ptsFidelite;
	}

	public int consulter()
	{
		return this.ptsFidelite;
	}

	public MenageCompte creerCompte(int identifiant, String motDePasse, String quartier, int nbPersonnes,
		int ptsFidelite)
	{
		MenageCompte nvMenageCompte = new MenageCompte(identifiant, motDePasse, quartier, nbPersonnes, ptsFidelite);
		return nvMenageCompte;
	}

    public void enregistrerMenageCompte(MenageCompte nouveauMenageCompte) {

        // Création d'un objet Gson pour convertir l'objet MenageCompte en JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Conversion de l'objet MenageCompte en JSON
        String json = gson.toJson(nouveauMenageCompte);

        // Enregistrement du JSON dans un fichier
        try (FileWriter writer = new FileWriter("compteMenage.json")) {
            writer.write(json);
        } catch (IOException e) {
            System.out.printf("Erreur lors de l'enregistrement du fichier [compteMenage.json] : [%s]%n%n",
                e.getMessage());
        }
    }

	public void utiliser(int ptsFideliteAUtiliser)
	{
		if (ptsFideliteAUtiliser <= this.ptsFidelite) {
			this.ptsFidelite -= ptsFideliteAUtiliser;
		} else {
			System.out.println("Impossible : vous avez trop peu de points de fidélité");
		}
	}

	public int convertir(int taux, String produit, int ptsFidelietnecessaires)
	{
		if (ptsFidelietnecessaires <= this.ptsFidelite) {
			this.ptsFidelite -= ptsFidelietnecessaires;
			return taux;
		} else {
			System.out.println("Impossible : vous avez trop peu de points de fidélité");
			return 0;
		}
	}

	public void incrementFidelite()
	{
		this.ptsFidelite++;
	}

	public void decrementFidelite()
	{
		this.ptsFidelite--;
	}
}
