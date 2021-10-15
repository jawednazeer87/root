package org.la.test.code.codility;

import java.util.Arrays;

public class SmallestPositiveNumberAbsent {

    public static void main(String[] args) {
        int s[] = {3, 1, 2, 9, -1};
        s = new int[]{-1, -3};
        s = new int[]{2};
        int[] a = sortAsc(s);
        Arrays.stream(a).forEach(e -> System.out.println(e));
        int r = solution(s);
        System.out.println("res: "+r);
    }

    public static int solution(int[] s) {
        int l = s.length;
        if(l==1){
            if(s[0]>1 || s[0]<=0){
                return 1;
            }
            else if(s[0]==1){
                return 2;
            }
        }
        int[] a = sortAsc(s);
        if(a[0]>1){
            return 1;
        }

        int i = 0;
        for(i=0 ; i<l-1 ; i++){
            if(a[i]>0) {
                if (a[i + 1] - a[i] > 1) {
                    return a[i] + 1;
                }
            }
        }
        if(a[i]+1<=0){
            return 1;
        }
        return a[i]+1;
    }


    static int[] sortAsc(int[] a){
        int l = a.length;
        for(int i=0 ; i<l ; i++){
            for(int k=i ; k<l ; k++){
                if(a[i]>a[k]){
                    int t = a[i];
                    a[i] = a[k];
                    a[k] = t;
                }
            }
        }
        return a;
    }

}
