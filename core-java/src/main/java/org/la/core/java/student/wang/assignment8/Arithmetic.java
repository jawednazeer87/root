package org.la.core.java.student.wang.assignment8;

public class Arithmetic {
    /*
    34. create a class of name Arithmetic, add methods like add, sub, div, prod, fibonacci, prime, factorial. Plz make these methods return type and arguments according to your wish.
     */
    public static void add(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }

    public static void sub(int a, int b) {
        int c = a - b;
        System.out.println(a + " - " + b + " = " + c);
    }

    public static void division(int a, int b) {
        int c = a / b;
        System.out.println(a + " / " + b + " = " + c);
    }

    public static void product(int a, int b) {
        int c = a * b;
        System.out.println(a + " * " + b + " = " + c);
    }

    public static void fibonacci(int n){
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < n) {
            //print the number
            System.out.print(num1 + " ");
            //swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter ++;
        }
        System.out.println();
    }

    public static void isPrime(int n){
        int num = n;
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void factorial(int n){
        int num = n, f = 1;
        while (num >= 1) {
            f *= num;
            num--;
        }
        System.out.println("factorial of "+n+" is "+f);
    }

    public static void main(String[] args) {
        int a=4, b= 2, n =5;
        add(a,b);
        sub(a,b);
        division(a,b);
        product(a,b);
        fibonacci(n);
        isPrime(n);
        factorial(n);
    }
}
