package Centre_tri;

public class Carton extends Dechet{
	
	public static final String TYPE = "carton";
	private float pc;
	
	public Carton(int identifiant, float pc) {
		super(identifiant, TYPE);
		this.pc = pc;
	}
	
	public float getPoids() {
		return pc;
	}
	
	public void setPoids(float pc) {
		this.pc = pc;
	}
	
	@Override
	public String getType() {
		return TYPE;
	}
}
