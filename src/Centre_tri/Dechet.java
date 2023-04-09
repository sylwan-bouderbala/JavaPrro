package Centre_tri;

public class Dechet {
	
	private int identifiant;
	private String type;

	public Dechet(int identifiant, String type) {
	    this.identifiant = identifiant;
	    this.type = type;
	}

	public int getIdentifiant() {
	    return identifiant;
	}

	public void setIdentifiant(int identifiant) {
	    this.identifiant = identifiant;
	}

    public String getType() {
        if (type == null) {
            throw new UnsupportedOperationException("Impossible : ce type de déchets n'existe pas");
        }
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
