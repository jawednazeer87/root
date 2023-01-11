package org.jn.core.java.student.shoaeeb.absclss;

public class CompanyAbsClassImpl extends CompanyAbsClass{
	@Override
	public void setCompanyId(int companyId)
	{
		this.companyId=companyId;
	}
	@Override
	public void setName(String name)
	{
		this.name=name;
	}
	@Override
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	//getters
	@Override
	public int getCompanyId()
	{
		return this.companyId;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getDescription() {
		return this.description;
	}
}
