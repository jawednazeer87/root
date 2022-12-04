package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

public class CheckExactArray {

	public static void main(String[] args) {
		int arrayOne[] = {3,2,1,4,7,6,5,8,9};
		int arrayTwo[] = {1,2,3,8,5,6,7,4,9};
		
		int num=0;
		
		for(int x:arrayOne) {
			for(int y:arrayTwo) {
				if(x==y) {
					num++;
				}
			}
		}
		System.out.println(num==arrayOne.length?"they are same":"they are two different array");
	}

}
