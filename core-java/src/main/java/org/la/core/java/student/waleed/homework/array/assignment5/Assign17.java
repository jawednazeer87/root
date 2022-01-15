package org.la.core.java.student.waleed.homework.array.assignment5;



public class Assign17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	int a[] = {99,999,77,12,199};
	int b[] = {55,77,1,110,770};
	int c[] = new int[a.length + b.length];
	for (int i=0;i<=a.length-1;i++) {
		c[i]=a[i];}
	
	
	for (int i=0;i<=b.length-1;i++) {
		c[a.length+i]=b[i];}

	
	for (int i=0;i<=c.length-1;i++) {
		System.out.println("c["+i+"] = "+c[i]+"");}
	
	

}
}
