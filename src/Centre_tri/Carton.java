package Centre_tri;

public class Carton extends Dechet{
	
	public static final String TYPE = "carton";
	public static final float pc;
	
	public Carton(int identifiant, float pc) {
		super(identifiant, TYPE);
		this.pc = pc;
	}
	
	public float getPoids() {
		return pc;
	}
	
	
	@Override
	public String getType() {
		return TYPE;
	}
}
