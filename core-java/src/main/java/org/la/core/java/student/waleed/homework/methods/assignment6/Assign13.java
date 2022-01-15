package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign13 {

	public static void main(String[] args) {
		int a[] = {99,999,77,12,199};
		int b[] = {55,77,1,110,770};
		int c [] =  copyTwoArrays(a,b);
		int index= 0;
		for (int i : c) {
			
		
			System.out.println("c["+index+"] = "+i+"");
			index++;
		}
	}
		
		
		static int[] copyTwoArrays(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		for (int i=0;i<=a.length-1;i++) {
			c[i]=a[i];}
		
		
		for (int i=0;i<=b.length-1;i++) {
			c[a.length+i]=b[i];}

		
		return c;
		

	}

}
