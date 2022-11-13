package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintExcept2And5And8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=10;i++) {
        	if(i==2||i==5||i==8) {
        		continue;
        	}else {
        		System.out.println(i);
        	}
        }
	}

}
