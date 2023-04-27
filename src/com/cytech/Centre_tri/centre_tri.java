package com.cytech.Centre_tri;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
	private void Printline(){
		
		String stringPoubelles = "";
		for (Poubelle e : Poubelles){
			stringPoubelles += String.valueOf(e.getIdentifiant())+"/";
		}

		String stringContrat = "";
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

	public void Retirer(Poubelle p) {
		Poubelles.remove(p.getIdentifiant());
	}
	public void Ajouter(Poubelle p) {
		this.Poubelles.add(p);
		try {
            // Open the input and output files
            BufferedReader reader = new BufferedReader(new FileReader("datas\\Centre_tri.csv"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("datas\\Centre_tri.csv"));
            LectureFichier lecteur = new LectureFichier("datas\\Centre_tri.csv");
            // Read each line of the input file and write it to the output file,
            // changing the line that needs to be updated
            String line;
            String stringPoubelles = "";
    		for (Poubelle e : Poubelles){
    			stringPoubelles += String.valueOf(e.getIdentifiant())+"/";
    		}

    		String stringContrat = "";
    		for (Contrat e : contrats){
    			stringContrat += String.valueOf(e.getId())+"/";
    		}

    		line = String.valueOf(this.getIdentifiant()) +";"+ this.nom +";" +String.valueOf(this.Password)+";"+stringContrat+";"+stringPoubelles+";"+this.adresse+";";
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (lineNumber == lecteur.Isinlinenth(0, String.valueOf(this.identifiant))) { // change line number 3
                    line = "This is the new line.";
                }
                writer.write(line + "\n");
                lineNumber++;
            }

            // Close the input and output files
            reader.close();
            writer.close();

            // Replace the input file with the output file
            File inputFile = new File("input.txt");
            File outputFile = new File("output.txt");
            inputFile.delete();
            outputFile.renameTo(inputFile);

            System.out.println("Line updated successfully!");
        } catch (IOException e) {
            System.out.println("Error updating line: " + e.getMessage());
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
