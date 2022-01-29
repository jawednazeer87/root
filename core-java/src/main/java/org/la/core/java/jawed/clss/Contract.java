package org.la.core.java.jawed.clss;

/**
 * @author jawednazeer
 *
 */
public class Contract {

	int contractNum;
	String contractType;
	static String companyName;
	
	void display() {
		System.out.println("contractNum: "+contractNum);
		System.out.println("contractType: "+contractType);
		System.out.println("companyName: "+companyName);
	}
	static void print() {
		System.out.println("companyName: "+companyName);
	}
	static void sPrint() {
		Contract contract = new Contract();
		System.out.println("contractNum: "+contract.contractNum);
		System.out.println("contractType: "+contract.contractType);
		System.out.println("companyName: "+companyName);
		
		contract.display();
	}
}
