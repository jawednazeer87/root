package org.jn.core.java.student.shoaeeb.absclss;

public class ProductsAbsClassImpl extends ProductsAbsClass {

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void setMerchantId(int merchantId) {
		// TODO Auto-generated method stub
		this.merchantId=merchantId;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void setPrice(float price) {
		// TODO Auto-generated method stub
		this.price=price;
	}

	@Override
	public void setStatus(String status) {
		// TODO Auto-generated method stub
		this.status=status;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public int getMerchantId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return this.status;
	}

}
