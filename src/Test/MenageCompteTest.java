package Test;

import Centre_tri.MenageCompte;

public class MenageCompteTest {
	
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("\033[32mTest Validé\033[0m");
		}
		else {
			System.out.println("\033[31mEchec\033[0m");
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
    
    
    public void testUtiliser() {
    	
    }
    
    public void testConvertir() {
    	MenageCompte menage = new MenageCompte(1, "password", "Quartier A", 4, 10);
        int a = menage.convertir(10,"salami/jambon/",menage);
        Test(1==a);
    }
    public static void main(String[] args) {
		 MenageCompteTest test = new MenageCompteTest();
		 System.out.println("Test de la classe Poubelle");
		 test.testGetIdentifiant();
		 test.testSetIdentifiant();
		 test.testGetQuartier();
		 test.testgetmotDePasse();
		 test.testSetMotDePasse();
		 test.testSetQuartier();
		 test.testGetNbPersonnes();
		 test.testgetptsFidelite();
		 test.testSetptsFidelite();
		 test.testUtiliser();
		 test.testConvertir();
    }
}

    

