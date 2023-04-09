package Test;

import java.util.HashMap;

import Centre_tri.Statistiques;

public class StatTest {
    public static void main(String[] args){
        Statistiques stat = new Statistiques();
		HashMap<String,Float> Moyennes = new HashMap<>();
		Moyennes = stat.MoyenneParQuartier();

		for(String e : Moyennes.keySet()){
			System.out.println(e + " : " + Moyennes.get(e));
		}
    } 
}