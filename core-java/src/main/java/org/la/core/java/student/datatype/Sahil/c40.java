package org.la.core.java.student.datatype.Sahil;

public class c40 {
	public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < 10) {
            
            System.out.print(num1 + " "); 
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter += 1;
        }
    }

}
