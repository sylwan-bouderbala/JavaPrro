package Test;

import java.util.Date;

import Centre_tri.CorbeilleOperation;
import Centre_tri.MenageCompte;
import Centre_tri.Poubelle;

public class CorbeilleOperationTest {
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("Vrai");
		}
		else {
			System.out.println("False");
		}
	}
	
	public void testGetPoubelle() {
	 	MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
        Test(poubelle == o.getPoubelle());
    }
	
	public void testSetPoubelle() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Poubelle poubelle2 = new Poubelle(3, 50.0f, 30.0f, 1234, "La Bourse");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    o.setPoubelle(poubelle2);
	    Test(poubelle2==o.getPoubelle());
	}
	
	public void testGetMenageCompte() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    Test(compte1==o.getMenageCompte());
	}
	
	public void testSetMenageCompte() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    MenageCompte compte2 = new MenageCompte(3, "mdp453", "La Bourse", 4, 10);
	    o.setMenageCompte(compte2);
	    Test(compte1==o.getMenageCompte());
	}
	
	public void testGetNbDechets() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    Test(1==o.getNbDechets());
	}
	
	public void testSetNbDechets() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    o.setNbDechets(5);
	    Test(5==o.getNbDechets());
	}
	
	public void testGetQuantite() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    Test(0.5f==o.getQuantite());
	}
	
	public void testSetQuantite() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    o.setQuantite(8.0f);
	    Test(9.0f==o.getQuantite());
	}
	
	public void testGetTypeDechet() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    Test("papier"==o.getTypeDechet());
	}
	
	public void testSetTypeDechet() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    o.setTypeDechet("metal");
	    Test("metal"==o.getTypeDechet());
	}
	
	public void testGetDate() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    
	}
	
	public void testIsValeurVerifier() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	    
	}
	
	public void testSetValeurVerifiee() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	}
	
	public void testGetCouleurBac() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	}
	
	public void testSetCouleurBac() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Date nvdate = new Date(122,3,8);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune");
	}
	
	public void testAjouterDechets() {
		
	}
	
	public static void main(String[] args) {
		CorbeilleOperationTest test = new CorbeilleOperationTest();
		System.out.println("Test de la classe CorbeilleOperation");
		test.testGetPoubelle();
		test.testSetPoubelle();
		test.testGetMenageCompte();
		test.testSetMenageCompte();
		test.testGetNbDechets();
		test.testSetNbDechets();
		test.testGetQuantite();
		test.testSetQuantite();
		test.testGetTypeDechet();
		test.testGetDate();
		test.testIsValeurVerifier();
		test.testSetValeurVerifiee();
		test.testSetCouleurBac();
		test.testAjouterDechets();
	}
	
	
	
}
