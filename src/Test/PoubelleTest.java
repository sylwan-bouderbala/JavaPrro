package Test;

import Centre_tri.Poubelle;

public class PoubelleTest {

	 public void testCreationPoubelle() {
	        Poubelle poubelle = new Poubelle(1, 50, 20, 1234, "Centre-ville");

	        if ((1== poubelle.getIdentifiant()) && (50 == poubelle.getCapaciteMaximale()) && (50==poubelle.getCapaciteMaximale()) &&(20==poubelle.getQuantite()) 
	        && (1234 == poubelle.getCodeAcces()) && ("Centre-ville"== poubelle.getQuartier())&& (poubelle.estPleine())) {
	        	 System.out.println("True");
	        } else {
	        	 System.out.println("False");
	        }
	 }

}
