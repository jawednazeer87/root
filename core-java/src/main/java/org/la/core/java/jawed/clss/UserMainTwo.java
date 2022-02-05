package org.la.core.java.jawed.clss;

import org.la.core.java.jawed.model.User;
/**
 * @author jawednazeer
 *
 */
public class UserMainTwo {

	public static void main(String[] args) {
		User user = new User();	//uses-a
		user.setId(1);
		user.setName("jamal");
		user.print();
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("kamal");
		user2.print();
	}
}
