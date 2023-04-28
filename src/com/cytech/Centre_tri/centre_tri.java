package com.cytech.Centre_tri;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import com.cytech.Poubelle.Poubelle;
//TODO : verifier que le Centre de tri est pas deja dans le fichier
import com.cytech.Usuelles.LectureFichier;



public class centre_tri {
	private int identifiant ;
	private String nom;
	private String Password;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	private String adresse;
	

	public  Statistiques stats;
	private ArrayList<Contrat> contrats;
	private ArrayList<Poubelle> Poubelles;

	//creer un centre de tri et l'enregistrer dans un fichier si il n'y est pas déjà
	public centre_tri(String adresse, String nom, String Password){
		LectureFichier lecteur = new LectureFichier("datas\\Centre_tri.csv");
		this.adresse = adresse;
		this.nom = nom;
		this.identifiant = (int) lecteur.countLineJava() + 1;
		this.Password = Password;
		this.stats = new Statistiques("stats_poubelle.csv");
		this.Poubelles = new ArrayList<Poubelle>();
		this.contrats = new ArrayList<Contrat>();
		if (lecteur.IsinFile(1, nom)==true){
			System.out.println("deja dans le fichier");
		}
		else {
			Printline();
		}
	}
	//Fonction d'inscription dans un fichier tout est séparé par des points virgules
	private void Printline(){
		//les listes de poubelles et de contrat sont séparé par des /
		String stringPoubelles = "/";
		for (Poubelle e : Poubelles){
			stringPoubelles += String.valueOf(e.getIdentifiant())+"/";
		}

		String stringContrat = "/";
		for (Contrat e : contrats){
			stringContrat += String.valueOf(e.getId())+"/";
		}

		String chaine = String.valueOf(this.getIdentifiant()) +";"+ this.nom +";" +String.valueOf(this.Password)+";"+stringContrat+";"+stringPoubelles+";"+this.adresse+";";

		chaine = chaine + "\n";
        try {
            FileWriter writer = new FileWriter("datas\\Centre_tri.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(chaine);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
	}
	//retirer une poubelle
	public void Retirer(Poubelle p) {
		Poubelles.remove(p.getIdentifiant());
	}
	//
	public void AddPoubelle(Poubelle p) {
		this.Poubelles.add(p);
	}
	public void Ajouter(Poubelle p) {
		AddPoubelle(p);
		LectureFichier lecteur = new LectureFichier("datas\\Centre_tri.csv");
		String inputFile = lecteur.getFichier();
        int n = lecteur.Isinlinenth(1, this.nom); 
        System.out.println(n);
        String stringPoubelles = "/";
		for (Poubelle e : Poubelles){
			stringPoubelles += String.valueOf(e.getIdentifiant())+"/";
		}

		String stringContrat = "/";
		for (Contrat e : contrats){
			stringContrat += String.valueOf(e.getId())+"/";
		}

		String replacementText = String.valueOf(this.getIdentifiant()) +";"+ this.nom +";" +String.valueOf(this.Password)+";"+stringContrat+";"+stringPoubelles+";"+this.adresse+";";

		 List<String> lines = new ArrayList<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
	            String line;
	            try {
					while ((line = reader.readLine()) != null) {
					    lines.add(line);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        } catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	        
	        if (n > 0 && n <= lines.size()) {
	            lines.set(n - 1, replacementText);
	            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
	                for (String line : lines) {
	                    writer.write(line);
	                    writer.newLine();
	                }
	            } catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            System.out.println("Line " + n + " has been replaced.");
	        } else {
	            System.out.println("Line " + n + " does not exist in the file.");
	        }
	    
	}
	public void Collecter(Poubelle p) {
		if( p.getIdentifiant() <= Poubelles.size()) {
			//methode pour collecter les poubelles
		}
		else {
			System.out.println("la poubelle : "+p.getIdentifiant()+" n'appartient pas au centre-de-tri");
		}
	}
	//GET ET SETTER
	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}


	public ArrayList<Contrat> getContrats() {
		return contrats;
	}

	public void setContrat(ArrayList<Contrat> contrat) {
		this.contrats = contrat;
	}

	public Statistiques getStats() {
		return stats;
	}

	public void setStats(Statistiques stats) {
		this.stats = stats;
	}

	public void setContrats(ArrayList<Contrat> contrats) {
		this.contrats = contrats;
	}

	public ArrayList<Poubelle> getPoubelles() {
		return Poubelles;
	}

	public void setPoubelles(ArrayList<Poubelle> poubelles) {
		Poubelles = poubelles;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
