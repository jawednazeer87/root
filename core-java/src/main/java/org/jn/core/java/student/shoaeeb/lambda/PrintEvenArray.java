package org.jn.core.java.student.shoaeeb.lambda;

public class PrintEvenArray {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {1,2,3,4,5,6};
			System.out.println("all elements");
			EvenArray p = (n)-> {return true; };
			for(int ele: arr)
			{
				if(p.printArray(ele))
				{
					System.out.println(ele);
				}
			}
			
			p=(n)-> { return n%2==0;};
			System.out.println("Even elements: ");
			for(int ele: arr)
			{
				if(p.printArray(ele));
				{
					System.out.println(ele);
				}
			}
			
	}

}
