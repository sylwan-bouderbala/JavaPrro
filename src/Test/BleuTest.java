package Test;

import Centre_tri.Bleu;

public class BleuTest {
	
	private static void test(boolean condition) {
		if (condition) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	
	public static void testGetIdentifiant() {
		Bleu bleu = new Bleu(1);
		test(bleu.getIdentifiant() == 1);
	}
	
	public static void testSetIdentifiant() {
		Bleu bleu = new Bleu(1);
		bleu.setIdentifiant(2);
		test(bleu.getIdentifiant() == 2);
	}
	
	public static void testGetCouleur() {
		Bleu bleu = new Bleu(1);
		test(bleu.getCouleur().equals("bleu"));
	}
	
	public static void main(String[] args) {
		testGetIdentifiant();
		testSetIdentifiant();
		testGetCouleur();
	}
}