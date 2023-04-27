package com.cytech.Test;

import com.cytech.Centre_tri.centre_tri;
import com.cytech.Poubelle.Poubelle;
import com.cytech.Usuelles.LectureFichier;

public class Testlecteurfichier {
	public static void main(String[] args) {
		centre_tri centre1 = new centre_tri("lico", "lico", "1234");
		centre_tri centre2 = new centre_tri("liico", "lizco", "12334");
		LectureFichier lecteur = new LectureFichier("datas\\Centre_tri.csv");
		System.out.println(lecteur.Isinlinenth(1, "lico"));
		Poubelle p = new Poubelle(1, 10, 5, 1234, "Quartier1");
		Poubelle p2 = new Poubelle(0, 11, 4, 2234, "Quartier1");
		centre2.Ajouter(p2);
		centre2.Ajouter(p);
		Poubelle pp = lecteur.CreatePoubelle(12);
		System.out.println(pp.quartier);
	}
}
