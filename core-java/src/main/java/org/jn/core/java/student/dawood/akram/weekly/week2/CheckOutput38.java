package org.jn.core.java.student.dawood.akram.weekly.week2;

public class CheckOutput38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 20;
        double kelvin = c + 273.15;//293.15
        System.out.println(kelvin);
        int Rankine = (int) (c + 273.15 * 9 / 5);//511
        System.out.println(Rankine);
        Rankine = (int) (c + 9 / 5 * 273.15);//293
        System.out.println(Rankine);
        double delisle = (100 - c) * 3 / 2;//(80)*3/2 = 240/2 =120.0
        System.out.println(delisle);
	}

}
