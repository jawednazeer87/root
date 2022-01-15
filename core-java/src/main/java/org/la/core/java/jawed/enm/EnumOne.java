package org.la.core.java.jawed.enm;

/**
 * @author jawednazeer
 *
 */

public class EnumOne {

	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	public static void main(String[] args) {
		tellItLikeItIs(Day.SUNDAY);
	}
	static void tellItLikeItIs(Day day) {
		switch (day) {
			case SUNDAY:
				System.out.println("SUNDAY");
				break;
			case MONDAY:
				System.out.println("Mondays");
				break;
			case TUESDAY:
				System.out.println("TUESDAY");
				break;
			case WEDNESDAY:
				System.out.println("WEDNESDAY");
				break;
			case THURSDAY:
				System.out.println("THURSDAY");
				break;
			case FRIDAY:
				System.out.println("Fridays");
				break;
			case SATURDAY:
				System.out.println("SATURDAY");
				break;
			default:
				System.out.println("Default");
				break;
		}
	}

}
