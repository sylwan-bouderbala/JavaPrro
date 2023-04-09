package Test;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;

import Centre_tri.Commerce;
import Centre_tri.Contrat;
import Centre_tri.CustomException;
public class ContratTest {
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	private static void TestNouvelleReduc(Contrat contrat){
		ArrayList<String> produits= new ArrayList<>();
		produits.add("Jambon");
		produits.add("Boucherie");
		produits.add("Vin Rouge");
		contrat.NouvelleReduction(produits,12);
		String DerniereLigne = "";
        try (RandomAccessFile fichier = new RandomAccessFile("reductions.csv", "r")) {
            long taillefichier = fichier.length();
            if (taillefichier > 2 ) {
                long filePointer = taillefichier -2;
                while (filePointer != 0) {
                    filePointer--;
                    fichier.seek(filePointer);
                    int readByte = fichier.readByte();
                    if (readByte == '\n') {
                        DerniereLigne = fichier.readLine();
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Test(DerniereLigne.equals(String.valueOf(contrat.getId()) +";"+ String.valueOf(12) +";" + "Jambon/Boucherie/Vin Rouge/"));
	}
	private static void TestRenouveller(Contrat contrat){
        LocalDateTime localDateTime2 = LocalDateTime.of(2025, Month.APRIL, 8, 12, 0, 0);
        ZoneId Zone2 = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime2, Zone2);
        Date DateFin = Date.from(zonedDateTime2.toInstant());
		contrat.Renouveller(DateFin);
		Test(DateFin.compareTo(contrat.getDateFin())==0);
	}
	private static void TestContratMauvaiseDate(Commerce commerce){
		try {
			LocalDateTime localDateTime = LocalDateTime.of(2022, Month.APRIL, 8, 12, 0, 0);
        	ZoneId Zone = ZoneId.systemDefault();
        	ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, Zone);
        	Date DateDebut = Date.from(zonedDateTime.toInstant());
        	LocalDateTime localDateTime2 = LocalDateTime.of(2023, Month.APRIL, 8, 12, 0, 0);
        	ZoneId Zone2 = ZoneId.systemDefault();
        	ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime2, Zone2);
        	Date DateFin = Date.from(zonedDateTime2.toInstant());
			Contrat contrat = new Contrat("Contrat 2",commerce,DateDebut,DateFin);	
		}
		catch (CustomException e) {	
			e.printStackTrace();
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		Commerce commerce = new Commerce("42 rue Alan Turing", 42, "Ada Lovelace");
		LocalDateTime localDateTime = LocalDateTime.of(2022, Month.APRIL, 8, 12, 0, 0);
        ZoneId Zone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, Zone);
        Date DateDebut = Date.from(zonedDateTime.toInstant());
        LocalDateTime localDateTime2 = LocalDateTime.of(2023, Month.APRIL, 8, 12, 0, 0);
        ZoneId Zone2 = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime2, Zone2);
        Date DateFin = Date.from(zonedDateTime2.toInstant());
        Contrat contrat = commerce.NouveauContrat("Contrat1",commerce,DateDebut,DateFin);
		TestNouvelleReduc(contrat);
		TestRenouveller(contrat);
		TestContratMauvaiseDate(commerce);
	}

}
