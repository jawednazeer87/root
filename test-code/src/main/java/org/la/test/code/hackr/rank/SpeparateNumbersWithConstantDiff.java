package org.la.test.code.hackr.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    https://www.hackerrank.com/challenges/separate-the-numbers/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

 */
public class SpeparateNumbersWithConstantDiff {

    public static void main(String[] args) {

        String s = "12345678";
        s = "10203045678";
        s = "1234";
        s = "91011";
        s = "99100";
        s = "101103";
        s = "010203";
        s = "13";
        s = "1";
        s = "01";
        s = "012";
        s = "91011121314151617181920";
        separateNumbers(s);

    }

    public static void separateNumbers(String s) {
        String t = "NO";
        Long arr[] = null;

        for(int digit=1 ; digit<=s.length()/2; digit++) {
            arr = splitInDigit(digit, s);
            if(arr!=null){
                t = checkDifference(arr, digit);
                if(t.equalsIgnoreCase("YES")){
                    break;
                }
            }
        }
        if(t.equalsIgnoreCase("YES")){
            System.out.println("YES "+arr[0]);
        }
        else{
            System.out.println("NO");
        }
    }

    static void print(Long a[]){
        Arrays.stream(a).forEach(x->System.out.print(x+","));
    }

    static String checkDifference(Long a[], int digit){

        String result = "YES";
        int i=0 ;
        for(; i<a.length-1 ; i++){
            if(a[i+1]-a[i]!=1){
                return "NO";
            }
        }
        if(a[i]-a[i-1]!=1){
            return "NO";
        }
        return result;
    }

    static Long[] splitInDigit(int digit, String s){

        List<Long> list = new ArrayList<>();
        long[] arr = null;
        int l = s.length();
        int i=0 ;
        StringBuilder sb = new StringBuilder();

        for(; i<=l ; ){
            if((i+digit)>l){
                break;
            }
            String num = s.substring(i, i+digit);
            if(num.charAt(0)=='0' && num.length()>1){
                break;
            }

            sb.append(num);
            i += digit;
            if(num.charAt(num.length()-1)=='9'){
                char[] temp = num.toCharArray();
                boolean highestValueOfDigit = true;
                for(int k=0 ; k<temp.length ; k++){
                    if(temp[k]!='9'){
                        highestValueOfDigit = false;
                        break;
                    }
                }
                if(highestValueOfDigit) {
                    digit++;
                }
            }
            list.add(Long.valueOf(num));
        }
        if(sb.toString().equals(s)){
            return list.stream().toArray(Long[]::new);
        }
        return null;
    }
}
