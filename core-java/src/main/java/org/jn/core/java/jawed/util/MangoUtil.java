package org.jn.core.java.jawed.util;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.jawed.intrfc.MangoIntrfcLambda;
import org.jn.core.java.jawed.model.Mango;

public class MangoUtil {

	public static Mango[] getMangoes() {
		Mango m1 = new Mango("yellow", "sour", 5);
		Mango m2 = new Mango("yellow", "sweet", 1);
		Mango m3 = new Mango("green", "sour", 4);
		Mango m4 = new Mango("yellow", "sweet", 3);
		Mango m5 = new Mango("green", "sour", 2);
		Mango m6 = new Mango("yellow", "sweet", 6);
		return new Mango[] {m1, m2, m3, m4, m5, m6};
	}
	
	public static void print(Mango[] mangoes) {
		for (Mango mango: mangoes) {
			System.out.println(mango);
		}
	}
	
	public static Mango[] filter(MangoIntrfcLambda lambda) {
		Mango[] mangoes = MangoUtil.getMangoes();
		List<Mango> list = new ArrayList<>();
		for (Mango mango: mangoes) {
			if (lambda.filter(mango)) {
				list.add(mango);
			}
		}
		return list.toArray(new Mango[] {});
	}
}
