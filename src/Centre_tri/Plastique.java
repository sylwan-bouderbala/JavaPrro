package Centre_tri;

public class Plastique extends Dechet{
	
	public final float pp;
	static String type = "plastique";
	public Plastique(float pp) {
		this.pp = pp;
	}
	@Override
	public String getType() {
	return "plastique";
	}
	
	public void setType(String plastique) {
		Plastique.type = "plastique";
	}
}
