package com.cytech.Poubelle;

public class Carton extends Dechet{
	
	public static final String TYPE = "carton";
	public final float pc;
	
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
