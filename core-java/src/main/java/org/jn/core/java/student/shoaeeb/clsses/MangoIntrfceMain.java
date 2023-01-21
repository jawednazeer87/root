package org.jn.core.java.student.shoaeeb.clsses;

public class MangoIntrfceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MangoIntrfce lambda = mango -> mango.getTaste().equalsIgnoreCase("sweet");
		Mango[] sweetMangoes = MangoUtil.filter(lambda);
		System.out.println(sweetMangoes);
	}

}
