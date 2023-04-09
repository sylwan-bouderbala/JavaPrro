package Test;

import Centre_tri.Poubelle;
import Centre_tri.CorbeilleOperation;
import Centre_tri.MenageCompte;

public class MenageCompteTest {
	
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("Vrai");
		}
		else {
			System.out.println("False");
		}
	}
	
	public void testGetIdentifiant() {
		MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
        Test(1 == c.getIdentifiant());
    }

  
    public void testSetIdentifiant() {
    	MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
        c.setIdentifiant(2);
        Test(2 == c.getIdentifiant());
    }


    public void testgetmotDePasse() {
       MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
       Test("mdp123"== c.getmotdePasse());
    }
    
    public void testSetMotDePasse() {
    	
    }

    public void testGetQuartier() {
    	MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
        Test("Le Louvre" == c.getQuartier());
    }

 
    public void testGetNbPersonnes() {
    	MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
        Test(4 == c.getNbPersonnes());
    }
    
    public void testSetNbPersonnes() {
    	MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
    	 c.setnbPersonnes(6);
    	 Test(6==c.getNbPersonnes());
    }
   
    public void testSetQuartier() {
    	MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
    	c.setQuartier("La Bourse");
        Test("La Bourse" == c.getQuartier());
    }
    
    public void testgetptsFidelite()
	{
    	MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
		Test(10==c.getptsFidelite());
	}
    
    public void testSetptsFidelite() {
    	MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
        c.setPtsFidelite(20);
        Test(20 == c.getptsFidelite()); 
    }
    public void testConsulter() {
    	
    }
    public void testCreerCompte() {
    	
    }
    
    public void testEnregistrerMenageCompte() {
    	
    }
    
    public void testUtiliser() {
    	
    }
    
    public void testConvertir() {
    	
    }
  
    public void testIncrementFidelite() {
    	
    }
    
    public void testDecrementFidelite() {
    	
    }
    
    public static void main(String[] args) {
		 MenageCompteTest test = new MenageCompteTest();
		 test.testGetIdentifiant();
		 test.testSetIdentifiant();
		 test.testGetQuartier();
		 test.testgetmotDePasse();
		 test.testSetMotDePasse();
		 test.testSetQuartier();
		 test.testGetNbPersonnes();
		 test.testgetptsFidelite();
		 test.testSetptsFidelite();
		 test.testConsulter();
		 test.testCreerCompte();
		 test.testEnregistrerMenageCompte();
		 test.testUtiliser();
		 test.testConvertir();
		 test.testIncrementFidelite();
		 test.testDecrementFidelite();
    }
}

    

