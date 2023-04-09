package Test;

import Centre_tri.Metal;

public class MetalTest {
    
    private static void Test(boolean bool) {
        if (bool == true) {
            System.out.println("Vrai");
        }
        else {
            System.out.println("False");
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