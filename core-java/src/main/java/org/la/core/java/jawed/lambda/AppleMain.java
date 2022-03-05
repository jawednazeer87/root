package org.la.core.java.jawed.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.la.core.java.jawed.model.Apple;
import org.la.core.java.jawed.util.AppleFilterUtil2;
import org.la.core.java.jawed.util.AppleUtil;
import org.la.core.java.jawed.util.GenericUtil;
/**
 * @author jawednazeer
 *
 */
public class AppleMain {

	public static void main(String[] args) {
		//redAppleList();
		//greenAppleList();
		//AppleFilterUtil2.appleSortByWeightByLambda();
		//AppleFilterUtil2.appleSortByColor();
		//AppleFilterUtil2.appleSortByWeightByClass();
		//AppleFilterUtil2.appleSortByWeightByLambda();
		//redAppleList();
		//greenAppleList();
		//getByColor("yellow");
		//getByBehavior();
		//streamAgain();
		
	}
	
	//trying to access stream again once it used
	static void streamAgain() {
		List<Apple> list = AppleUtil.getList2();
		Stream<Apple> stream = list.stream();
		stream.forEach(a-> System.out.println(a));
		stream.forEach(a-> System.out.println(a));	//dont use, it is already consumed or closed
	}
	
	//get by behavior
	static List<Apple> getByBehavior(){
		List<Apple> list = AppleUtil.getList2();
		Predicate<Apple> predicate = a-> a.getColor().equalsIgnoreCase("red") && a.getWeight()>=32;
		List<Apple> dynamicList = AppleFilterUtil2.getByBehavior(list, predicate);
		//System.out.println(dynamicList);
		GenericUtil.print(dynamicList);
		return dynamicList;
		
	}
	//get red apple
	static List<Apple> redAppleList() {
		List<Apple> list = AppleUtil.getList2();
		List<Apple> redList = AppleFilterUtil2.getRed(list);
		System.out.println(redList);
		return list;
	}
	//get red apple
	static List<Apple> greenAppleList() {
		List<Apple> list = AppleUtil.getList2();
		List<Apple> greenList = AppleFilterUtil2.getGreen(list);
		System.out.println(greenList);
		return list;
	}
	//get red apple
	static List<Apple> getByColor(String color) {
		List<Apple> list = AppleUtil.getList2();
		List<Apple> greenList = AppleFilterUtil2.getByColor(list, color);
		System.out.println(greenList);
		return list;
	}
}
