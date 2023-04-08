package Centre_tri;

public class Papier extends Dechet{
static String type ="papier";
public final float pap;
	
	public Papier(float pap) {
		this.pap = pap;
	}
	
	@Override
	public String getType() {
	return "papier";
	}
	
	public void setType(String papier) {
		Papier.type = "papier";
	}

}
