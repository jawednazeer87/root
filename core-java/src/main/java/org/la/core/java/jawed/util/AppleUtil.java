package org.la.core.java.jawed.util;

import java.util.ArrayList;
import java.util.List;

import org.la.core.java.jawed.clss.Apple;

/**
 * @author jawednazeer
 *
 */
public class AppleUtil {

	public static List<Apple> getList(){
		List<Apple> appleList = new ArrayList<>();
		Apple apple1 = new Apple(50, "sweet", "red");
		Apple apple2 = new Apple(40, "sour", "red");
		Apple apple3 = new Apple(60, "bitter", "green");
		Apple apple4 = new Apple(100, "sour", "green");
		Apple apple5 = new Apple(80, "sweet", "red");
		Apple apple6 = new Apple(90, "bitter", "yellow");
		Apple apple7 = new Apple(20, "sweet", "yellow");
		appleList.add(apple1);
		appleList.add(apple2);
		appleList.add(apple3);
		appleList.add(apple4);
		appleList.add(apple5);
		appleList.add(apple6);
		appleList.add(apple7);
		return appleList;
	}
	
	public static void print(Apple apple) {
		System.out.println("{weight: "+apple.getWeight()+", taste: "+apple.getTaste()+", color: "+apple.getColor()+"}");
	}
}
