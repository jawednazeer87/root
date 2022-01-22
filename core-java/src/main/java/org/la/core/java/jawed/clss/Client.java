/**
 * 
 */
package org.la.core.java.jawed.clss;

/**
 * @author jawednazeer
 *
 */
public class Client {
	int clientId;
	String clientName;
	String clientEmailid;
	
	void print() {
		System.out.println("clientId: "+clientId);
		System.out.println("clientName: "+clientName);
		System.out.println("clientEmailid: "+clientEmailid);
	}
	
	void setValues(int id, String name, String emailid) {
		clientId = id;
		clientName = name;
		clientEmailid = emailid;
	}
}
