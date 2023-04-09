package Test;

import Centre_tri.Plastique;

public class PlastiqueTest {

    private static void Test(boolean bool) {
        if (bool == true) {
            System.out.println("\033[32mTest Validé\033[0m");
        }
        else {
            System.out.println("\033[31mEchec\033[0m");
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