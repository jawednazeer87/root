package org.la.core.java.student.waleed.homework.classwr.model;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Waleed Rizq
 *
 * @date Mar 12, 2022
 */
public class ITStuff {
	
	private String name;
    private String id;
    private String[] position;            
    private List<String> skills;            
    private Map<String, Double> salary;
	@Override
	public String toString() {
		
		return "ITStuff [name=" + name + ", id=" + id + ", position=" + Arrays.toString(position) + ", skills=" + skills
				+ ", salary=" + salary + "]"+"\r";
	
	} 
    
    

}
