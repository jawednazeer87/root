package org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.Pare18;

/*	Create a parent class having public String remove(String, char) method, create a child class which will override remove 
		method. remove method will remove char from the string and will return new string.
*/
public class Para18Sub extends Pare18 {
	protected String remove(String find,char del){
		char ch[] = find.toCharArray(); // converting String to characterarray 
		for(int i=0;i<find.length();i++)  {
			if(ch[i]==del)
				for(int j=i;j<find.length()-1;j++) {
					ch[j]=ch[j+1];

				}
					break;				
		}
		find=String.copyValueOf(ch);// copyValueOf() will do copy chararray into string 
		
		return find;	
		
		/*public static void main(String a[])
		 * String str = "GeeksForGeeks";
		 * 
		 * // Creating array of string length char[] ch = new char[str.length()];
		 * 
		 * // Copy character by character into array for (int i = 0; i < str.length();
		 * i++) { ch[i] = str.charAt(i); }
		 * 
		 * // Printing content of array for (char c : ch) { System.out.println(c); }
		 * String str = "GeeksForGeeks";
		 * 
		 * // Creating array of string length char[] ch = new char[str.length()];
		 * 
		 * // Copy character by character into array for (int i = 0; i < str.length();
		 * i++) { ch[i] = str.charAt(i); }
		 * 
		 * // Printing content of array for (char c : ch) { System.out.println(c); }
		 */
		
		  	
	}
	
	
	
	
}
