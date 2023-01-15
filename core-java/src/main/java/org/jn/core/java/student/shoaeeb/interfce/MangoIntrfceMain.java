package org.jn.core.java.student.shoaeeb.interfce;

import org.jn.core.java.student.shoaeeb.util.*;
import org.jn.core.java.student.shoaeeb.model.Mango;

public class MangoIntrfceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MangoIntrfce lambda = mango -> mango.getTaste().equalsIgnoreCase("sweet");
		//Mango[] mangoes = MangoUtil.getMangoes();
		Mango[] sweetMangoes = MangoUtil.filter(lambda);
		MangoUtil.print(sweetMangoes);
		
	}

}
