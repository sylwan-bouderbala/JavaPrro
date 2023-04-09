package Test;

import Poubelle.Metal;

public class MetalTest {
    
    private static void Test(boolean bool) {
        if (bool == true) {
            System.out.println("\033[32mTest Validé\033[0m");
        }
        else {
            System.out.println("\033[31mEchec\033[0m");
        }
    }
    
    public static void testGetType() {
        Metal metal = new Metal(1, 10);
        String type = metal.getType();
        Test(type.equals("metal"));
    }
    
    public static void testGetPoids() {
        Metal metal = new Metal(1, 10);
        float poids = metal.getPoids();
        Test(10 == poids);
    }
    
    public static void main(String[] args) {
        testGetType();
        testGetPoids();
    }

}