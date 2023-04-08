package Centre_tri;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

public class Contrat {
	private int Id;
	private Commerce Commerce;
	private String Name;
	private Date DateDebut;
	private Date DateFin;
	private Duration Duree;
	private ArrayList<Reduction> Reductions;
	
	//TODO : quand on ajoute une reduction deal with constructor de rreduction et le faire partout aussi

	
	public Contrat(String Name,Commerce Commerce,Date DateDebut,Date DateFin,Duration Duree,int Id){
		this.setCommerce(Commerce);
		this.setName(Name);
		this.setDateDebut(DateDebut);
		this.setDateFin(DateFin);
		this.setDuree(Duree);
		this.setId(Id);
	}
	//Fonction d'ecriture dans un fichier s
	public void NouvelleReduction(ArrayList<String> Produits,int Taux) {
		Reduction reduction = new Reduction(Taux,Produits);
		reduction.setId(this.Reductions.size());
		
		String chaine = String.valueOf(this.Id) +";"+ String.valueOf(Taux)+";";
		for (String elements : Produits) {
			chaine = chaine + elements + "/;";
		}
		chaine = chaine + "\n";
        try {
            FileWriter writer = new FileWriter("reductions.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(chaine);
            bufferedWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
	}
	
	public void Renouveller(Date DateFin) {
		setDateFin(DateFin);
	}
	public Duration getDuree() {
		return Duree;
	}

	public void setDuree(Duration duree) {
		Duree = duree;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Commerce getCommerce() {
		return Commerce;
	}

	public void setCommerce(Commerce commerce) {
		Commerce = commerce;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
}
