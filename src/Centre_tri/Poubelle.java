package Centre_tri;

import java.util.ArrayList;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class Poubelle {
	private int identifiantP; //- identifiantP est l'identifiant de la poubelle
	protected float quantiteMaximale;
	protected float quantite;
	private int codeAcces;
	public String quartier;
	private centre_tri Centre;
	private boolean estPleine;
	private Bac[] bacs;


	public Poubelle (int identifiantP, float quantiteMaximale, float quantite, int codeAcces, String quartier,Bac[] bacs) {
		this.identifiantP= identifiantP;
		this.quantiteMaximale = quantiteMaximale;
		this.quantite = quantite;
		this.codeAcces = codeAcces;
		this.quartier = quartier;
		this.estPleine = false;
		this.bacs=bacs;
		bacs = new Bac[4];
        bacs[0] = new Bac(0, "jaune");
        bacs[1] = new Bac(1, "vert");
        bacs[2] = new Bac(2, "classique");
        bacs[3] = new Bac(3, "bleu");
		
	}
	
	public void setIdentifiant(int identifiantP){
		this.identifiantP= identifiantP;
	}

	public int getIdentifiant() {
		return identifiantP;
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

	public boolean estPleine() {
	    return estPleine;
	}

	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}
	
	public void setCodeAcces(int codeAcces) {
		this.codeAcces = codeAcces;
	}
	
	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}
	
	
	public int identifier(CorbeilleOperation operation ) {
		return operation.getMenageCompte().getIdentifiant();
	}
	
	public void envoyerNotifs(CorbeilleOperation operation, Poubelle p) {
		if (p.quantite >=p.quantiteMaximale) {
			estPleine = true;
		}
	}
	
	public Bac[] getBacs() {
		return bacs;
	}
	
	public void calculer(){
		
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
	
	public int getIdentifiantBac(String couleurBac) {
        for (Bac bac : bacs) {
            if (bac.getCouleur().equals(couleurBac)) {
                return bac.getIdentifiant();
            }
        }
        return -1; // Retourne -1 si la couleur n'est pas trouvée dans la liste de bacs
    }
	
	public void enregistrerStats(CorbeilleOperation operation) {
	    // Vérifier la valeur de l'opération
	    Dechet dechet = new Dechet(operation.getIdDechet(),operation.getTypeDechet());
	    Bac bac = new Bac(getIdentifiantBac(operation.getCouleurBac()), operation.getCouleurBac());
	    boolean valeurVerifier = verifier(dechet, bac);

	    // Assigner la valeur de vérification à l'opération
	    operation.setValeurVerifier(valeurVerifier);

	    // Créer un objet FileWriter pour écrire dans un fichier CSV
	    FileWriter writer;
	    try {
	        writer = new FileWriter("stats_poubelle.csv", true); // true pour ajouter les données au fichier existant
	        
	        // Écrire les données dans le fichier CSV
	        writer.write(operation.getMenageCompte().getIdentifiant() + ",");
	        writer.write(operation.getMenageCompte().getQuartier() + ",");
	        writer.write(operation.getCouleurBac() + ",");
	        writer.write(operation.getPoubelle().getIdentifiant() + ",");
	        writer.write(operation.getQuantite() + ",");
	        writer.write(operation.getNbDechets() + ",");
	        writer.write(valeurVerifier + ",");
	        writer.write("\n"); // ajouter une ligne vide pour faciliter la lecture
	        
	        // Fermer le FileWriter
	        writer.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}	
	 public static void main(String[] args) {
		 	MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		 	Bac[] bacs = new Bac[4];
	        bacs[0] = new Bac(1, "jaune");
	        bacs[1] = new Bac(2, "vert");
	        bacs[2] = new Bac(3, "classique");
	        bacs[3] = new Bac(4, "bleu");
		 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A",bacs);
		 	Date nvdate = new Date(122,3,8);
		    CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
		    poubelle.enregistrerStats(operation);
		}
	 
	 
}
	


		    
	


		    
