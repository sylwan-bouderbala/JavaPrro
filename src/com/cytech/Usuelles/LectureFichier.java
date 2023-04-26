package com.cytech.Usuelles;

import java.io.*;
import java.util.ArrayList;

import com.cytech.Centre_tri.centre_tri;
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
				//System.out.println("pb ici");
				return false;
				
			}

			for (String i : temp){
				//System.out.println(i.split(";")[columnn]);
				//System.out.println(n);
				if (!i.isBlank() && !i.isEmpty() && i.split(";").length==6) {
					if (i.split(";")[columnn].equals(n)){
					//System.out.println("Noms egaux");
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String line = null;
        int lineNumber = 0;
        int targetLineNumber = this.Isinlinenth(selecteur, selectant); // the line number you want to read

        try {
			while ((line = reader.readLine()) != null) {
			    lineNumber++;
			    if (lineNumber == targetLineNumber) {
			        //System.out.println(line);
			        break;
			    }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //System.out.println(line+"Catogan");
        centre_tri centre_tri = new centre_tri(line.split(";")[5], line.split(";")[1], line.split(";")[2]);
        /*if (line.split(";")[3] !=null) {
			
		}*/
		return centre_tri;

	}
	
public MenageCompte create_object_menage_compte(int selecteur,String selectant) {
		
        File file = new File(this.fichier);
        BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String line = null;
        int lineNumber = 0;
        int targetLineNumber = this.Isinlinenth(selecteur, selectant); // the line number you want to read

        try {
			while ((line = reader.readLine()) != null) {
			    lineNumber++;
			    if (lineNumber == targetLineNumber) {
			        System.out.println(line);
			        break;
			    }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        centre_tri centre_tri = new centre_tri(line.split(";")[6], line.split(";")[1], line.split(";")[2]);
        if (line.split(";")[3] !=null) {
			
		}
		return centre_tri;

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
				System.out.println(line);
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
	
	
}
