package org.jn.core.java.student.shoaeeb.absclss;

public class ProductAbsClassImpl extends ProductAbsClass{

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void setProductName(String productName) {
		// TODO Auto-generated method stub
		this.productName=productName;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		this.description=description;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return this.productName;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

}
