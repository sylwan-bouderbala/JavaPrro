package Poubelle;

public class Papier extends Dechet{
	static String type ="papier";
	public final float pap;
	
	public Papier(int identifiant, float pap) {
		super(identifiant,"papier");
		this.pap = pap;
		}
	@Override
	public String getType() {
	return "papier";
	}
	
	public final float getPoids() {
		return pap;
	}
}
