package Test;
import Centre_tri.centre_tri;
public class CentretriTest {
    private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
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
