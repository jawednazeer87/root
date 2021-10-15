package org.la.test.code.hackr.rank;

public class HackerRankFindStringSequence {

    public static void main(String[] args) {
        String s = "hackerrank";
        String t = "haacckkerrannkk";
        t = "haacckkerannk";
        //t = "hccaakkerrannkk";
        //t = "hccaakkerrannkk";
        s = "hereiamstackerrank";
        String res = findSequence(s);
        System.out.println(res);
    }

    static String findSequence(String src){

        String res = "NO";
        String t = "hackerrank";
        char[] srcChars = t.toCharArray();

        for(int i=0 ; i<srcChars.length ; i++){
            int index = src.indexOf(srcChars[i]);
            if(index>=0){
                src = src.substring(index+1);
                res = "YES";
            }
            else{
                res = "NO";
                break;
            }
        }
        return res;
    }
}
