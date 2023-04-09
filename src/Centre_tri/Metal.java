package Centre_tri;

public class Metal extends Dechet {
	
	public final float pm;
	static String type = "metal";
	
	public Metal(float pm) {
		this.pm = pm;
		}
	@Override
	public String getType() {
		return "metal";
		}
	
	public void setType(String metal) {
		Metal.type = "metal";
	}

}
