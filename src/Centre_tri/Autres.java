package Centre_tri;

public class Autres extends Dechet {

	public final float poids;
	static String type = "autres";
	public Autres(float poids) {
		this.poids = poids;
	}
	public String getType() {
		return "autres";
	}
	
	public void setType(String autres) {
		Autres.type= "autres";
	}

}
