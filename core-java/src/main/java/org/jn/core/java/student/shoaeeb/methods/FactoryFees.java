package org.jn.core.java.student.shoaeeb.methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactoryFees {
	static Fees getFees(String name) {
		if(name.equals("Cse"))
		{
			return new Cse();
		}
		else if(name.equals("Ece"))
		{
			return new Ece();
		}
		else {
			return null;
		}
}

}
