package org.la.test.code.palind;

public class LongestPalindromeString {

	public static void main(String[] args) {
		
		//System.out.println(reverse("noolon"));
		String rest = longestPalindromeString("a");
		System.out.println("longest palindrome: "+rest);
	}
	
	public static String longestPalindromeString(String src) {
		
		
		int l = src.length();
		
		for(int i=0, e=l ; i<=e ;i++, e--) {
			
			String t = src.substring(0, e);
			if(reverse(t)) {
				return t;
			}
			
			t = src.substring(i, l);
			if(reverse(t)) {
				return t;
			}
			
			t = src.substring(i, e);
			if(reverse(t)) {
				return t;
			}
			
		}
		return null;
	}
	
	public static boolean reverse(String src) {
		return src.equalsIgnoreCase(new StringBuilder(src).reverse().toString());
	}
	
}
