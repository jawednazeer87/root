package org.la.test.code.algo.rskw;

import org.la.test.code.algo.rskw.model.Salary;

import java.util.Arrays;
import java.util.Random;

public class ShellSalary{

    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b)<0;
    }
    public static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while(h<N/3) {
            h = 3 * h + 1;
        }
        while (h>=1){
            for(int i=h ; i<N ; i++){
                for(int j=i ; (j>=h && less(a[j], a[j-h])) ; j=j-h){
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }
    }

    public static void main(String[] args) {
        Salary[] salArray = getSalaryArray(100);
        sort(salArray);
        Arrays.stream(salArray).forEach(System.out::println);
    }
    private static Salary[] getSalaryArray(int size){
        Salary[] a = new Salary[size];
        for(int i=0 ; i<size ; i++){
            a[i] = new Salary(new Random().nextInt(10000));
        }
        return a;
    }
}
