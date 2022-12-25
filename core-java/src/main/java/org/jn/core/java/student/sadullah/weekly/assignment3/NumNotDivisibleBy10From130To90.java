package org.jn.core.java.student.sadullah.weekly.assignment3;

public class NumNotDivisibleBy10From130To90 {

	public static void main(String[] args) {
		
		for (int i = 130; i >= 90; i--) {
			if (i % 10 != 0) {
				System.out.print(i +" ");
			}
		}
	}
}
