package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<User> list = UserList.getUserList();
		Comparator<User> comparator = (o1,o2)-> {
			if(o1.getUserId()>o2.getUserId())
			{
				return 1;
			}
			if(o1.getUserId()==o2.getUserId())
			{
				return 0;
			}
			return -1;
		};
		Collections.sort(list,comparator);
		System.out.println(list);
	}

}
