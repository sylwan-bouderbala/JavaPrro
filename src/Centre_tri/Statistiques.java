package Centre_tri;

import java.util.ArrayList;
import java.util.HashMap;

public class Statistiques {
	private int id;
	private char[] CheminBaseDonne; //utliser jdbc
	private HashMap<String,ArrayList<Float>> moyenne_quartier;
	private HashMap<Integer, Contrat> Contrats;
	
	

	//ici toujte les classe de calcul
	
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

	public char[] getCheminBaseDonne() {
		return CheminBaseDonne;
	}

	public void setCheminBaseDonne(char[] cheminBaseDonne) {
		CheminBaseDonne = cheminBaseDonne;
	}
	
}
