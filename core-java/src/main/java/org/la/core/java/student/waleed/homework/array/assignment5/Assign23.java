package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a =  {11, 7, 13, 77, 25, 21, 7, 11, 77,25};   
		
    
       int v= -1;
        int f[] = new int [a.length];
        
        for(int i = 0; i < a.length; i++) {  
        	
        	  int count = 1;
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j]) {
                	count++;
                	f[j] = v;
                	   System.out.println("f["+j+"] =" +f[j]);
                }
     
            } 
            System.out.println("f["+i+"] = " + f[i]);
            System.out.println("v = " +v);
             if(f[i]!=v)
            	 f[i] = count;  
             System.out.println("f["+i+"] =" +f[i]);
        }
        
        for(int i = 0; i < f.length; i++) {
        
        		if(f[i] != v)  
        	
        		{
            System.out.println(" Occurrrences/Frequences of an element "+ a[i] +" = "+ f[i]);   
     
	}

}
}
}
