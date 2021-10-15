package org.la.test.code.algo;

public class PeakElement {

    public static void main(String[] args) {
        PeakElement pe = new PeakElement();
        int[] a = {1, 2, 3, 1, 2};
        System.out.println(a[pe.findPeak(a)]);
    }

    int findPeak(int a[]){
        int left = 0 ;
        int right = a.length -1 ;
        while(left<right){
            int mid = left + (right - left)/2;
            if(a[mid]<a[mid+1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}
