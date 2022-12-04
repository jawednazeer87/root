package org.jn.core.java.jawed.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jawednazeer
 *
 */
public class UserArrays {
	
	public static void main(String[] args) {
		User[] userArr = getArray();
		
		
	}
	
	static User[] getArray() {
		User user1 = new User(1, "one", "one@mail.com", 51.4);
		User user2 = new User(2, "two", "two@mail.com", 52.4);
		User user3 = new User(3, "three", "three@mail.com", 53.4);
		User user4 = new User(4, "four", "four@mail.com", 54.4);
		User user5 = new User(5, "five", "five@mail.com", 55.4);
		User user6 = new User(6, "six", "six@mail.com", 56.4);
		User user7 = new User(7, "seven", "seven@mail.com", 57.4);
		User user8 = new User(8, "eight", "eight@mail.com", 58.4);
		User user9 = new User(9, "nine", "nine@mail.com", 59.4);
		Comparator<User> comp = Comparator.comparing(User::getId);
		User[] userArr = {user1, user2, user3, user4, user5, user6, user7, user8, user9};
		int binarySearch = Arrays.binarySearch(userArr, user1, comp);
		System.out.println("binarySearch: "+binarySearch);
		boolean equals = user1.equals(user2);
		System.out.println("equals: "+equals);
		return userArr;
	}

}
