package Test;

import Centre_tri.Bac;

public class BacTest {
	
	
    public static void testGetIdentifiant() {
        Bac bac = new Bac(1, "jaune");
        int identifiant = bac.getIdentifiant();
        if (1 == identifiant) {
        	System.out.println("True");
        } else {
        	System.out.println("False");
        }
    }
    
  
    public static void testSetIdentifiant() {
        Bac bac = new Bac(1, "jaune");
        bac.setIdentifiant(2);
        int identifiant = bac.getIdentifiant();
        if (2== identifiant) {
        	System.out.println("False");
        }
    }
  
    public static void testGetCouleur() {
        Bac bac = new Bac(1, "jaune");
        String couleur = bac.getCouleur();
        if("Impossible : cette couleur n'existe pas"== couleur) {
        	System.out.println("True");
        } else {
        	System.out.println("False");
        }
    }
    public static void main(String[] args) {
    	testGetIdentifiant();
    	testSetIdentifiant();
    	testGetCouleur();
    }
}	

