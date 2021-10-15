package org.la.test.code.algo.rskw;

import java.util.Arrays;
import java.util.Random;

public abstract class Sort {

    public abstract void sort(Comparable[] a);

    public void show(Comparable[] a){
        Arrays.stream(a).forEach(b -> System.out.print(b+" "));
        System.out.println();
    }
    public void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public boolean less(Comparable a, Comparable b){
        return a.compareTo(b)<0;
    }
    public Integer[] createArray(int size){
        Integer[] arr = new Integer[size];
        for(int i=0 ; i<size ; i++){
            arr[i] = new Random().nextInt(100);
        }
        return arr;
    }
    public boolean isSorted(Comparable a[]){
        for(int i=1 ; i<a.length ; i++)
            if(less(a[i], a[i-1]))
                return false;
        return true;
    }
}
