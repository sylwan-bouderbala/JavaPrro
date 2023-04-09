package Centre_tri;

public class Verre extends Dechet {

public final float pv;
	static String type = "verre";
	
	public Verre(float pv) {
		this.pv = pv;
	}
	
	@Override
	public String getType() {
		return "verre";
	}
	
	public void setType(String verre) {
		Verre.type = "verre";
	}

}
