package org.la.student.one.asif.service;

import java.util.List;
import java.util.Optional;

import org.la.student.one.asif.model.Address;
import org.la.student.one.asif.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	public Address findById(long id) {
		Optional<Address> optional = addressRepository.findById(id); 
		if(optional.isPresent())
			return optional.get();
		return null;
	}
	
	public List<Address> findAll(){
		return addressRepository.findAll();
	}
	
	public List<Address> findByCity(String city){
		return addressRepository.findByCity(city);
	}
	
	public Address create(Address address) {
		return addressRepository.save(address);
	}
	
	public Address update(Address address) {
		Optional<Address> optional = addressRepository.findById(address.getId());
		if(optional.isPresent()) {
			Address address2 = optional.get();
			address2.setUserId(address.getUserId());
			address2.setStreet(address.getStreet());
			address2.setCity(address.getCity());
			address2.setState(address.getState());
			address2.setCountry(address.getCountry());
			address2.setPostcode(address.getPostcode());
			address2 = addressRepository.saveAndFlush(address2);
			return address2;
		}
		return null;
	}
}
