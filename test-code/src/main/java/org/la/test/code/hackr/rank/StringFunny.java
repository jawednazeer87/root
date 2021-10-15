package org.la.test.code.hackr.rank;

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/funny-string/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class StringFunny {

    public static void main(String[] args) {
        String s = "Aa";
        s = "acxz";
        //s = "bcxz";
        System.out.println(funnyString(s));
    }

    public static String funnyString(String s) {

        Integer[] a1 = getASCIIDiffArray(s);
        Integer[] a2 = getASCIIDiffArray(new StringBuilder(s).reverse().toString());
        return compareArray(a1, a2) ? "Funny" : "Not Funny";
    }

    static boolean compareArray(Integer a1[], Integer[] a2){

        for(int i=0 ; i<a1.length ; i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }

    static Integer[] getASCIIDiffArray(String s){

        char[] a = s.toCharArray();
        List<Integer> iList = new ArrayList<>();
        int i=0 ;
        for(; i<s.length()-1 ; i++){
            iList.add(Math.abs(a[i+1]-a[i]));
        }
        if(a.length>2){
            iList.add(Math.abs(a[i]-a[i-1]));
        }
        System.out.println(iList);
        return iList.stream().toArray(Integer[]::new);
    }

}
