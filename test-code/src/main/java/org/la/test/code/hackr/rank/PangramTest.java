package org.la.test.code.hackr.rank;

public class PangramTest {

    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";
        s = "We promptly judged antique ivory buckles for the prize";
        String res = pangrams(s);
        System.out.println(res);
    }

    public static String pangrams(String s) {
        s = s.toUpperCase();
        String res = "pangram";

        String l = "abcdefghijklmnopqrstuvwxyz";
        for(char i='A' ; i<'Z' ; i++){
            int ind = s.indexOf(i);
            if(ind==-1){
                return "not pangram";
            }
        }
        return res;
    }
}
