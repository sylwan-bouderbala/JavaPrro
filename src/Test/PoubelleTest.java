package Test;

import java.time.LocalDate;

import Centre_tri.Bac;
import Centre_tri.CorbeilleOperation;
import Centre_tri.Dechet;
import Centre_tri.MenageCompte;
import Centre_tri.Poubelle;

public class PoubelleTest {
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public void testGetIdentifiant() {
		Bac[] bacs = new Bac[4];
	    bacs[0] = new Bac(0, "jaune");
	    bacs[1] = new Bac(1, "vert");
	    bacs[2] = new Bac(2, "classique");
	    bacs[3] = new Bac(3, "bleu");
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1",bacs);
        Test(1 == p.getIdentifiant());
    }

  
    public void testSetIdentifiant() {
    	Bac[] bacs = new Bac[4];
	    bacs[0] = new Bac(0, "jaune");
	    bacs[1] = new Bac(1, "vert");
	    bacs[2] = new Bac(2, "classique");
	    bacs[3] = new Bac(3, "bleu");
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1",bacs);
        p.setIdentifiant(2);
        Test(2 == p.getIdentifiant());
    }


    public void testGetQuantiteMaximale() {
    	Bac[] bacs = new Bac[4];
	    bacs[0] = new Bac(0, "jaune");
	    bacs[1] = new Bac(1, "vert");
	    bacs[2] = new Bac(2, "classique");
	    bacs[3] = new Bac(3, "bleu");
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1",bacs);
        Test(10== p.getQuantiteMaximale());
    }


    public void testGetQuantite() {
    	Bac[] bacs = new Bac[4];
	    bacs[0] = new Bac(0, "jaune");
	    bacs[1] = new Bac(1, "vert");
	    bacs[2] = new Bac(2, "classique");
	    bacs[3] = new Bac(3, "bleu");
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1",bacs);
        Test(5 == p.getQuantite());
    }

 
    public void testSetQuantite() {
    	Bac[] bacs = new Bac[4];
	    bacs[0] = new Bac(0, "jaune");
	    bacs[1] = new Bac(1, "vert");
	    bacs[2] = new Bac(2, "classique");
	    bacs[3] = new Bac(3, "bleu");
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1",bacs);
        p.setQuantite(6);
        Test(6 == p.getQuantite());
    }

   
    public void testGetCodeAcces() {
    	Bac[] bacs = new Bac[4];
	    bacs[0] = new Bac(0, "jaune");
	    bacs[1] = new Bac(1, "vert");
	    bacs[2] = new Bac(2, "classique");
	    bacs[3] = new Bac(3, "bleu");
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1",bacs);
        Test(1234 == p.getCodeAcces());
    }

    
    public void testSetCodeAcces() {
    	Bac[] bacs = new Bac[4];
	    bacs[0] = new Bac(0, "jaune");
	    bacs[1] = new Bac(1, "vert");
	    bacs[2] = new Bac(2, "classique");
	    bacs[3] = new Bac(3, "bleu");
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1",bacs);
        p.setCodeAcces(5678);
        Test(5678 == p.getCodeAcces()); 
    }

    
    public void testGetQuartier() {
    	Bac[] bacs = new Bac[4];
	    bacs[0] = new Bac(0, "jaune");
	    bacs[1] = new Bac(1, "vert");
	    bacs[2] = new Bac(2, "classique");
	    bacs[3] = new Bac(3, "bleu");
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1",bacs);
        Test("Quartier1"== p.getQuartier()); 
    }

    public void testSetQuartier() {
    	Bac[] bacs = new Bac[4];
	    bacs[0] = new Bac(0, "jaune");
	    bacs[1] = new Bac(1, "vert");
	    bacs[2] = new Bac(2, "classique");
	    bacs[3] = new Bac(3, "bleu");
        Poubelle p = new Poubelle(1, 10, 5, 1234, "La Bourse",bacs);
        p.setQuartier("Le Louvre");
        Test("Le Louvre" == p.getQuartier()); 
    }

   
	 public void testCreationPoubelle() {
		 Bac[] bacs = new Bac[4];
	     bacs[0] = new Bac(0, "jaune");
	     bacs[1] = new Bac(1, "vert");
	     bacs[2] = new Bac(2, "classique");
	     bacs[3] = new Bac(3, "bleu");
			
	        Poubelle poubelle = new Poubelle(1, 50, 20, 1234, "Centre-ville",bacs);

	        Test((1== poubelle.getIdentifiant()) && (50 == poubelle.getQuantiteMaximale()) &&(20==poubelle.getQuantite()) 
	        && (1234 == poubelle.getCodeAcces()) && ("Centre-ville"== poubelle.getQuartier())); 
	 }
	 
	 public void testIdentifier( ) {
		 MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
		 Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A",bacs);
		 LocalDate nvdate = LocalDate.of(2023,4,9);
		 CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune", 10);
		 Test(1 == poubelle.identifier(operation)); 
	 }
	 
	 public void testEnvoyerNotifs() {
		 Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
		 MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 Poubelle poubelle = new Poubelle(1,50.0f,50.0f,1234,"Le Louvre",bacs);
		 LocalDate nvdate = LocalDate.of(2023,4,9);
		 CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "bleu", 10);
		 poubelle.envoyerNotifs(operation);
		 Test(poubelle.estPleine());
	 }
	 
	 public void testVerifier() {
		 Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
		 Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A",bacs);
		 Dechet dechet = new Dechet(6,"verre");
		 Bac bac = new Bac(1, "vert");
		 Test(poubelle.verifier(dechet,bac)); // On doit jetter le verre dans le bac vert de la poubelle
	 }
	 
	 public void testAttribuer() {
		 MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
		 Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A",bacs);
		 LocalDate nvdate = LocalDate.of(2023,4,9);
		 CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "bleu", 10);
		  Dechet dechet = new Dechet(operation.getIdDechet(),operation.getTypeDechet());
		  Bac bac = new Bac(poubelle.getIdentifiantBac(operation.getCouleurBac()), operation.getCouleurBac());
		 poubelle.attribuer(dechet,bac,operation);
		 Test(11==compte1.getptsFidelite());
		 // Le menage a bien jetté le papier dans une poubelle bleu donc on doit vérifier que les points de fidélité du ménage ont augmenté de 1 (on passe de 10 à 11 points de fidélité
	 }
	 
	 public void testCalculer() {
		 MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
		 Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A",bacs);
		 LocalDate nvdate = LocalDate.of(2023,4,9);
		 CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,3,0.5f, "papier",nvdate, false, "Bleu", 10);
		 Test(3.0*0.5f==Poubelle.calculer(operation));
	 }
	 
	 
	 public static void main(String[] args) {
		 PoubelleTest test = new PoubelleTest();
		 test.testGetIdentifiant();
		 test.testGetQuantiteMaximale();
		 test.testGetCodeAcces();
		 test.testGetQuantite();
		 test.testGetCodeAcces();
		 test.testGetQuartier();
		 test.testSetIdentifiant();
		 test.testSetQuantite();
		 test.testSetQuartier();
	     test.testCreationPoubelle();
	     test.testIdentifier();
	     test.testEnvoyerNotifs();
	     test.testVerifier();
	     test.testAttribuer();
	     test.testCalculer();
	}
		
}
