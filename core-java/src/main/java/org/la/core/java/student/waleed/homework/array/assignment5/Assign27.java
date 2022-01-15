package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

        int a[] = {7,11,200,1999,8,100,99,500};
     
        int index =0;
        for(int i = 0; i < a.length; i++)
        {
     
            if(a[i] == 99) {
            index = i;
            break;
  
        } 
        }
            if(a[index] == 99) {
             System.out.println(" Index  = "+ index);  }
        else {
        	System.out.println("-1" );}
	

}
}
	
