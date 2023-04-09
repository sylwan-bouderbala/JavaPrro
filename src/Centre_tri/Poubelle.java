package Centre_tri;

import java.util.ArrayList;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Poubelle {
	private int identifiantP; //- identifiantP est l'identifiant de la poubelle
	protected float quantiteMaximale;
	protected float quantite;
	private int codeAcces;
	public String quartier;
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
	
	public void envoyerNotifs(CorbeilleOperation operation) {
		Poubelle p = operation.getPoubelle();
		float quantite = p.getQuantite();
		quantiteMaximale= p.getQuantiteMaximale();
		if (quantite >= quantiteMaximale) {
			estPleine = true;
		}
	}
	
	public Bac[] getBacs() {
		return bacs;
	}
	
	public static float calculer(CorbeilleOperation operation){
		
		float nbDechets = operation.getNbDechets();
		if (operation.getTypeDechet().equals("verre")){
			Verre verre = new Verre(1, 0.5f);
			float poids = verre.pv;
			return poids*nbDechets;
		}
		else if (operation.getTypeDechet().equals("papier")) {
			Papier papier = new Papier(1,0.5f);
			float poids = papier.pap;
			return poids*nbDechets;
		}
		else if (operation.getTypeDechet().equals("carton")) {
			Carton carton = new Carton(1,0.5f);
			float poids = carton.pc;
			return poids*nbDechets;
		}
		else if (operation.getTypeDechet().equals("metal")) {
			Metal metal = new Metal(1,0.5f);
			float poids = metal.pm;
			return poids*nbDechets;
		}
		else if (operation.getTypeDechet().equals("plastique")) {
			Plastique plastique = new Plastique(1,0.5f);
			float poids = plastique.pp;
			return poids*nbDechets;
		}
		else {
			Autres autres = new Autres(1,0.5f);
			float poids = autres.poids;
			return poids*nbDechets;
		}
	}

	public boolean verifier(Dechet dechet, Bac bacs) {
	    if (dechet.getType().equals("verre") && bacs.getCouleur().equals("vert")) {
	        return true;
	    }
	    else if (dechet.getType().equals("papier") && bacs.getCouleur().equals("bleu")) {
	        return true; 
	    }
		else if (dechet.getType().equals("plastique") || (dechet.getType().equals("carton") || dechet.getType().equals("metal"))  && (bacs.getCouleur().equals("jaune"))) {
	        return true; 
		}
	    else if (dechet.getType().equals("autres")  && (bacs.getCouleur().equals("classique"))) {
			return true;
	    } 
	    else {
	        return false;
	    }
	}
		      
	public void attribuer(Dechet dechet, Bac bacs, CorbeilleOperation corbeilleOperation) {
		if (verifier(dechet, bacs)) {
			corbeilleOperation.getMenageCompte().incrementFidelite(corbeilleOperation.getMenageCompte());
		}
		else {
			corbeilleOperation.getMenageCompte().decrementFidelite(corbeilleOperation.getMenageCompte());
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
	
	
	public void ajouterOperationAuFichier() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
		MenageCompte compte2 = new MenageCompte(1, "mdp123", "La Bourse", 4, 10);
		MenageCompte compte3 = new MenageCompte(1, "mdp123", "L'Hotel de ville", 4, 10);
	 	Bac[] bacs = new Bac[4];
        bacs[0] = new Bac(1, "jaune");
        bacs[1] = new Bac(2, "vert");
        bacs[2] = new Bac(3, "classique");
        bacs[3] = new Bac(4, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A",bacs);
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	 	for (int i = 0; i < 30; i++) {
	 		CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1+i,0.5f, "papier",nvdate, false, "jaune",10+i);
		    CorbeilleOperation operation2 = new CorbeilleOperation(poubelle,compte2,6+5*i,0.5f, "plastique",nvdate, true, "bleu",30+i);
		    CorbeilleOperation operation3 = new CorbeilleOperation(poubelle,compte3,6+2*i,0.5f, "carton",nvdate, true, "vert",30+i);
		    poubelle.enregistrerStats(operation);
		    poubelle.enregistrerStats(operation2);
	 	    poubelle.enregistrerStats(operation3);
	 	}
	}
	
	// Cette méthode décrit le processus suivi lorsqu'un ménage jette un déchet dans la poubelle.
	public void jeter() {
		MenageCompte compte1 = new MenageCompte(1, "mdp123", "Quartier A", 4, 10);
	 	Bac[] bacs = new Bac[4];
        bacs[0] = new Bac(1, "jaune");
        bacs[1] = new Bac(2, "vert");
        bacs[2] = new Bac(3, "classique");
        bacs[3] = new Bac(4, "bleu");
	 	Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A",bacs);
	 	LocalDate nvdate = LocalDate.of(2023,4,9);
	 	CorbeilleOperation operation = new CorbeilleOperation(poubelle,compte1,1,0.5f, "papier",nvdate, false, "jaune",10);
	 	Dechet dechet = new Dechet(operation.getIdDechet(),operation.getTypeDechet());
	    Bac bac = new Bac(getIdentifiantBac(operation.getCouleurBac()), operation.getCouleurBac());
		calculer(operation);
		verifier(dechet,bac);
		attribuer(dechet,bac, operation);
		envoyerNotifs(operation);
		enregistrerStats(operation);
		
	}
	 public static void main(String[] args) {
		 Bac[] bacs = new Bac[4];
	        bacs[0] = new Bac(1, "jaune");
	        bacs[1] = new Bac(2, "vert");
	        bacs[2] = new Bac(3, "classique");
	        bacs[3] = new Bac(4, "bleu");
		 Poubelle poubelle = new Poubelle(1, 50.0f, 20.0f, 1234, "Quartier A",bacs);
		 poubelle.ajouterOperationAuFichier();
		}
	 
	 
}
	


		    
	


		    
