package com.cytech.Usuelles;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class LectureFichier {
	private String fichier ;

	public LectureFichier(String fichier) {
		setFichier(fichier);
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

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	
	
}
