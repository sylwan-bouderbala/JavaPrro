package Test;

import Centre_tri.Bac;
import Centre_tri.Jaune;

public class JauneTest {
	
	private static void test(boolean bool) {
		if (bool) {
			System.out.println("Vrai");
		}
		else {
			System.out.println("Faux");
		}
	}
	
	public static void testGetIdentifiant() {
		Jaune jaune = new Jaune(1);
		int identifiant = jaune.getIdentifiant();
		test(identifiant == 1);
	}
	
	public static void testSetIdentifiant() {
		Jaune jaune = new Jaune(1);
		jaune.setIdentifiant(2);
		int identifiant = jaune.getIdentifiant();
		test(identifiant == 2);
	}
	
	public static void testGetCouleur() {
		Jaune jaune = new Jaune(1);
		String couleur = "";
		try {
			couleur = jaune.getCouleur();
		} catch (UnsupportedOperationException e) {
			couleur = e.getMessage();
		}
		test(couleur.equals("jaune"));
	}
	
	public static void testSetCouleur() {
		Jaune jaune = new Jaune(1);
		jaune.setCouleur("vert");
		String couleur = jaune.getCouleur();
		test(couleur.equals("jaune"));
	}
	
	public static void main(String[] args) {
		testGetIdentifiant();
		testSetIdentifiant();
		testGetCouleur();
		testSetCouleur();
	}
}