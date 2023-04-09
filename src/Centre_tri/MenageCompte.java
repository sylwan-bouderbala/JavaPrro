package Centre_tri;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;



public class MenageCompte implements Serializable {

	private int identifiant;

	private String motDePasse;

	private String quartier;

	private int nbPersonnes;

	private int ptsFidelite;

	private ArrayList<CorbeilleOperation> operation;

	public MenageCompte(int identifiant, String motDePasse, String quartier, int nbPersonnes, int ptsFidelite) {
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.quartier = quartier;
		this.nbPersonnes = nbPersonnes;
		this.ptsFidelite = ptsFidelite;
		operation = new ArrayList<>();
	}

	public int getIdentifiant() {
		return identifiant;
	}
	
	public void setIdentifiant(int identifiant) {
		this.identifiant=identifiant;
	}
	
	public String getQuartier() {
		return quartier;
	}
	public String getmotdePasse() {
		return motDePasse;
	}
	
	public void setMotdePasse(String motDePasse) {
		this.motDePasse=motDePasse;
	}
	
	public void setQuartier(String quartier) {
		this.quartier=quartier;
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}
	
	public void setnbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}

	public int getptsFidelite() {
		return ptsFidelite;
	}
	
	public void setPtsFidelite(int ptsFidelite) {
		this.ptsFidelite=ptsFidelite ;
	}


	public MenageCompte creerCompte(int identifiant, String motDePasse, String quartier, int nbPersonnes,
		int ptsFidelite) {
		MenageCompte nvMenageCompte = new MenageCompte(identifiant, motDePasse, quartier, nbPersonnes, ptsFidelite);
		return nvMenageCompte;
	}

	 public void enregistrerMenageCompte(MenageCompte nouveauMenageCompte) {
	        // Ouvrir le fichier CSV en mode écriture
	        try (FileWriter writer = new FileWriter("compteMenage.csv", true)) { // true pour ajouter les données à la fin du fichier
	            // Créer une ligne de données pour le nouvel objet MenageCompte
	            String ligne = String.format("%d,%s,%s,%d,%d", nouveauMenageCompte.getIdentifiant(), nouveauMenageCompte.getmotdePasse(), nouveauMenageCompte.getQuartier(), nouveauMenageCompte.getNbPersonnes(), nouveauMenageCompte.getptsFidelite());
	            // Écrire la ligne de données dans le fichier
	            writer.write(ligne);
	            writer.write(System.lineSeparator()); // saut de ligne pour faciliter la lecture
	            writer.flush(); // flush pour vider le buffer et écrire les données sur le disque
	        } catch (IOException e) {
	            System.out.printf("Erreur lors de l'enregistrement du fichier [compteMenage.csv] : [%s]%n%n", e.getMessage());
	        }
	    }
	
	 public void consulterHistoriqueDepots() {
		 
	 }
	 
	public void utiliser(int ptsFideliteAUtiliser)
	{
		if (ptsFideliteAUtiliser <= this.ptsFidelite) {
			this.ptsFidelite -= ptsFideliteAUtiliser;
		} else {
			System.out.println("Impossible : vous avez trop peu de points de fidélité");
		}
	}

	public int convertir(int taux, String produit, int ptsFidelietnecessaires) {
		if (ptsFidelietnecessaires <= this.ptsFidelite) {
			this.ptsFidelite -= ptsFidelietnecessaires;
			return taux;
		} else {
			System.out.println("Impossible : vous avez trop peu de points de fidélité");
			return 0;
		}
	}

	public void incrementFidelite() {
		this.ptsFidelite++;
	}

	public void decrementFidelite() {
		this.ptsFidelite--;
	}

	public static void main(String[] args) {
        MenageCompte menage = new MenageCompte(1, "password", "Quartier A", 4, 10);
        menage.enregistrerMenageCompte(menage);
    }
	
}
