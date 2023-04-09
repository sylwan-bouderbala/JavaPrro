package Test;


import Centre_tri.Dechet;

public class DechetTest {
		
		private static void Test(boolean bool) {
			if (bool == true) {
				System.out.println("\033[32mTest Validé\033[0m");
			}
			else {
				System.out.println("\033[31mEchec\033[0m");
			}
		}
		
	    public static void testGetIdentifiant() {
	        Dechet dechet = new Dechet(1, "papier");
	        int identifiant = dechet.getIdentifiant();
	        Test(1 == identifiant);
	    }
	    
	  
	    public static void testSetIdentifiant() {
	        Dechet dechet = new Dechet(1, "papier");
	        dechet.setIdentifiant(2);
	        int identifiant = dechet.getIdentifiant();
	        Test(2== identifiant);
	    }
	 
	    public static void testGetType() {
	        Dechet dechet = new Dechet(1,"papillon");
	        String type = "";
	        try {
	            type = dechet.getType();
	        } catch (UnsupportedOperationException e) {
	            type = e.getMessage();
	        }
	        Test(type.equals("Impossible : ce type de déchets n'existe pas"));
	    }

	    public static void main(String[] args) {
	    	testGetIdentifiant();
	    	testSetIdentifiant();
	    	testGetType();
	    }

}
