package org.la.core.java.student.waleed.enm;




/**
 * @author Waleed Rizq
 *
 * @date Mar 19, 2022
 */
public class EnumValues {
	enum Hobby {
	   FOOTBALL,
	   TENNIS,
	   PLAYCHESS,
	   SWIMMING,
	   READING,
	  RUNNING,
	   JOGGING,
	   CLIMBING,
	   COOKING,
	   HIKING

	}
	  

	public static void main(String[] args) {
		
		
		Hobby[] t = Hobby.values();
		
		
	for(Hobby fun:t) {
			System.out.println("Hobby : "+fun);
		}

	}

	
	
	}

	
