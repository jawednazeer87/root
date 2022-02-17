package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * int greatest(int[])
		find greatest element of an array and return that greatest value
	
*/

public class SmallestElement {
	static Logger log = LoggerFactory.getLogger(SmallestElement.class);

	public static void main(String[] args) {
		int a[] = {19,-2,-1,5,6,7,8,9};
	 int b= smallest(a);
		log.info("smallest = "+b);
	}
	static  int smallest(int[]a) {
		int temp=0,c;
		for(int i=0;i<a.length;i++)  {
           c=0;
           for(int j=i+1;j<a.length;j++) {          
        	   if(a[i]>a[i+1])  {
             	  c=1;
             	  temp = a[i];
             	  a[i]=a[i+1];
             	  a[i+1]=temp;
               }
        	   if(c==0)
    				break;   
        
        	  }
			
		}
		for(int ar:a)
				log.info("Sum = "+ar);
		return a[0];  	
		}
	
}
