/**
 * 
 */
package org.la.core.java.jawed.clss;

/**
 * @author jawednazeer
 *
 */
public class ClientMain {

	public static void main(String[] args) {
		Client client = new Client();
		client.setValues(1, "name", "mail@mail.com");
		client.print();
		
	}
}
