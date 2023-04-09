package Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import Centre_tri.Commerce;
import Centre_tri.Contrat;

public class CommerceTest {
    private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("\033[32mTest Validé\033[0m");
		}
		else {
			System.out.println("\033[31mEchec\033[0m");
		}
	}
    private static void TestAdresse(Commerce commerce){
        Test(commerce.getAdresse()=="70 chemin de groux");
    }
    private static void TestNom(Commerce commerce){
        Test(commerce.getName()=="La cabanne ancestrale");
    }

    private static void TestId(Commerce commerce){
        Test(commerce.getId()==1);
    }
    private static void TestSetAdresse(Commerce commerce){
        commerce.setAdresse("78 chemin de groux");
        Test(commerce.getAdresse()=="78 chemin de groux");
    }
    private static void TestSetNom(Commerce commerce){
        commerce.setName("Le miroir de marie");
        Test(commerce.getName()=="Le miroir de marie");
    }

    private static void TestSetId(Commerce commerce){
        commerce.setId(2);
        Test(commerce.getId()==2);
    }
    private static void TestNouveauContrat(Commerce commerce){
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.APRIL, 8, 12, 0, 0);
        ZoneId Zone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, Zone);
        Date DateDebut = Date.from(zonedDateTime.toInstant());
        LocalDateTime localDateTime2 = LocalDateTime.of(2023, Month.APRIL, 8, 12, 0, 0);
        ZoneId Zone2 = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime2, Zone2);
        Date DateFin = Date.from(zonedDateTime2.toInstant());
        Contrat contrat = commerce.NouveauContrat("Contrat1",commerce,DateDebut,DateFin);
        String DerniereLigne = "";
        try (RandomAccessFile fichier = new RandomAccessFile("Contrats.csv", "r")) {
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
        Test(DerniereLigne.equals(String.valueOf(contrat.getId()) +";"+ "Le miroir de marie" +";" +String.valueOf(2)+";"+String.valueOf(DateDebut)+";"+String.valueOf(DateFin)+";"));
    }
    public static void main(String[] args) {
        Commerce commerce = new Commerce("70 chemin de groux", 1, "La cabanne ancestrale");
        TestAdresse(commerce);
        TestNom(commerce);
        TestId(commerce);
        TestSetId(commerce);
        TestSetAdresse(commerce);
        TestSetNom(commerce);
        TestNouveauContrat(commerce);   

    }
}
