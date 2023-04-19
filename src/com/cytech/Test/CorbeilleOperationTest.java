package com.cytech.Test;

import java.time.LocalDate;

import com.cytech.Menage.CorbeilleOperation;
import com.cytech.Menage.MenageCompte;
import com.cytech.Poubelle.Bac;
import com.cytech.Poubelle.Poubelle;

public class CorbeilleOperationTest {
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("\033[32mTest Validé\033[0m");
		}
		else {
			System.out.println("\033[31mEchec\033[0m");
		}
	}
	
	public void testGetPoubelle() {
	 	MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
        Test(poubelle == o.getPoubelle());
    }
	
	public void testSetPoubelle() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	Poubelle poubelle2 = new Poubelle(3, 50.0f, 30.0f, 1234, "La Bourse");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    o.setPoubelle(poubelle2);
	    Test(poubelle2==o.getPoubelle());
	}
	
	public void testGetMenageCompte() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    Test(compte1==o.getMenageCompte());
	}
	
	public void testSetMenageCompte() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    MenageCompte compte2 = new MenageCompte(3, "mdp453", "La Bourse", 4, 10);
	    o.setMenageCompte(compte2);
	    Test(compte2==o.getMenageCompte());
	}
	
	public void testGetNbDechets() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    Test(1==o.getNbDechets());
	}
	
	public void testSetNbDechets() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    o.setNbDechets(5);
	    Test(5==o.getNbDechets());
	}
	
	public void testGetQuantite() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    Test(0.5f==o.getQuantite());
	}
	
	public void testSetQuantite() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    o.setQuantite(8.0f);
	    Test(8.0f==o.getQuantite());
	}
	
	public void testGetTypeDechet() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    Test("papier"==o.getTypeDechet());
	}
	

	public void testGetDate() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    Test(nvdate==o.getDate());
	}
	
	public void testIsValeurVerifier() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    Test(false==o.isValeurVerifier());
	}
	
	public void testSetValeurVerifiee() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    o.setValeurVerifier(true);
	    Test(true==o.isValeurVerifier());
	}
	
	public void testGetCouleurBac() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    Test("jaune"==o.getCouleurBac());
	}
	
	public void testSetCouleurBac() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		Bac[] bacs = new Bac[4];
		 bacs[0] = new Bac(0, "jaune");
		 bacs[1] = new Bac(1, "vert");
		 bacs[2] = new Bac(2, "classique");
		 bacs[3] = new Bac(3, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	    CorbeilleOperation o = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	    o.setCouleurBac("bleu");
	    Test("bleu"==o.getCouleurBac());
	}
	
	
	
	public static void main(String[] args) {
		CorbeilleOperationTest test = new CorbeilleOperationTest();
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
	}
	
	
	
}
