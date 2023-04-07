package Centre_tri;

import java.util.ArrayList;

public class Commerce {
	private int Id;
	private String adresse;
	private ArrayList<Contrat> Contrats;
	
	public Commerce(String adresse,int Id,ArrayList<Contrat> Contrats) {
		this.setId(Id);
		this.setAdresse(adresse);
		this.Contrats = Contrats;
	}
	public void NouveauContrat(Contrat Contrats) {
		
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
