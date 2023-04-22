package com.cytech.Usuelles;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.Console;
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
	            FileReader reader = new FileReader("Centre_tri.csv");
	            try (BufferedReader bufferedReader = new BufferedReader(reader)) {
					String line = bufferedReader.readLine();
					if (line != null && line.trim().length() > 0){
						fichier += line;
		
					}
					while(line != null){
						line = bufferedReader.readLine();
						fichier += line;
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
				if (i.split(";")[columnn].equals(n)){
					if (i.split(";")[columnp].equals(p)) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			return false;
		}
	}
	public boolean IsinFile(int id,String element){
		String fichier = new String();
		try {
            FileReader reader = new FileReader("Centre_tri.csv");
            try (BufferedReader bufferedReader = new BufferedReader(reader)) {
				String line = bufferedReader.readLine();
				if (line != null && line.trim().length() > 0){
					fichier += line;
	
				}
				while(line != null){
					line = bufferedReader.readLine();
					fichier += line;
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
			if (i.split(";")[id].equals(element)){
				return true;
			}
		}
		return false;
	}
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	
	
}
