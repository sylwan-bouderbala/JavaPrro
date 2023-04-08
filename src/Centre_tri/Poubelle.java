package Centre_tri;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Poubelle {
	private int identifiant;
	protected float quantiteMaximale;
	protected float quantite;
	private int codeAcces;
	public String quartier;
	private centre_tri Centre;
	private ArrayList<Bac> bacs;
	private HashMap<Integer,Bac> Bacs;
	private boolean estPleine;
	private float capaciteMaximale;


	public Poubelle (int identifiant, float capaciteMaximale, float quantite, int codeAcces, String quartier) {
		this.identifiant = identifiant;
		this.capaciteMaximale = capaciteMaximale;
		this.quantite = quantite;
		this.codeAcces = codeAcces;
		this.quartier = quartier;
		this.estPleine = false;
		
	}
	
	public void setIdentifiant(int identifiant) {
		this.identifiant=identifiant;
	}

	public int getIdentifiant() {
		return identifiant;
	}
	
	public float getQuantiteMaximale() {
	    return quantiteMaximale;
	}

	public float getQuantite() {
	    return quantite;
	}

	public int getCodeAcces() {
	    return codeAcces;
	}

	public String getQuartier() {
	    return quartier;
	}

	public Float getCapaciteMaximale() {
		return capaciteMaximale;
	}
	public ArrayList<Bac> getBacs() {
	    return bacs;
	}

	public HashMap<Integer, Bac> getBacsMap() {
	    return Bacs;
	}

	public boolean estPleine() {
	    return estPleine;
	}
	
	public void setCapacitemaximale(float capaciteMaximale) {
		this.capaciteMaximale = capaciteMaximale;
	}
	
	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}
	
	public void setCodeAcces(int codeAcces) {
		this.codeAcces = codeAcces;
	}
	
	
	public void identifier(CorbeilleOperation operation) {
		System.out.println(operation.getIdentifiant());
	}
	
	public void envoyerNotifs(CorbeilleOperation operation, Poubelle p) {
		if (p.quantite > p.capaciteMaximale) {
			estPleine = true;
		}
	}

	public boolean verifier(Dechet dechet, Bac bacs) {
	    if (dechet.getType().equals("Verre") && bacs.getCouleur().equals("Vert")) {
	        return true;
	    }
	    else if (dechet.getType().equals("Papier") && bacs.getCouleur().equals("Bleu")) {
	        return true; 
	    }
		else if (dechet.getType().equals("Plastique") || (dechet.getType().equals("Carton") || dechet.getType().equals("Metal"))  && (bacs.getCouleur().equals("Jaune"))) {
	        return true; 
		}
	    else if (dechet.getType().equals("Autres")  && (bacs.getCouleur().equals("Classique"))) {
			return true;
	    } 
	    else {
	        return false;
	    }
	}
		      
	public void attribuer(Dechet dechet, Bac bacs, CorbeilleOperation corbeilleOperation) {
		if (verifier(dechet, bacs)) {
			corbeilleOperation.getMenageCompte().incrementFidelite();
		}
		else {
			corbeilleOperation.getMenageCompte().decrementFidelite();
		}
	}
	
	public static Dechet creerDechet(CorbeilleOperation operation) {
	    String typeDechet = operation.getTypeDechet();
	    switch(typeDechet) {
	        case "papier":
	            return new Papier(operation.getQuantite());
	        case "plastique":
	            return new Plastique(operation.getQuantite());
	        case "verre":
	            return new Verre(operation.getQuantite());
	        case "metal":
	            return new Metal(operation.getQuantite());
	        case "autres":
	            return new Autres(operation.getQuantite());
	        default:
	            throw new IllegalArgumentException("Type de déchet inconnu : " + typeDechet);
	    }
	}
	
	public static Bac creerBac(CorbeilleOperation corbeilleOperation, String couleur) {
	    if (couleur.equals("jaune")) {
	        return new Jaune(corbeilleOperation.getIdentifiant());
	    } else if (couleur.equals("vert")) {
	        return new Vert(corbeilleOperation.getIdentifiant());
	    } else if (couleur.equals("bleu")) {
	        return new Bleu(corbeilleOperation.getIdentifiant());
	    } else if (couleur.equals("classique")) {
	        return new Classique(corbeilleOperation.getIdentifiant());
	    } else {
	        throw new IllegalArgumentException("Couleur de bac non valide");
	    }
	}

	 public void enregistrerStats(CorbeilleOperation operation) {
	        // Vérifier la valeur de l'opération
		 	Dechet dechet = creerDechet(operation);
		 	Bac bac = creerBac(operation, operation.getCouleurBac());
	        boolean valeurVerifier = verifier(dechet, bac);

	        // Assigner la valeur de vérification à l'opération
	        operation.setValeurVerifier(valeurVerifier);

	        // Créer un objet GsonBuilder pour configurer la sérialisation
	        GsonBuilder builder = new GsonBuilder();
	        builder.setPrettyPrinting();
	        Gson gson = builder.create();

	        // Créer un objet FileWriter pour écrire dans un fichier
	        FileWriter writer;
	        try {
	            writer = new FileWriter("stats_poubelle.json", true); // true pour ajouter les données au fichier existant
	            // Construire un objet StatsPoubelle avec les attributs de l'opération
	            StatsAEnregistrer stats = new StatsAEnregistrer(operation.getMenageCompte().getIdentifiant(), operation.getMenageCompte().getQuartier(),
	            operation.getCouleurBac(), operation.getPoubelle().getIdentifiant(), operation.getQuantite(), operation.getNbDechets(), valeurVerifier);

	            // Convertir l'objet StatsPoubelle en JSON
	            String jsonStats = gson.toJson(stats);

	            // Écrire le JSON dans le fichier
	            writer.write(jsonStats);
	            writer.write("\n"); // ajouter une ligne vide pour faciliter la lecture

	            // Fermer le FileWriter
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 public static void main(String[] args) {
		 	MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A");
		 	Date nvdate = new Date(122,3,8);
		    CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,1,0.5f, "papier",nvdate, false, "jaune", 10);
		    poubelle.enregistrerStats(operation);
		}
	 
	 
}
	


		    
