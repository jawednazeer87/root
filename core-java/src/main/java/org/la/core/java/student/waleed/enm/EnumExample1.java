package org.la.core.java.student.waleed.enm;

import java.util.Arrays;

/**
 * @author Waleed Rizq
 *
 * @date Mar 19, 2022
 */
public class EnumExample1 {
	
	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		Arrays.stream(Day.values()).forEachOrdered(System.out::println);
		System.out.println("---------------------------------------");
		Arrays.stream(Day.values()).forEach(day-> System.out.println(day.ordinal()+" : "+day));
		
				System.out.println(Day.TUESDAY.ordinal());
				System.out.println("---------------------------------------");
				Day d = Day.FRIDAY;
				tellItLikeItIs(d);
			}
			
			static void tellItLikeItIs(Day day) {
				switch (day) {
					case SUNDAY:
						System.out.println("SUNDAY");
						break;
					case MONDAY:
						System.out.println("Monday");
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
						System.out.println("Friday");
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


