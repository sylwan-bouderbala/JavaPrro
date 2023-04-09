package Test;

import Centre_tri.Poubelle;
import Centre_tri.Bac;
import Centre_tri.CorbeilleOperation;
import Centre_tri.Dechet;
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


    public void testGetQuartier() {
    	MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
        Test("Le Louvre" == c.getQuartier());
    }

 
    public void testgetNbPersonnes() {
    	MenageCompte c = new MenageCompte(1, "mdp123", "Le Louvre", 4, 10);
        Test(6 == c.getnbPersonnes());
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
        Test(5678 == c.getptsFidelite()); 
    }
}

    

