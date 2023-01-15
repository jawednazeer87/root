package org.la.corejava.student.aameen.array;

public class FinalKeywordProgram {

	public static void main(String[] args) {
		// in a primitive datat type 
		//final keyword it make the variable constant and
		//read only ,you cannot change after declaring it final.
		final int x=2;
		System.out.println("x : "+x);
				//in secondary data type 
		// you cannot change its refrence but can change in memory values 
		int a[]= {1,2,3,4};
		a[0]=12;
		System.out.println("a[0] : "+a[0]);
	}

}
