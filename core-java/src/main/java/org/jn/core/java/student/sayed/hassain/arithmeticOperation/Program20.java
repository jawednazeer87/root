package org.jn.core.java.student.sayed.hassain.arithmeticOperation;

public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10 * 5 + 100 * (25 * 11) / (25 * 10) * 10 - 5 + 7 % 2);
		// 10 * 5 + 100 * 275 / 250 * 10 - 5 + 7 % 2
		// 50 + 27500/ 250*10 - 5 + 1
		// 50 + 110*10 - 5 + 1
		// 50 + 1100 - 5 + 1
		// 1146

		int zx = (10 * 5 + 100 * (25 * 11));
		// 50+100*275
		// 50+27500
		// 27550

		int yz = ((25 * 10) * 10 - 5 + 7 % 2);
		// 250 *10-5+1
		// 2500 -5 +1
		// 2496
		System.out.println(zx / yz); // 27550/2496 = 11 int
	}

}
