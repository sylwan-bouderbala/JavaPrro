package Centre_tri;

public class Autres extends Dechet {

	public final float poids;
	static String type = "autres";
	public Autres(int identifiant, float poids) {
		super(identifiant,"autres");
		this.poids = poids;
		}
	
	@Override
	public String getType() {
		return "autres";
	}
	
	public void setType(String autres) {
		Autres.type= "autres";
	}

}
