package Centre_tri;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

import org.json.JSONObject;

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

	private int getIdentifiant()
	{
		return identifiant;
	}

	private String getmotdePasse()
	{
		return motDePasse;
	}

	private int getnbPersonnes()
	{
		return nbPersonnes;
	}

	private int getptsFidelite()
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

	public void enregistrerNvCompteMenage(int identifiant, String motDePasse, String quartier, int nbPersonnes,
		int ptsFidelite)
	{
		// Création de l'objet JSON
		JSONObject object = new JSONObject();
		object.put("identifiant", identifiant);
		object.put("motDePasse", motDePasse);
		object.put("quartier", quartier);
		object.put("nbPersonnes", nbPersonnes);
		object.put("ptsFidelite", ptsFidelite);

		// Sauvegarde des résultats dans un fichier JSON
		// TODO: Définir le nom du fichier clairement Pour le moment, le fichier est statique.
		try (FileWriter fr = new FileWriter("compteMenage.json")) {
			fr.append(object.toString());
			fr.flush();
		} catch (IOException e) {
			System.out.printf("Erreur lors de la sauvegarde du fichier [compteMenage.json] : [%s]%n%n",
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
