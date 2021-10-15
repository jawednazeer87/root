package org.la.test.code.codility;

import java.util.ArrayList;
import java.util.List;

public class ShuffleAlternativelyNumbers {

    public static void main(String[] args) {

        int i = 123456;
        i = 130;
        i = 1234567;
        i = 12345607;
        i = 12;
        i = 1;
        i = 100301002;
        int res = solution(i);
        System.out.println("alternative: "+res);
    }

    public static  int solution(int A){

        int n = A;
        List<Integer> list = new ArrayList<>();
        String s = String.valueOf(A);
        System.out.println(s);
        int[] arr = new int[s.length()];
        char[] ca = s.toCharArray();
        int beg = 0;
        int end = ca.length-1;
        StringBuilder sb = new StringBuilder();

        for(; beg<end ; beg++, end--){
            sb.append(ca[beg]+""+ca[end]);
        }
        if(ca.length%2==1){
            sb.append(ca[beg]);
        }
        return Integer.valueOf(sb.toString());
    }
}
