package Test;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;

import Centre_tri.Commerce;
import Centre_tri.Contrat;
public class ContratTest {
	private static void Test(boolean bool) {
		if (bool == true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	private static void TestAdresse() {

	}
	public static void main(String[] args) {
		Commerce commerce = new Commerce("70 chemin des grous", 1);
		LocalDateTime localDateTime = LocalDateTime.of(2023, Month.APRIL, 8, 12, 0, 0);
		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
		Date someDate = Date.from(zonedDateTime.toInstant());
		LocalDateTime localDateTime2 = LocalDateTime.of(2024, Month.APRIL, 8, 12, 0, 0);
		ZoneId zoneId2 = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, zoneId);
		Date someDate2 = Date.from(zonedDateTime.toInstant());
		commerce.NouveauContrat("Contrat1", commerce, someDate, someDate2);
	}

}
