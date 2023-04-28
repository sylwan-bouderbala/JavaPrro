package com.cytech.Usuelles;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.cytech.Centre_tri.centre_tri;
import com.cytech.Menage.MenageCompte;
import com.cytech.Poubelle.Poubelle;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
public class LectureFichier {
	private String fichier ;
	private int NombreNormalElement;

	public LectureFichier(String fichier) {
		setFichier(fichier);
	}
	public int getNombreNormalElement() {
		return NombreNormalElement;
	}
	public void setNombreNormalElement(int nombreNormalElement) {
		NombreNormalElement = nombreNormalElement;
	}

	public  long countLineJava() {

	      long lines = 0;
	      try (BufferedReader reader = new BufferedReader(new FileReader(this.fichier))) {
	          while (reader.readLine() != null) lines++;
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	      return lines;
    }
	
	public String getFichier() {
		return fichier;
	}
	
	public boolean Check_password(int columnp, int columnn, String p , String n) {
		if (!this.IsinFile(columnn, n)){
			return false;
		}
		else {
			String fichier = new String();
			try {
	            FileReader reader = new FileReader(this.fichier);
	            try (BufferedReader bufferedReader = new BufferedReader(reader)) {
					String line = bufferedReader.readLine();
					if (line != null && line.trim().length() > 0){
						fichier += line+ "\n";
		
					}
					while(line != null){
						line = bufferedReader.readLine();
						fichier += line + "\n";
					}
				}
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }
			String[] temp = fichier.split("\n");
			if (temp == null || (temp[0].split(";").length == 1)){
				return false;
				
			}

			for (String i : temp){
				if (!i.isBlank() && !i.isEmpty() && i.split(";").length==6) {
					if (i.split(";")[columnn].equals(n)){
						System.out.println(i.split(";")[columnp]);
						if (i.split(";")[columnp].equals(p)) {
							
						return true;
					}
				}
			}
		}
			return false;
		}
	}
	
	public centre_tri create_object_centre_tri(int selecteur,String selectant) {
		
        File file = new File(this.fichier);
        BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        String line = null;
        int lineNumber = 0;
        int targetLineNumber = this.Isinlinenth(selecteur, selectant); 

        try {
			while ((line = reader.readLine()) != null) {
			    lineNumber++;
			    if (lineNumber == targetLineNumber) {
			        break;
			    }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

        try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        //System.out.println(line+"Catogan");
        centre_tri centre_tri = new centre_tri(line.split(";")[5], line.split(";")[1], line.split(";")[2]);
        for (String e :line.split(";")[4].split("/") ) {
        	//System.out.println("elemnt pbo : "+e);
        }
        if (line.split(";")[4] !="/") {
			if (line.split(";")[4].split("/") != null) {
				for (String e : line.split(";")[4].split("/")) {
					System.out.println("il rentre ");
					if (e != "") {
					centre_tri.getPoubelles().add(this.CreatePoubelle(Integer.parseInt(e)));
				
					}
				}
			}
		}
		return centre_tri;

	}
	



	public MenageCompte handleLogin(String id,String mdp) {
	    String identifiant = id;
	    String motDePasse = mdp;
	
	    MenageCompte compte = login(identifiant, motDePasse);
	
	    if (compte != null) {
	        // Les identifiants sont corrects, on cr�e l'objet Compte et on passe � la page suivante
	        return compte;
	    } else {
	        // Les identifiants sont incorrects, on affiche une alerte
	        return null;
	    }
	}

public MenageCompte login(String identifiant, String motDePasse) {
    try {
        // Ouverture du fichier des comptes
        File file = new File(this.fichier);
        try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
			    String line = scanner.nextLine();
			    String[] elements = line.split(";");

			    // V�rification si les identifiants sont corrects
			    if (elements[0].equals(identifiant) && elements[1].equals(motDePasse)) {
			    	int id = Integer.parseInt(elements[0]);
			    	int nbPts = Integer.parseInt(elements[3]);
			    	int nbPers =Integer.parseInt(elements[4]);
			        return new MenageCompte(id, elements[1],elements[2],nbPts,nbPers);
			    }
			}
			scanner.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    } catch (FileNotFoundException e) {
        System.out.println("Fichier de comptes non trouv�");
    }

    return null;
}

	public int Isinlinenth(int id, String element) {
		int nbline = 1;
		if (IsinFile(id, element)) {
			try {
	            FileReader reader = new FileReader(this.fichier);
	            try (BufferedReader bufferedReader = new BufferedReader(reader)) {
					String line = bufferedReader.readLine();
					if (line != null && line.trim().length() > 0){
						if (line.split(";")[id].equals(element)) {
							return nbline ++;
						}
						else {
							nbline ++;
						}
					}
					while(line != null){
						line = bufferedReader.readLine();
						if (line != null) {
						if (line.split(";")[id].equals(element)) {
							return nbline ++;
						}
						else {
							nbline ++;
						}
						
						}
					}
				}
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }

		}
		return nbline;
	}
	
	public boolean IsinFile(int id,String element){
		String lignetemp = new String();
		try {
            FileReader reader = new FileReader(this.fichier);
            try (BufferedReader bufferedReader = new BufferedReader(reader)) {
				String line = bufferedReader.readLine();
				lignetemp = line ;
				if (lignetemp != null && line.trim().length() > 0){
					if (lignetemp.split(";")[id].equals(element)){
						
						return true;
					}
	
				}
				while(lignetemp != null){
					line = bufferedReader.readLine();
					lignetemp = line;
					if (lignetemp != null) {
						if (lignetemp.split(";")[id].equals(element)){
							return true;
						}
					}

				}
			}
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

		return false;
	}
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	
	
	public Poubelle CreatePoubelle(int id) {
		Poubelle poubelle = null;
		try {
	        // Ouverture du fichier des comptes
	        File file = new File("datas\\poubelles.csv");
	        Scanner scanner = new Scanner(file);

	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            String[] elements = line.split(";");
	            if (elements == null) {
	            	return null;
	            }
	            // V�rification si les identifiants sont corrects
	            if (elements[0].equals(String.valueOf(id))) {
	            	int id1 = Integer.parseInt(elements[0]);
	            	float Quantitémax = Float.parseFloat(elements[1]);
	            	float Quantité =Float.parseFloat(elements[2]);
	            	int CodeAcces = Integer.parseInt(elements[3]);
	            	String quartier = elements[4];
	                return new Poubelle(id1, Quantitémax,Quantité ,CodeAcces,quartier);
	            }
	        }
	        scanner.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("Fichier de comptes non trouv�");
	    }
		return poubelle;
	}
	public int sizefile() {
		try {
            BufferedReader reader = new BufferedReader(new FileReader(this.fichier));
            int lines = 0;
            while (reader.readLine() != null) lines++;
            reader.close();
            return lines;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
		return 0;
	}
}
