package org.jn.core.java.student.mirza.baig.clss.object;

public class Countries {

	private int code;
	private String name;
	private String countinentName;
	
	
	public void setCode (int code) {
		this.code=code;
	}
	public int getCode() {
		return code;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setContinentName(String countinentName) {
		
		this.countinentName=countinentName;
	}
	public String getCountinentName() {
		return countinentName;
		
	}
	
}




//Create a class Countries having member variables code, name, continentName. create getters and 
//setters for all member variables. Create object of Countries class in other class inside main 
//method and set all member values and print all member values using getters.