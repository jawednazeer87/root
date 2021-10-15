package org.la.test.code.algo;

public class PeakFinder {

    public static void main(String[] args) {
        PeakFinder pf = new PeakFinder();
        int[] a = {1, 2, 3, 1, 2};
        a = new int[]{5, 4, 3, 2, 1, 7, 6};
        int size = a.length;
        int num = pf.peakFinder(a, 0, size-1, size);
        System.out.println("index: "+num);
        System.out.println("peak: "+a[num]);
    }

    int peakFinder(int[] a, int left, int right, int size){

        int mid = left + (right - left)/2;

        if( (mid==0 || a[mid-1]<=a[mid]) && (mid==size-1 || a[mid+1]<=a[mid]) ){
            return mid;
        }
        else if(mid>0 && a[mid-1]>a[mid]){
            return peakFinder(a, left, mid-1, size);
        }
        else {
            return peakFinder(a, mid+1, right, size);
        }
    }
}
