package Test;

public class BacTest {
	
	
    public void testGetIdentifiant() {
        Bac bac = new Bac(1, "jaune");
        int identifiant = bac.getIdentifiant();
        if (1 == identifiant) {
        	System.out.println("True");
        } else {
        	System.out.println("False");
        }
    }
    
  
    public void testSetIdentifiant() {
        Bac bac = new Bac(1, "jaune");
        bac.setIdentifiant(2);
        int identifiant = bac.getIdentifiant();
        if (2== identifiant) {
        	System.out.println("False");
        }
    }
  
    public void testGetCouleur() {
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

