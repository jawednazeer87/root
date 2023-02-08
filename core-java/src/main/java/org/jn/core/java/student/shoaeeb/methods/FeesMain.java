package org.jn.core.java.student.shoaeeb.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FeesMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		Fees f = FactoryFees.getFees(name);
		System.out.println(f.showFees());
	}

}
