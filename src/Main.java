import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void Main(String[] args) {
		int kalo = 14;
		int mena = 32;
		String chaine = String.valueOf(kalo) +";"+ String.valueOf(mena);
        try {
            FileWriter writer = new FileWriter("main.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(chaine);
            bufferedWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
	}
}
