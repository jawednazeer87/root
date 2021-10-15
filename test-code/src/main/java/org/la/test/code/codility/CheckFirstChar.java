package org.la.test.code.codility;

public class CheckFirstChar {

    public static void main(String[] args) {
        String s = "-A7*dd";
        System.out.println(solution(s));
    }

    public static String solution(String s){
        char c = s.charAt(0);
        if(c>='A' && c<='Z'){
            return "upper";
        }
        else if(c>='a' && c<='z'){
            return "lower";
        }
        else if(c>='0' && c<='9'){
            return "digit";
        }
        else {
            return "other";
        }
    }
}
