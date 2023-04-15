package com.cytech.Poubelle;

public class Verre extends Dechet {

public final float pv;
	static String type = "verre";
	
	public Verre(int identifiant, float pv) {
		super(identifiant,"verre");
		this.pv = pv;
		}
	
	@Override
	public String getType() {
		return "verre";
	}
	
	public void setType(String verre) {
		Verre.type = "verre";
	}
	
	public final float getPoids() {
		return pv;
	}

}
