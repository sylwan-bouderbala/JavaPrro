package Test;

import Centre_tri.Plastique;

public class PlastiqueTest {

    private static void Test(boolean bool) {
        if (bool == true) {
            System.out.println("Vrai");
        }
        else {
            System.out.println("False");
        }
    }

    public static void testGetType() {
        Plastique plastique = new Plastique(1, 0.5f);
        String type = plastique.getType();
        Test("plastique".equals(type));
    }

    public static void testGetPoids() {
        Plastique plastique = new Plastique(1, 0.5f);
        float poids = plastique.getPoids();
        Test(0.5f == poids);
    }

    public static void main(String[] args) {
        testGetType();
        testGetPoids();
    }

}