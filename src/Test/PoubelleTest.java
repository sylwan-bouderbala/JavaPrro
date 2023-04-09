package Test;

import java.util.Date;

import Centre_tri.Bac;
import Centre_tri.CorbeilleOperation;
import Centre_tri.Dechet;
import Centre_tri.MenageCompte;
import Centre_tri.Poubelle;

public class PoubelleTest {
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("Vrai");
		}
		else {
			System.out.println("False");
		}
	}
	
	public void testGetIdentifiant() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        Test(1 == p.getIdentifiant());
    }

  
    public void testSetIdentifiant() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        p.setIdentifiant(2);
        Test(2 == p.getIdentifiant());
    }


    public void testGetQuantiteMaximale() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        Test(10== p.getQuantiteMaximale());
    }


    public void testGetQuantite() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        Test(5 == p.getQuantite());
    }

 
    public void testSetQuantite() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        p.setQuantite(6);
        Test(6 == p.getQuantite());
    }

   
    public void testGetCodeAcces() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        Test(1234 == p.getCodeAcces());
    }

    
    public void testSetCodeAcces() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        p.setCodeAcces(5678);
        Test(5678 == p.getCodeAcces()); 
    }

    
    public void testGetQuartier() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        Test("Quartier1"== p.getQuartier()); 
    }

    public void testSetQuartier() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "La Bourse");
        p.setQuartier("Le Louvre");
        Test("Le Louvre" == p.getQuartier()); 
    }

   
	 public void testCreationPoubelle() {
	        Poubelle poubelle = new Poubelle(1, 50, 20, 1234, "Centre-ville");

	        Test((1== poubelle.getIdentifiant()) && (50 == poubelle.getQuantiteMaximale()) &&(20==poubelle.getQuantite()) 
	        && (1234 == poubelle.getCodeAcces()) && ("Centre-ville"== poubelle.getQuartier())); 
	 }
	 
	 public void testIdentifier( ) {
		 MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
		 Date nvdate = new Date(122,3,8);
		 CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune", 10);
		 Test(1 == poubelle.identifier(operation)); 
	 }
	 
	 public void testEnvoyerNotifs() {
		 Poubelle poubelle = new Poubelle(1,50.0f,50.0f,1234,"Le Louvre");
				 Test(poubelle.estPleine());
	 }
	 
	 public void testVerfier() {
		 MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
		 Date nvdate = new Date(122,3,8);
		 CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,0.5f, "Papier",nvdate, false, "Bleu", 10);
		 Dechet dechet = poubelle.creerDechet(operation);
		 Bac bac = poubelle.creerBac(operation, operation.getCouleurBac());
		 Test(poubelle.verifier(dechet,bac)); // On doit jetter le papier dans le bac bleu de la poubelle
		 
	 }
	 
	 public void testAttribuer() {
		 MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
		 Date nvdate = new Date(122,3,8);
		 CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,0.5f, "Papier",nvdate, false, "Bleu", 10);
		 Dechet dechet = poubelle.creerDechet(operation);
		 Bac bac = poubelle.creerBac(operation, operation.getCouleurBac());
		 poubelle.attribuer(dechet,bac,operation);
		 Test(11==compte1.getptsFidelite());
		 // Le menage a bien jetté le papier dans une poubelle bleu donc on doit vérifier que les points de fidélité du ménage ont augmenté de 1 (on passe de 10 à 11 points de fidélité
	 }
	 
	 public void calculer() {
		 
	 }
	 
	 public void testCreerDechet() {
		 
	 }
	 public void testCreerBac() {
		 
	 }
	 
	 public void testEnregistrerStats() {
		 
	 }
	 
	 public static void main(String[] args) {
		 PoubelleTest test = new PoubelleTest();
		 System.out.println("Test de la classe Poubelle");
		 test.testGetIdentifiant();
		 test.testGetQuantiteMaximale();
		 test.testGetCodeAcces();
		 test.testGetQuantite();
		 test.testGetCodeAcces();
		 test.testGetQuartier();
		 test.testSetIdentifiant();
		 test.testSetQuantite();
		 test.testSetQuartier();
		 System.out.println("Suivant");
	     test.testCreationPoubelle();
	     test.testIdentifier();
	     test.testEnvoyerNotifs();
	     test.testVerfier();
	     test.testAttribuer();
	     test.testCreerDechet();
	}
		
}
