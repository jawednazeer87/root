package org.la.core.java.student.sajid.looping.assignment4;

public class Wap43 {

	public static void main(String[] args) {
		int giveNum = 15;
		boolean isPrime = false;
		
		if(giveNum==0||giveNum==1){
			System.out.println(giveNum+" is not a prime number.");
		}else {
			for(int i=2;i<=giveNum/2;++i) {
				System.out.println("curren iteration: "+i);
			
			int rem = giveNum%i;
			System.out.println("reminder: "+rem);
			
			if (rem==0) {
				isPrime = true;
				break;
			}
			System.out.println("curren flag: "+isPrime);

		}
			if (!isPrime){
				System.out.println("Given number "+giveNum+" is a prime number");	
			}else {
				System.out.println("Given number "+giveNum+" is not a prime number");
			}
		}
	}
}