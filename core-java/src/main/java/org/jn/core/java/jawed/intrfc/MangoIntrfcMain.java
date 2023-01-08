package org.jn.core.java.jawed.intrfc;

import org.jn.core.java.jawed.model.Mango;
import org.jn.core.java.jawed.util.MangoUtil;

public class MangoIntrfcMain {

	public static void main(String[] args) {
		MangoIntrfc mi = new MangoIntrfcImpl();
		Mango[] mangoes = MangoUtil.getMangoes();
		Mango[] sweetMangoes = mi.filter(mangoes, "sweet");
		MangoUtil.print(sweetMangoes);
		Mango[] sourMangoes = mi.filter(mangoes, "sour");
		MangoUtil.print(sourMangoes);
	}
}
