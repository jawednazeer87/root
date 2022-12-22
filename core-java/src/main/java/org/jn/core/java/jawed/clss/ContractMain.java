package org.jn.core.java.jawed.clss;
/**
 * @author jawednazeer
 *
 */
public class ContractMain {

	public static void main(String[] args) {
		Contract contract1 = new Contract();
		contract1.contractNum = 1;
		contract1.contractType = "normal";
		Contract.companyName = "jain co";
		
		Contract contract2 = new Contract();
		contract2.contractNum = 2;
		contract2.contractType = "long term";
		Contract.companyName = "sahil co";
		
		Contract contract3 = new Contract();
		contract3.contractNum = 3;
		contract3.contractType = "short";
		Contract.companyName = "hike";
		
		contract1.display();
		contract2.display();
		contract3.display();
	}
}
