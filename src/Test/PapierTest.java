package Test;

import Centre_tri.Papier;

public class PapierTest {
    
    private static void Test(boolean bool) {
        if (bool == true) {
            System.out.println("Vrai");
        } else {
            System.out.println("False");
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
