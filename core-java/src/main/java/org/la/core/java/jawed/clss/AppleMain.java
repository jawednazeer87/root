/**
 * 
 */
package org.la.core.java.jawed.clss;

import java.util.List;

import org.la.core.java.jawed.util.AppleUtil;

/**
 * @author jawednazeer
 *
 */
public class AppleMain {

	public static void main(String[] args) {
		
		List<Apple> listApple = AppleUtil.getList();
		//System.out.println(listApple);
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
		
	}
}
