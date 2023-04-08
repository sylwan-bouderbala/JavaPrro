package Test;

import java.util.Date;

import Centre_tri.CorbeilleOperation;
import Centre_tri.MenageCompte;
import Centre_tri.Poubelle;

public class PoubelleTest {
	
	public void testGetIdentifiant() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        if(1 == p.getIdentifiant()){
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }
    }

  
    public void testSetIdentifiant() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        p.setIdentifiant(2);
        if(2 == p.getIdentifiant()) {
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }
    }


    public void testGetQuantiteMaximale() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        if (10== p.getQuantiteMaximale()){
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }
        
    }


    public void testGetQuantite() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        if (5 == p.getQuantite()) {
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }
    }

 
    public void testSetQuantite() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        p.setQuantite(6);
        if (6 == p.getQuantite()) {
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }
    }

   
    public void testGetCodeAcces() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        if (1234 == p.getCodeAcces()) {
        	System.out.println(true);
        } else {
        	System.out.println(false);
        };
    }

    
    public void testSetCodeAcces() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        p.setCodeAcces(5678);
        if (5678 == p.getCodeAcces()) {
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }
    }

    
    public void testGetQuartier() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
        if ("Quartier1"== p.getQuartier()) {
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }
    }

    public void testSetQuartier() {
        Poubelle p = new Poubelle(1, 10, 5, 1234, "La Bourse");
        p.setQuartier("Le Louvre");
        if ("Le Louvre" == p.getQuartier()) {
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }
    }

   
	 public void testCreationPoubelle() {
	        Poubelle poubelle = new Poubelle(1, 50, 20, 1234, "Centre-ville");

	        if ((1== poubelle.getIdentifiant()) && (50 == poubelle.getQuantiteMaximale()) &&(20==poubelle.getQuantite()) 
	        && (1234 == poubelle.getCodeAcces()) && ("Centre-ville"== poubelle.getQuartier())&& (poubelle.estPleine())) {
	        	 System.out.println("True");
	        } else {
	        	 System.out.println("False");
	        }
	 }
	 
	 public void testIdentifier( ) {
		 MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
		 Date nvdate = new Date(122,3,8);
		 CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,1,0.5f, "papier",nvdate, false, "jaune", 10);
		 if (operation.getPoubelle().getIdentifiant() ==operation.getPoubelle().identifier(operation)) {
			 System.out.println("True");
	     } else {
	        System.out.println("False");
	     }
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
	     
	}
		
}
