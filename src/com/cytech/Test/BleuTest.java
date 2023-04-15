package com.cytech.Test;

import com.cytech.Poubelle.Bleu;

public class BleuTest {
	
	private static void test(boolean condition) {
		if (condition) {
			System.out.println("\033[32mTest Validé\033[0m");
		} else {
			System.out.println("\033[31mEchec\033[0m");
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