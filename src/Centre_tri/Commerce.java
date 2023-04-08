package Centre_tri;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

public class Commerce {
	private int Id;
	private String adresse;
	private ArrayList<Contrat> Contrats;
	
	public Commerce(String adresse,int Id,ArrayList<Contrat> Contrats) {
		this.setId(Id);
		this.setAdresse(adresse);
		this.Contrats = Contrats;
	}
	public Contrat NouveauContrat(String Name,Commerce Commerce,Date DateDebut,Date DateFin,Duration Duree) {
		Contrat Contrat = new Contrat(Name,Commerce,DateDebut,DateFin,Duree,this.Contrats.size()+1);
		Contrats.add(Contrat);
		
		
		String chaine = String.valueOf(Contrat.getId()) +";"+ String.valueOf(this.Id)+";"+String.valueOf(DateDebut)+";"+String.valueOf(DateFin)+";"+String.valueOf(Duree)+";";
		for(Reduction e : Contrat.getReductions()){
			chaine += String.valueOf(e.getId())+";";
		}
		chaine = chaine + "\n";
        try {
            FileWriter writer = new FileWriter("Contrats.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(chaine);
            bufferedWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
		
		return Contrat;
	}
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
}
