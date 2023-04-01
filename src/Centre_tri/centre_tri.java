package Centre_tri;
import java.util.ArrayList;
import java.util.HashMap;
public class centre_tri {
	private int id ;
	private char[] nom;
	private char[] adresse;
	public  Statistiques stats;
	private ArrayList<Contrat> contrats;
	private HashMap<Integer,Poubelle> Poubelles;

	
	public centre_tri(char[] adresse, char[] nom, int id){
		this.adresse = adresse;
		this.nom = nom;
		this.id = id;
	}
	
	public void placer(Poubelle p) {
		Poubelles.put(p.getId(), p);
	}
	//à voir
	public void Retirer(Poubelle p) {
		Poubelles.remove(p.getId());
	}
	//ajouter ou placer ?
	public void Ajouter(Poubelle p) {
		Poubelles.put(p.getId(), p);
	}
	public void Collecter(Poubelle p) {
		if(Poubelles.containsKey(p.getId())) {
			//methode pour collecter les poubelles
			//p.vider();
		}
		else {
			System.out.println("la poubelle : "+p.getId()+" n'appartient pas au centre-de-tri");
		}
	}
	//GET ET SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char[] getNom() {
		return nom;
	}

	public void setNom(char[] nom) {
		this.nom = nom;
	}

	public char[] getAdresse() {
		return adresse;
	}

	public void setAdresse(char[] adresse) {
		this.adresse = adresse;
	}

	public ArrayList<Contrat> getContrats() {
		return contrats;
	}

	public void setContrat(ArrayList<Contrat> contrat) {
		this.contrats = contrat;
	}


	public HashMap<Integer,Poubelle> getPoubelles() {
		return Poubelles;
	}


	public void setPoubelles(HashMap<Integer,Poubelle> poubelles) {
		Poubelles = poubelles;
	}
	
}
