package org.la.test.code.algo;

public class FindPeakElement {

    public static void main(String[] args) {
        FindPeakElement fpe = new FindPeakElement();
        int[] a = {1, 2, 3, 4, 5};
        a = new int[]{5, 4, 3, 2, 1, 7, 6};
        int ind = fpe.findPeakElement(a);
        System.out.println(ind+" : "+a[ind]);
    }

    int findPeakElement(int[] a){
        int left = 0;
        int right = a.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(a[mid]<a[mid+1]){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

}
