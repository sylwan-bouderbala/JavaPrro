package Centre_tri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Statistiques {
	private int id;
	private String CheminBaseDonne; //utliser jdbc
	private HashMap<String,ArrayList<Float>> moyenne_quartier;
	private HashMap<Integer, Contrat> Contrats;
	
	
	private ArrayList<String[]> Reader(){
		ArrayList<String[]> liste = new ArrayList<String[]>();
		try (BufferedReader reader = new BufferedReader(new FileReader(CheminBaseDonne))) {
            String line = reader.readLine();
			liste.add(line.split(";"));


            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
				liste.add(line.split(";"));
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
		return liste;
	}
	//ici toujte les classe de calcul
	public HashMap<String,Float> MoyenneParQuartier() {
		HashMap<String,Float> moyenne = new HashMap<>();
		String fichier = "stats_poubelle.csv";
		return moyenne;
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
	
}
