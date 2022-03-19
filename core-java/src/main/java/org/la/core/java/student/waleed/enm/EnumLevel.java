package org.la.core.java.student.waleed.enm;

/**
 * @author Waleed Rizq
 *
 * @date Mar 19, 2022
 */
public class EnumLevel {

	enum Level {
	    LOW,
	    MEDIUM,
	    HIGH
	  }
	public static void main(String[] args) {
		Level var = Level.MEDIUM;
	System.out.println(" var: "+ var);
	var = Level.HIGH;
	switch(var) {
    case LOW:
      System.out.println("Low level");
      break;
    case MEDIUM:
       System.out.println("Medium level");
      break;
    case HIGH:
      System.out.println("High level");
      break;
  }
}
		
	}


