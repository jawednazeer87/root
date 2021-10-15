package org.la.test.code.algo.rskw;

import org.la.test.code.two.d.array.Age;

import java.util.Arrays;
import java.util.Random;

public class SelectionAge {

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }
    private static void exch(Comparable[] a, int i, int k){
        Comparable t = a[i];
        a[i] = a[k];
        a[k] = t;
    }
    private static void sort(Comparable[] a){
        int len = a.length;
        for(int i=0 ; i<len ; i++){
            int min = i;
            for(int j=i+1 ; j<len ; j++){
                if(less(a[j], a[min]))
                    min = j;
            }
            exch(a, i, min);
        }
    }
    public static void main(String[] args) {
        Age[] ageArr = getAgeArray(5);
        sort(ageArr);
        Arrays.stream(ageArr).forEach(System.out::println);
    }
    private static Age[] getAgeArray(int size){
        Age[] a = new Age[size];
        for(int i=0 ; i<size ; i++){
            a[i] = new Age(new Random().nextInt(100));
        }
        return a;
    }
}
