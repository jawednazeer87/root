package org.jn.corejava.student.aameen.clss;

public class CountNumMain {

	public static void main(String[] args) {
		// 
		
		CountNum countnm = new CountNum();
		countnm.setter(5);
		for(int i=1;i<countnm.getter();i++)
		{
			System.out.println(i);
		}

	}

}
