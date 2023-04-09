package Test;

import Centre_tri.Bac;
import Centre_tri.Classique;

public class ClassiqueTest {
	
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("Vrai");
		}
		else {
			System.out.println("False");
		}
	}
	
    public static void testGetIdentifiant() {
        Bac bac = new Classique(1);
        int identifiant = bac.getIdentifiant();
        Test(1 == identifiant);
    }
    
  
    public static void testSetIdentifiant() {
        Bac bac = new Classique(1);
        bac.setIdentifiant(2);
        int identifiant = bac.getIdentifiant();
        Test(2== identifiant);
    }
 
    public static void testGetCouleur() {
        Bac bac = new Classique(1);
        String couleur = "";
        try {
            couleur = bac.getCouleur();
        } catch (UnsupportedOperationException e) {
            couleur = e.getMessage();
        }
        Test(couleur.equals("classique"));
    }

    public static void main(String[] args) {
    	testGetIdentifiant();
    	testSetIdentifiant();
    	testGetCouleur();
    }
}