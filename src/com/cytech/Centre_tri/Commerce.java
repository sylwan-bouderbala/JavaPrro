package com.cytech.Centre_tri;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Commerce {
	private int Id;
	private String adresse;
	private ArrayList<Contrat> Contrats;
	private String Name;
	
	public Commerce(String adresse,int Id, String Name) {
		this.setId(Id);
		this.setAdresse(adresse);
		this.setName(Name);
		Contrats = new ArrayList<Contrat>();
	}
	//Ajout d'un contrat et impression dans un fichier du contrat
	public Contrat NouveauContrat(String Name,Commerce Commerce,Date DateDebut,Date DateFin) {
		Contrat Contrat = new Contrat(Name,Commerce,DateDebut,DateFin);
		Contrat.setId(Contrats.size()+1);
		Contrats.add(Contrat);
		
		
		String chaine = String.valueOf(Contrat.getId()) +";"+ this.Name +";" +String.valueOf(this.Id)+";"+String.valueOf(DateDebut)+";"+String.valueOf(DateFin)+";";
		for(Reduction e : Contrat.getReductions()){
			chaine += String.valueOf(e.getId())+";";
		}
		chaine = chaine + "\n";
        try {
            FileWriter writer = new FileWriter("Contrats.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(chaine);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
		
		return Contrat;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	public ArrayList<Contrat> getContrats() {
		return Contrats;
	}
	
	public void setContrats(ArrayList<Contrat> contrats) {
		Contrats = contrats;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
}

