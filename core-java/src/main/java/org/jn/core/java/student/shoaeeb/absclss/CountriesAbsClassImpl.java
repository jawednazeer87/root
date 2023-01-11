package org.jn.core.java.student.shoaeeb.absclss;

public class CountriesAbsClassImpl extends CountriesAbsClass{

	@Override
	public void setCode(int id) {
		// TODO Auto-generated method stub
		this.code=id;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void setContinentName(String continentName) {
		// TODO Auto-generated method stub
		this.continentName=continentName;
	}

	@Override
	public int getCode() {
		// TODO Auto-generated method stub
		return this.code;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getContinentName() {
		// TODO Auto-generated method stub
		return this.continentName;
	}

}
