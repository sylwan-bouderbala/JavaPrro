package Test;

import Centre_tri.Carton;

public class CartonTest {
	
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("\033[32mTest Validé\033[0m");
		}
		else {
			System.out.println("\033[31mEchec\033[0m");
		}
	}
	
	public static void testGetPoids() {
        Carton carton = new Carton(1, 5.0f);
        float poids = carton.getPoids();
        Test(poids == 5.0f);
    }
	
	public static void testGetType() {
        Carton carton = new Carton(1, 5.0f);
        String type = carton.getType();
        Test(type.equals("carton"));
    }
	
	public static void main(String[] args) {
		testGetPoids();
		testGetType();
	}
}