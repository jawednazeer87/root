/**
 * 
 */
package org.la.core.java.jawed.clss;

import java.util.List;
import java.util.function.Predicate;

import org.la.core.java.jawed.util.AppleFilterUtil;
import org.la.core.java.jawed.util.AppleUtil;
import org.la.core.java.jawed.util.GenericUtil;

/**
 * @author jawednazeer
 *
 */
public class AppleMain {

	public static void main(String[] args) {
		
		List<Apple> listApple = AppleUtil.getList();
		Predicate<Apple> predicate = apple -> apple.getColor().equalsIgnoreCase("red"); 
		List<Apple> byBehaviorList = AppleFilterUtil.getByBehavior(listApple, predicate);
		//GenericUtil.print(byBehaviorList);
		predicate = apple -> apple.getColor().equalsIgnoreCase("green") && apple.getTaste().equalsIgnoreCase("sweet");
		byBehaviorList = AppleFilterUtil.getByBehavior(listApple, predicate);
		GenericUtil.print(byBehaviorList);
		
		//System.out.println(listApple);
		/*
		for(Apple apple : listApple) {
			System.out.println(apple);
		}
		
		System.out.println("size: "+listApple.size());
		System.out.println("isEmpty: "+listApple.isEmpty());
		
		int i = 0;
		while(i<listApple.size()) {
			Apple apple = listApple.get(i);
			i++;
		}
		*/
	}
}
