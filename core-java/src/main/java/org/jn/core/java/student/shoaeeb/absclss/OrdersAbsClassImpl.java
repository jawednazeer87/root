package org.jn.core.java.student.shoaeeb.absclss;

public class OrdersAbsClassImpl extends OrdersAbsClass {

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
		
	}

	@Override
	public void setUserId(int userId) {
		// TODO Auto-generated method stub
		this.userId=userId;
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
	public int getUserId() {
		// TODO Auto-generated method stub
		return this.userId;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return this.status;
	}

}
