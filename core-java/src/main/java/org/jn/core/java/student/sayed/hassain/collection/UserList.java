package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	public static List getUserList() {
		List<User> list = new ArrayList<>();
		
		list.add(new User(1,"user1@gmail.com"));
		list.add(new User(5,"user5@gmail.com"));
		list.add(new User(2,"user2@gmail.com"));
		list.add(new User(4,"user4@gmail.com"));
		return list;
		
	}
}
