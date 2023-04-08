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

    
   
	 public void testCreationPoubelle() {
	        Poubelle poubelle = new Poubelle(1, 50, 20, 1234, "Centre-ville");

	        if ((1== poubelle.getIdentifiant()) && (50 == poubelle.getQuantiteMaximale()) && (50==poubelle.getQuantiteMaximale()) &&(20==poubelle.getQuantite()) 
	        && (1234 == poubelle.getCodeAcces()) && ("Centre-ville"== poubelle.getQuartier())&& (poubelle.estPleine())) {
	        	 System.out.println("True");
	        } else {
	        	 System.out.println("False");
	        }
	 }
	 
	 public static void main(String[] args) {
		 PoubelleTest test = new PoubelleTest();
	     test.testCreationPoubelle();
	}
		
}
