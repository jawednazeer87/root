package org.la.test.code.algo.rskw;

import org.la.test.code.two.d.array.Age;

import java.util.Arrays;
import java.util.Random;

public class InsertionPrice {
    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b)<0;
    }
    private static void exch(Comparable[] a, int i, int k){
        Comparable t = a[i];
        a[i] = a[k];
        a[k] = t;
    }
    private static void sort(Comparable[] a){
        int len = a.length;
        for(int i=1 ; i<len ; i++){
            for(int j=i ; j>0&&less(a[j], a[j-1]) ; j--)
                exch(a, j, j-1);
        }
    }
    public static void main(String[] args) {
        Price[] priceArr = getAgeArray(7);
        Integer i[] = {1, 2, 3, 4};
        sort(i);
        sort(priceArr);
        Arrays.stream(priceArr).forEach(System.out::println);
    }
    private static Price[] getAgeArray(int size){
        Price[] a = new Price[size];
        for(int i=0 ; i<size ; i++){
            a[i] = new Price(new Random().nextInt(100));
        }
        return a;
    }
}
