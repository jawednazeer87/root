package org.la.core.java.jawed.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.la.core.java.jawed.clss.Apple;
import org.la.core.java.jawed.common.Constants;

/**
 * @author jawednazeer
 *
 */
public class AppleUtil {

	
	public static List<org.la.core.java.jawed.model.Apple> getList2(){
		return GSONGenericUtil.getList(Constants.APPLE_LIST_FILE_NAME, org.la.core.java.jawed.model.Apple[].class);
	}
	
	public static Map<Apple, String> getMap(){
		Apple apple1 = new Apple(50, "sweet", "red");
		Apple apple2 = new Apple(40, "sour", "red");
		Apple apple3 = new Apple(60, "bitter", "green");
		Apple apple4 = new Apple(100, "sour", "green");
		Apple apple5 = new Apple(80, "sweet", "red");
		Apple apple6 = new Apple(90, "bitter", "yellow");
		Apple apple7 = new Apple(20, "sweet", "yellow");
		Map<Apple, String> map = new HashMap<>();
		map.put(apple1, "one");
		map.put(apple2, "two");
		map.put(apple3, "three");
		map.put(apple4, "four");
		map.put(apple5, "five");
		map.put(apple6, "six");
		map.put(apple7, "seven");
		return map;
	}
	public static List<Apple> getList(){
		List<Apple> appleList = new ArrayList<>();
		Apple apple1 = new Apple(50, "sweet", "red");
		Apple apple2 = new Apple(40, "sour", "red");
		Apple apple3 = new Apple(60, "bitter", "white");
		Apple apple4 = new Apple(100, "sour", "green");
		Apple apple5 = new Apple(80, "sweet", "red");
		Apple apple6 = new Apple(90, "bitter", "white");
		Apple apple7 = new Apple(20, "sweet", "yellow");
		Apple apple8 = new Apple(10, "sweet", "red");
		Apple apple9 = new Apple(15, "bitter", "yellow");
		Apple apple10 = new Apple(25, "taste less", "white");
		Apple apple11 = new Apple(35, "bitter", "green");
		Apple apple12 = new Apple(30, "sweet", "green");
		appleList.add(apple1);
		appleList.add(apple2);
		appleList.add(apple3);
		appleList.add(apple4);
		appleList.add(apple5);
		appleList.add(apple6);
		appleList.add(apple7);
		appleList.add(apple8);
		appleList.add(apple9);
		appleList.add(apple10);
		appleList.add(apple11);
		appleList.add(apple12);
		return appleList;
	}
	
	//sorting using comparator by weight
	public static void appleSortByWeight() {
		List<Apple> appleList = getList();
		GenericUtil.print(appleList);
		//example of anonymous class
		Collections.sort(appleList, new Comparator<>() {
			@Override
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight().compareTo(a2.getWeight());
			}
		});
		System.out.println("after sort ----------------------------------------------------------------------------------");
		GenericUtil.print(appleList);
	}
	
	public static void print(Apple apple) {
		System.out.println("{weight: "+apple.getWeight()+", taste: "+apple.getTaste()+", color: "+apple.getColor()+"}");
	}
}
