package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to find duplicate elements in an array? 
 */
public class Example19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {6,4,2,4,8,5,1,2,5,1,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
