package com.cytech.Test;
import com.cytech.Centre_tri.centre_tri;
public class CentretriTest {
    private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("\033[32mTest Validé\033[0m");
		}
		else {
			System.out.println("\033[31mEchec\033[0m");
		}
    }
    public static void TestAdresse(centre_tri centre) {
        Test(centre.getAdresse().equals("Chemin al quarhizmy"));
    }
    public static void TestNom(centre_tri centre){
        Test(centre.getNom().equals("Centre de Bailleu"));
    }
    public static void main(String[] args) {
        centre_tri centre = new centre_tri("Chemin al quarhizmy", "Centre de Bailleu", 0);
        TestAdresse(centre);
        TestNom(centre);
    }
}
