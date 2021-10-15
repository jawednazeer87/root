package org.ecom.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.Address;
import org.ecom.repository.AddressRepository;
import org.ecom.util.GetSqlConnection;

public class AddressService {

	private Connection con = null;
	
	public AddressService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Address> getAllAddress(){
		
		List<Address> addressList = new ArrayList<>();
		
		if(con!=null) {
			addressList = AddressRepository.getAllAddress(con);
		}
		
		return addressList;
	}
	
	public List<Address> findAddressByUserId(long userId){
		
		List<Address> addressList = new ArrayList<>();
		
		if(con!=null) {
			addressList = AddressRepository.findAddressByUserId(con, userId);
		}
		
		return addressList;
	}
	
	public List<Address> findAddressByEmployeeId(long employeeId){
		
		List<Address> addressList = new ArrayList<>();
		
		if(con!=null) {
			addressList = AddressRepository.findAddressByEmployeeId(con, employeeId);
		}
		
		return addressList;
	}


	
}
