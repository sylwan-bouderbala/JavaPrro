package Test;

import java.util.HashMap;

import Centre_tri.Statistiques;

public class StatTest {
    public static void main(String[] args){
        Statistiques stats = new Statistiques("stat_poubelle.csv");
        System.out.println(stats.MoyenneParQuartierValidite());
    } 
}