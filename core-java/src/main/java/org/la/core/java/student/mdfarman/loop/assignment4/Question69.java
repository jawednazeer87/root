package org.la.core.java.student.mdfarman.loop.assignment4;

public class Question69 {
	
//	69.	Wap to check whether a number is Armstrong number or not.
	
	public static void main(String[] args) {
		
        int num = 371, oriNum, temp = 0;
        

        oriNum = num;

        while (oriNum != 0)
        {
            int rem = oriNum % 10;
            temp += Math.pow(rem, 3);
            oriNum /= 10;
        }

        if(temp == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");

	}
}