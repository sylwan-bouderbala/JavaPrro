package Centre_tri;

public class Carton extends Dechet{
	
	public final float pc;
	static String type = "carton";
	
	public Carton(float pc) {
		this.pc = pc;


	@Override
	public String getType() {
		return "carton";
	}
	public void setTyoe(String carton) {
		Carton.type = "carton";
	}
}
