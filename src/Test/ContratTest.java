package Test;
import java.util.ArrayList;
import java.util.Date;

import Centre_tri.Commerce;
import Centre_tri.Contrat;
public class ContratTest {
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("Vrai");
		}
		else {
			System.out.println("False");
		}
	}
	
	private static void TestAdresse() {

		Commerce commerce = new Commerce("70 chemin des groux",1);
		Test(commerce.getAdresse()=="70 chemin des groux");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Commerce commerce = new Commerce("70 chemin des groux",1);
		
		//Contrat contrat = new Contrat("Contrat",commerce,new Date(122,3,8),new Date(122,3,9),4);
		//ArrayList<String> produits = new ArrayList<String>();
		//produits.add("salami");
		//produits.add("jambon");
		//contrat.NouvelleReduction(produits, 12);
		TestAdresse();
	}

}
