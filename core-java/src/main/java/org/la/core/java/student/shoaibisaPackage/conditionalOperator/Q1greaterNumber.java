package org.la.core.java.student.shoaibisaPackage.conditionalOperator;
import java.util.Scanner;
public class Q1greaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        if(num1>num2) {
        	  System.out.println("Number "+num1+" is greater ");
        }else {
        	  System.out.println("Number "+num2+" is greater ");
        }
	}

}
