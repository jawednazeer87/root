package org.la.core.java.jawed.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import org.la.core.java.jawed.colectin.AppleWeightComparator;
import org.la.core.java.jawed.common.Constants;
import org.la.core.java.jawed.model.Apple;

/**
 * @author jawednazeer
 *
 */
public class AppleFilterUtil2 {

	public static List<Apple> getList(){
		return GSONGenericUtil.getList(Constants.APPLE_LIST_FILE_NAME, Apple[].class);
	}
	
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
	
	//sorting using comparator by weight
	//by anonymous class
	public static void appleSortByColor() {
		List<Apple> appleList = getList();
		GenericUtil.print(appleList);
		//example of anonymous class
		Collections.sort(appleList, new Comparator<>() {
			@Override
			public int compare(Apple a1, Apple a2) {
				return a1.getColor().compareTo(a2.getColor());
			}
		});
		System.out.println("after sort ----------------------------------------------------------------------------------");
		GenericUtil.print(appleList);
	}
	
	
	
	
	//sort using class comparator
	public static void appleSortByWeightByClass() {
		List<Apple> appleList = getList();
		GenericUtil.print(appleList);
		//example of concrete class
		Collections.sort(appleList, new AppleWeightComparator());
		System.out.println("after sort ----------------------------------------------------------------------------------");
		GenericUtil.print(appleList);
	}
	
	
	
	//sort using class comparator
	public static void appleSortByWeightByLambda() {
		//lambda function
		Comparator<Apple> comparator = (a1, a2)-> a1.getWeight().compareTo(a2.getWeight());
		List<Apple> appleList = getList();
		GenericUtil.print(appleList);
		//example of lambda function
		Collections.sort(appleList, comparator);
		System.out.println("after sort ----------------------------------------------------------------------------------");
		GenericUtil.print(appleList);
	}
}
