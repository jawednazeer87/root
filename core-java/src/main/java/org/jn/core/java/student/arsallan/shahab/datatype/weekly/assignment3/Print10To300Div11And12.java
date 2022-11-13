package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class Print10To300Div11And12 {

	public static void main(String[] args) {
		int i =10;
		while(i<=300) {
			if(i%12 ==0 && i%11 ==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
