package org.jn.core.java.student.shoaeeb.arrays.program;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
        
        //create a new array
        try {
            if(n==0)
            {
                throw new ArithmeticException();
            }
            int arr[] = new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i]=Integer.parseInt(args[i]);
            }
            int sum=0;
            for(int i=0; i<n; i++)
            {
                sum+=arr[i];
            }
        
    
            System.out.println("Sum is: "+sum);
        }
        catch(ArithmeticException ae)
        {
            ae.printStackTrace();
            System.out.println("enter some values why running");
        }
	}

}
