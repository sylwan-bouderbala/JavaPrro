package com.cytech.Test;

import com.cytech.Centre_tri.centre_tri;
import com.cytech.Usuelles.LectureFichier;

public class Testlecteurfichier {
	public static void main(String[] args) {
		LectureFichier lecteur = new LectureFichier("datas\\Centre_tri.csv");
		centre_tri centre = lecteur.create_object_centre_tri(1, "Abrahams");
	}
}
