package Test;

import Centre_tri.Autres;
import Centre_tri.Dechet;

public class AutresTest {
    
    private static void Test(boolean bool) {
        if (bool == true) {
            System.out.println("Vrai");
        }
        else {
            System.out.println("False");
        }
    }
    
    public static void testGetType() {
        Dechet dechet = new Autres(1, 10.0f);
        String type = "";
        try {
            type = dechet.getType();
        } catch (UnsupportedOperationException e) {
            type = e.getMessage();
        }
        Test(type.equals("autres"));
    }
    
    public static void testGetPoids() {
        Autres autres = new Autres(1, 10.0f);
        float poids = autres.getPoids();
        Test(10.0f == poids);
    }
    
    public static void main(String[] args) {
        testGetType();
        testGetPoids();
    }
}