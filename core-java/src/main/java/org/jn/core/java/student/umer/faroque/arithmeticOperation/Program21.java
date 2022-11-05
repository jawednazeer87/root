/**
 * 
 */
package org.jn.core.java.student.umer.faroque.arithmeticOperation;

/**
 * @author umerf
 *
 */
public class Program21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 34;
        double d = 20.5;	// a=34   d=20.5
        d+=a;				// a=34   d=54.5
        a+=d;				// a=88   d=54.5
        d-=a;				// a=88   d=-33.5
        a-=d;				// a=121   d=-33.5
        System.out.println(" d = " + ++d );	//-32.5
        System.out.println(" a = " + a-- );	//121

	}

}
