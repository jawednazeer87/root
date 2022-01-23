package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment123 {
    /*
  123
	void fibonocci(int)
		print fibonacci series 
     */
    public static void fibonocci(int N) {

            int num1 = 0, num2 = 1;

            int counter = 0;

            // Iterate till counter is N
            while (counter < N) {

                // Print the number
                System.out.print(num1 + " ");

                // Swap
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;
            }
        }
    public static void main(String args[])
    {
        // Given Number N
        int N = 10;

        // Function Call
        fibonocci(N);
    }

}