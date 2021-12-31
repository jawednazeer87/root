package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Finding duplicate elements in array");
		boolean c= true;
		int a [] = {33,99,7,150,200};
		int b [] = {33,99,7,150,200};
		if(a.length == b.length){
        for (int i = 0; i <=a.length-1; i++) {
      
                if (a[i]!=b[i])  {
                     c =false;
                              }
                          }
		          }
		else { 
			c= false;
			}
		
        if (c) {
        System.out.println("Two arrays are Equal : " + c);
        }
        else {
        	 System.out.println("Two arrays are not  Equal : " + c);
	}

}
}
