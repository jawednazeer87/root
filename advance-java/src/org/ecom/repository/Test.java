package org.ecom.repository;

public class Test {

	public static void main(String[] args) {
		
		
		
		/*
		Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
		nameStream.peek(System.out::println).forEach(System.out::println);
		*/
		
		/*
		 * Stream s = Stream.of("A", "B", "C", "D");
		 * System.out.println(s.peek(System.out::println).findAny().orElse("NA"));
		 */
		
	}
	
	
	static String stringChallenge(String strArr[]) {
		
		String result = "";
		String targetString = strArr[0];
		int l = targetString.length();
		int steps = Integer.parseInt(strArr[1]);
		
		if(steps>=l)
			return targetString;
		
		steps = steps * 2 - 2;
		
		char cArr[] = new char[l];
		char tArr[] = targetString.toCharArray();
		
		int j = 0;
		cArr[0] = tArr[0];
		
		for(int i=1 ; i<l ; i++) {
			cArr[i] = tArr[j+steps]; 
		}
		
		return result;
	}
}
