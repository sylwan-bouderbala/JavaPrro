package com.cytech.Menage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;



public class MenageCompte {

	private int identifiant;

	private String motDePasse;

	private String quartier;

	private int nbPersonnes;

	private int ptsFidelite;


	public MenageCompte(int identifiant, String motDePasse, String quartier, int nbPersonnes, int ptsFidelite) {
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.quartier = quartier;
		this.nbPersonnes = nbPersonnes;
		this.ptsFidelite = ptsFidelite;
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


	public void enregistrerMenageCompte(MenageCompte nouveauMenageCompte) {
	    // Ouvrir le fichier CSV en mode Ècriture
	    try (FileWriter writer = new FileWriter("./datas/compteMenage.csv", true)) { // true pour ajouter les donnÈes ‡ la fin du fichier
	        // CrÈer une ligne de donnÈes pour le nouvel objet MenageCompte
	        String ligne = String.format("%d;%s;%s;%d;%d", nouveauMenageCompte.getIdentifiant(), nouveauMenageCompte.getmotdePasse(), nouveauMenageCompte.getQuartier(), nouveauMenageCompte.getNbPersonnes(), nouveauMenageCompte.getptsFidelite());
	        // …crire la ligne de donnÈes dans le fichier
	        writer.write(ligne);
	        writer.write(System.lineSeparator()); // saut de ligne pour faciliter la lecture
	        writer.flush(); // flush pour vider le buffer et Ècrire les donnÈes sur le disque
	    } catch (IOException e) {
	        System.out.printf("Erreur lors de l'enregistrement du fichier [compteMenage.csv] : [%s]%n%n", e.getMessage());
	    }
	}
	 
	public void utiliser(MenageCompte m, int ptsAUtiliser)
	{
		int ptsAdisposition = m.getptsFidelite();
		if (ptsAdisposition >= ptsAUtiliser) {
		 int ptsFidelite= m.getptsFidelite()-ptsAUtiliser;
		 m.setPtsFidelite(ptsFidelite);
		}
		else {
			System.out.println("Impossible : vous avez trop peu de points de fid√©lit√©");
		}
	}
	// Cette m√©thode est cens√©e retourner la ligne o√π se trouve le mot cherch√©
	public static String trouverLigne(String fichier, String mot) {
	    String ligne = null;
	    BufferedReader reader = null;

	    try {
	        reader = new BufferedReader(new FileReader(fichier));
	        String currentLine;

	        while ((currentLine = reader.readLine()) != null) {
	            if (currentLine.contains(mot)) {
	                ligne = currentLine;
	                break;
	            }
	        }
	    } catch (IOException e) {
	        System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
	    } finally {
	        if (reader != null) {
	            try {
	                reader.close();
	            } catch (IOException e) {
	                System.err.println("Erreur lors de la fermeture du fichier : " + e.getMessage());
	            }
	        }
	    }

	    return ligne;
	}

	  
	
	public int convertir(int taux, String produit, MenageCompte m) {
		int pointsFidelite= m.getptsFidelite();
		String mot = MenageCompte.trouverLigne("./datas/reductions.csv", produit);
		String[] tableau = mot.split(";");
		taux = Integer.parseInt(tableau[1]);
		int pourcentage = pointsFidelite*taux/100;
		return pourcentage;
	}

	public void incrementFidelite(MenageCompte m) {
		int pointsFidelite= (m.getptsFidelite()+1);
		m.setPtsFidelite(pointsFidelite);
	}

	public void decrementFidelite(MenageCompte m) {
		int pointsFidelite= (m.getptsFidelite()-1);
		m.setPtsFidelite(pointsFidelite);
	}

	public static void main(String[] args) {
        MenageCompte menage = new MenageCompte(1, "password", "Quartier A", 4, 10);
        menage.enregistrerMenageCompte(menage);
    }
	
}
