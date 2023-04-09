package Test;

import java.util.ArrayList;
import java.util.HashMap;

import Centre_tri.Statistiques;

public class StatTest {
    private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("Vrai");
		}
		else {
			System.out.println("False");
		}
	}

    private static void TestStatistiqueValiditéParQuartier() {
        Statistiques stats = new Statistiques("stat_poubelle.csv");
    }
    public static void main(String[] args){
        Statistiques stats = new Statistiques("stat_poubelle.csv");
        System.out.println(stats.MoyenneParQuartierValidite());
    } 
}