package org.jn.core.java.jawed.intrfc;

import org.jn.core.java.jawed.model.Mango;
import org.jn.core.java.jawed.util.MangoUtil;

public class MangoIntrfcLambdaMain {
	
	public static void main(String[] args) {
		MangoIntrfcLambda lambda = mango -> mango.getTaste().equalsIgnoreCase("sweet");
		Mango[] sweetMangoes = MangoUtil.filter(lambda);
		System.out.println("sweet");
		MangoUtil.print(sweetMangoes);
		
		lambda = mango -> mango.getColor().equalsIgnoreCase("green");
		Mango[] greenColor = MangoUtil.filter(lambda);
		System.out.println("\ngreen");
		MangoUtil.print(greenColor);
		
		lambda = mango -> mango.getWeight() <= 3;
		Mango[] lightWeight = MangoUtil.filter(lambda);
		System.out.println("\nlight weight");
		MangoUtil.print(lightWeight);
	}
	
	
}
