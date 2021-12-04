package org.la.core.java.student.datatype.Sahil;

public class b10 {
public static void main(String[] args) {
	/*a. Below 25 - F
	b. 25 to 45 - E
	c. 45 to 50 - D
	d. 50 to 60 - C
	e. 60 to 80 - B
	f. Above 80 - A */
	
	int M =56;
	
	if (M>=80 && M<=100 )
		System.out.println("A");
	else if (M>=60 && M<=79 )
		System.out.println("B");
	else if (M>=50 && M<=59)
		System.out.println("c");
	else if (M>=45  &&  M<=49)
		System.out.println("D");
	else if (M>=25 && M<=44)
		System.out.println("E");
	else if (M<=25)
		System.out.println("F");
}
}
