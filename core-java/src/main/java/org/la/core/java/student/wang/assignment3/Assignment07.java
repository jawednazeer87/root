package org.la.core.java.student.wang.assignment3;

public class Assignment07 {
    //7.	wap to find greatest among three numbers
    public static void main(String[] args) {
        int a=54,b=24,c=8;
        if (a>b){
            if (a>c){
                System.out.println(a+" is greatest");
            }else {
                System.out.println(c+" is greatest");
            }
        }else{
            if (b>c){
                System.out.println(b+" is greatest");
            }else {
                System.out.println(c+" is greatest");
            }
        }
    }
}
