/**
 * 
 */
package org.la.core.java.jawed.clss;

/**
 * @author jawednazeer
 *
 */
public class UserMain {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("id: "+user.id);
		System.out.println("name: "+user.name);
		System.out.println("email: "+user.email);
		
		user.id = 1;
		user.name = "jamil";
		user.email = "mail@email.com";
		System.out.println("id: "+user.id);
		System.out.println("name: "+user.name);
		System.out.println("email: "+user.email);
	}
}