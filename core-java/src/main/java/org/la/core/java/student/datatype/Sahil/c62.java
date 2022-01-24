package org.la.core.java.student.datatype.Sahil;

public class c62 {
	  public static void main(String[] args) {

	        int num = 121, reversed = 0,temp=num;
	        // run loop until num becomes 0
	        while(num != 0) {

	            // get last digit from num
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;

	            // remove the last digit from num
	            num /= 10;
	        }
	        num=temp;
	        System.out.println("num = " + num);
	        System.out.println("Reversed Number: " + reversed);
	        if (num==reversed){
	            System.out.println(num +" is palindrome number");
	        }else {
	            System.out.println(num +" is not palindrome number");
	        }
	    }
}
