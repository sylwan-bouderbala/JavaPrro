package com.cytech.Poubelle;

public class Plastique extends Dechet{
	
	public final float pp;
	static String type = "plastique";
	public Plastique(int identifiant, float pp) {
		super(identifiant,"metal");
		this.pp = pp;
		}
	@Override
	public String getType() {
	return "plastique";
	}
	
	public final float getPoids() {
		return pp;
	}
}
