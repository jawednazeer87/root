package org.la.core.java.student.sajid.looping.assignment4;

public class Wap44 {

	public static void main(String[] args) {
		int givenNum = 12345;
		int dispNum = givenNum;
		int rvrsNum = 0;
		
		for( ;givenNum>0;) {
			
			int r = givenNum % 10;
			
			
			givenNum = givenNum/10;
			
			
			rvrsNum = rvrsNum * 10 + r; 
			System.out.println("Cuurent rvrsNum: "+rvrsNum);
				
		}
		System.out.println("Reverse number for "+dispNum+" is: "+rvrsNum);

	}

}
