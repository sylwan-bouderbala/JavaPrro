package Centre_tri;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDate;
import java.io.File;
import java.io.IOException;



public class MenageCompte implements Serializable
{
	private int identifiant;

	private String motDePasse;

	private String quartier;

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
	public String getQuartier() {
		return quartier;
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
	    // Ouvrir le fichier CSV en mode écriture
	    try (FileWriter writer = new FileWriter("compteMenage.csv", true)) { // true pour ajouter les données à la fin du fichier
	        // Créer une ligne de données pour le nouvel objet MenageCompte
	        String ligne = String.format("%s,%s,%s,%s", nouveauMenageCompte.getIdentifiant(),nouveauMenageCompte.getQuartier());
	        // Écrire la ligne de données dans le fichier
	        writer.write(ligne);
	        writer.write(System.lineSeparator()); // saut de ligne pour faciliter la lecture
	    } catch (IOException e) {
	        System.out.printf("Erreur lors de l'enregistrement du fichier [compteMenage.csv] : [%s]%n%n",
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