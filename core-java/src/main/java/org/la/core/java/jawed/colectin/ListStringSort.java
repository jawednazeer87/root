package org.la.core.java.jawed.colectin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.la.core.java.jawed.model.User;
import org.la.core.java.jawed.util.UserUtil;

/**
 * @author jawednazeer
 *
 */
public class ListStringSort {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("amin", "naem", "shaher", "saman", "najib", "samee", "anil");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("after sorting--------------------------------------------------");
		System.out.println(list);
		System.out.println("after reverse sorting--------------------------------------------------");
		Collections.reverse(list);
		System.out.println(list);
		
	}
}
