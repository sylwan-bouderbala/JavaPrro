package com.cytech.Centre_tri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Statistiques {
	private int id;
	private String CheminBaseDonne; //utliser jdbc
	private HashMap<String,ArrayList<Float>> moyenne_quartier;
	private HashMap<Integer, Contrat> Contrats;
	private ArrayList<String> ListeQuartier;

	
	public Statistiques(String cheminBaseDonne) {
		ListeQuartier = new ArrayList<>();
        CheminBaseDonne = cheminBaseDonne;
		GetListeQuartier();
    }

    //ici toujte les classe de calcul
	//Classe de calcul de la moyenne pour chaque quartier de la validité des dépots 1 si le dépot est mauvais 0 si il est bon
	public HashMap<String,Float> MoyenneParQuartierValidite() {
		HashMap<String,ArrayList<Integer>> Temp = new HashMap<>();
		String fichier = "stats_poubelle.csv";
        for (String entry : ListeQuartier) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(0);
			list.add(0);
			
			Temp.put(entry, list);

        }  
		try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String line = reader.readLine();
			if (line != null && line.trim().length() > 0){
				String[] tab = line.split(",");
				ArrayList<Integer> value = Temp.get(tab[1]);
				if (value != null){
				int AncienneValF = value.get(0);
				int AncienneValC = value.get(1);
				int NouvelleValF = AncienneValF;
				if (tab[6].equals("false")){
					NouvelleValF = AncienneValF+1;
				}
				else {
					
					NouvelleValF = AncienneValF;
				}
				int NouvelleValC = AncienneValC+1;
				value.set(0, NouvelleValF);
				value.set(1, NouvelleValC);
			}

            }
            while(line != null){
                line = reader.readLine();
				if (line != null && line.trim().length() > 0){
				String[] tab = line.split(",");
				ArrayList<Integer> value = Temp.get(tab[1]);
				if (value != null){
				int AncienneValF = value.get(0);
				int AncienneValC = value.get(1);
				int NouvelleValF = AncienneValF;
				if (tab[6].equals("false")){
					NouvelleValF = AncienneValF+1;
				}
				else {
					
					NouvelleValF = AncienneValF;
				}
				int NouvelleValC = AncienneValC+1;
				value.set(0, NouvelleValF);
				value.set(1, NouvelleValC);
			}

            }
		}

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
		System.out.println(Temp);
		HashMap<String, Float> Moyenne = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : Temp.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            float sum = (float) value.get(0) / value.get(1);
            Moyenne.put(key, sum);
        }
		return Moyenne;
		
	}
	public HashMap<String, HashMap<String,Float>> MoyenneQuantitéParQuartier (){
		HashMap<String, HashMap<String,Float>> tableau = new HashMap<String, HashMap<String, Float>>();
		
		String fichier = "datas\\stats_poubelle.csv";
        for (String entry : ListeQuartier) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(0);
			list.add(0);
			
			Temp.put(entry, list);

        }  
		try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String line = reader.readLine();
			if (line != null && line.trim().length() > 0){
				String[] tab = line.split(",");
				ArrayList<Integer> value = Temp.get(tab[1]);
				if (value != null){
				int AncienneValF = value.get(0);
				int AncienneValC = value.get(1);
				int NouvelleValF = AncienneValF;
				if (tab[6].equals("false")){
					NouvelleValF = AncienneValF+1;
				}
				else {
					
					NouvelleValF = AncienneValF;
				}
				int NouvelleValC = AncienneValC+1;
				value.set(0, NouvelleValF);
				value.set(1, NouvelleValC);
			}

            }
            while(line != null){
                line = reader.readLine();
				if (line != null && line.trim().length() > 0){
				String[] tab = line.split(",");
				ArrayList<Integer> value = Temp.get(tab[1]);
				if (value != null){
				int AncienneValF = value.get(0);
				int AncienneValC = value.get(1);
				int NouvelleValF = AncienneValF;
				if (tab[6].equals("false")){
					NouvelleValF = AncienneValF+1;
				}
				else {
					
					NouvelleValF = AncienneValF;
				}
				int NouvelleValC = AncienneValC+1;
				value.set(0, NouvelleValF);
				value.set(1, NouvelleValC);
			}

            }
		}

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
		System.out.println(Temp);
		HashMap<String, Float> Moyenne = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : Temp.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            float sum = (float) value.get(0) / value.get(1);
            Moyenne.put(key, sum);
        }
		return Moyenne;
		
		return tableau;
	}
	public void GetListeQuartier(){
		String fichier = "./datas/stats_poubelle.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String line = reader.readLine();
            while(line != null){
				
                line = reader.readLine();
				if (line != null && line.trim().length() > 0){
				String[] tab = line.split(",");
				if (this.ListeQuartier.contains(tab[1]) == false){
					this.ListeQuartier.add(tab[1]);
				}

            }
		}

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
	}
	//GETTER ET SETTER
	public HashMap<String,ArrayList<Float>> getMoyenne_quartier() {
		return moyenne_quartier;
	}

	public void setMoyenne_quartier(HashMap<String,ArrayList<Float>> moyenne_quartier) {
		this.moyenne_quartier = moyenne_quartier;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCheminBaseDonne() {
		return CheminBaseDonne;
	}

	public void setCheminBaseDonne(String cheminBaseDonne) {
		this.CheminBaseDonne = cheminBaseDonne;
	}

	public HashMap<Integer, Contrat> getContrats() {
		return Contrats;
	}

	public void setContrats(HashMap<Integer, Contrat> contrats) {
		Contrats = contrats;
	}

	public ArrayList<String> getListeQuartier() {
		return ListeQuartier;
	}

	public void setListeQuartier(ArrayList<String> listeQuartier) {
		ListeQuartier = listeQuartier;
	}
	
}
