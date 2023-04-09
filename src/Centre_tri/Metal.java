package Centre_tri;

public class Metal extends Dechet {
	
	public final float pm;
	static String type = "metal";
	
	public Metal(int identifiant, float pm) {
		super(identifiant,"metal");
		this.pm = pm;
		}
	@Override
	public String getType() {
		return "metal";
		}
	
	public final float getPoids() {
		return pm;
	}

}
