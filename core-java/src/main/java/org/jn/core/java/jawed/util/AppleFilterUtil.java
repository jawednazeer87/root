package org.jn.core.java.jawed.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.jn.core.java.jawed.clss.Apple;

/**
 * @author jawednazeer
 *
 */
public class AppleFilterUtil {

	//filter red apple
	public static List<Apple> getRed(List<Apple> appleList){
		List<Apple> redAppleList = new ArrayList<>();
		for(Apple apple : appleList) {
			if(apple.getColor().equalsIgnoreCase("red")) {
				redAppleList.add(apple);
			}
		}
		return redAppleList;
	}
	
	//filter green apple
	public static List<Apple> getGreen(List<Apple> appleList){
		List<Apple> greenAppleList = new ArrayList<>();
		for(Apple apple : appleList) {
			if(apple.getColor().equalsIgnoreCase("green")) {
				greenAppleList.add(apple);
			}
		}
		return greenAppleList;
	}
	
	//filter apple by color
	public static List<Apple> getByColor(List<Apple> appleList, String color){
		List<Apple> redAppleList = new ArrayList<>();
		for(Apple apple : appleList) {
			if(apple.getColor().equalsIgnoreCase(color)) {
				redAppleList.add(apple);
			}
		}
		return redAppleList;
	}
	
	//filter apple by behavior
	public static List<Apple> getByBehavior(List<Apple> appleList, Predicate<Apple> predicate){
		List<Apple> selectedAppleList = new ArrayList<>();
		for(Apple apple : appleList) {
			if(predicate.test(apple)) {
				selectedAppleList.add(apple);
			}
		}
		return selectedAppleList;
	}
}
