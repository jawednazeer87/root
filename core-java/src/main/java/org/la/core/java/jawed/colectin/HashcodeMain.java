package org.la.core.java.jawed.colectin;

import java.util.Map;

import org.la.core.java.jawed.clss.Apple;
import org.la.core.java.jawed.util.AppleUtil;

/**
 * @author jawednazeer
 *
 */
public class HashcodeMain {
	public static void main(String[] args) {
		Map<Apple, String> map = AppleUtil.getMap();
		System.out.println(map);
	}
}
