package org.jn.core.java.student.shoaeeb.enumerations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlanetsMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Planets allPlanets[] = Planets.values();
		for(Planets p: allPlanets)
		{
			int no = p.ordinal();
			System.out.println(no+" "+p+" "+p.getDistance());
		}
		System.out.println("Enter planet");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String choice = br.readLine();
	    Planets.getName(choice);
	    
	     
	}
}
