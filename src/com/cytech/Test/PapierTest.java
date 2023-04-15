package com.cytech.Test;

import com.cytech.Poubelle.Papier;

public class PapierTest {
    
    private static void Test(boolean bool) {
        if (bool == true) {
            System.out.println("\033[32mTest Validé\033[0m");
        } else {
            System.out.println("\033[31mEchec\033[0m");
        }
    }

    public static void testGetType() {
        Papier papier = new Papier(1, 10.0f);
        String type = papier.getType();
        Test(type.equals("papier"));
    }

    public static void testGetPoids() {
        Papier papier = new Papier(1, 10.0f);
        float poids = papier.getPoids();
        Test(poids == 10.0f);
    }

    public static void main(String[] args) {
        testGetType();
        testGetPoids();
    }
}
