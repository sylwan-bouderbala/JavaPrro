package com.cytech.Test;

import com.cytech.Poubelle.Bac;
import com.cytech.Poubelle.Vert;

public class VertTest {

    private static void Test(boolean bool) {
        if (bool == true) {
            System.out.println("\033[32mTest Validé\033[0m");
        } else {
            System.out.println("\033[31mEchec\033[0m");
        }
    }

    public static void testGetIdentifiant() {
        Bac bac = new Vert(1);
        int identifiant = bac.getIdentifiant();
        Test(1 == identifiant);
    }

    public static void testSetIdentifiant() {
        Bac bac = new Vert(1);
        bac.setIdentifiant(2);
        int identifiant = bac.getIdentifiant();
        Test(2 == identifiant);
    }

    public static void testGetCouleur() {
        Bac bac = new Vert(1);
        String couleur = "";
        try {
            couleur = bac.getCouleur();
        } catch (UnsupportedOperationException e) {
            couleur = e.getMessage();
        }
        Test(couleur.equals("vert"));
    }

    public static void main(String[] args) {
        testGetIdentifiant();
        testSetIdentifiant();
        testGetCouleur();
    }
}