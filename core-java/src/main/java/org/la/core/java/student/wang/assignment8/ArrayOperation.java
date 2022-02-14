package org.la.core.java.student.wang.assignment8;

import java.util.Arrays;

public class ArrayOperation {
    /*
    35. create a class ArrayOperation and add methods like int[] copy(int[] a), int[] reverse(int[] b),
	int[] addTwoArrays(int[] a, int[] b), void print(int[] p), int sumArray(int a[]),
	int findMax(int[] a), int findMin(int[] a), int countNegative(int a[]), int countPositive(int a[]),
     */
    public static void copy(int[] a){
        int[] b = a;
        System.out.println(Arrays.toString(b));
    }

    public static void reverse(int[] b){
        int[] a = new int[b.length];
        int i = b.length-1;
        for (int element : b) {
            a[i--]= element;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void addTwoArrays(int[] a, int[] b){
        int[] c = new int[b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i]+ b[i];
        }
        System.out.println(Arrays.toString(c));
    }

    public static void print(int[] p){
        System.out.println(Arrays.toString(p));
    }

    public static void sumArray(int[] a){
        int sum = 0;
        for (int element : a) {
            sum+=element;
        }
        System.out.println("sum of Array = " + sum);
    }

    public static void findMax(int[] a){
        int max = a[0];
        for (int element : a) {
            if (element>max){
                max = element;
            }
        }
        System.out.println( "max of Array = " + max);
    }

    public static void findMin(int[] a){
        int min = a[0];
        for (int element : a) {
            if (element<min){
                min = element;
            }
        }
        System.out.println( "min of Array = " + min);
    }

    public static void countNegative(int[] a){
        int sumOfNeg = 0;
        for (int element : a) {
            if (element<0){
                sumOfNeg+=element;
            }
        }
        System.out.println("sumOfNeg = " + sumOfNeg);
    }

    public static void countPositive(int[] a){
        int sumOfPos = 0;
        for (int element : a) {
            if (element>0){
                sumOfPos+=element;
            }
        }
        System.out.println("sumOfPos = " + sumOfPos);
    }


    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int[] b ={1,-2,4,6,-3,2};

        copy(a);
        reverse(a);
        addTwoArrays(a,b);
        print(a);
        sumArray(a);
        findMax(b);
        findMin(b);
        countNegative(b);
        countPositive(b);
    }
}
