package org.la.core.java.student.jdbc.service;

import org.la.core.java.student.jdbc.model.Address;
import org.la.core.java.student.jdbc.respository.AddressRepository;

import java.util.List;

public class AddressService {

    public List<Address> findByUserId(int userId)  throws Exception {
        return AddressRepository.findByUserId(userId);
    }

    public Address findById(int id)  throws Exception {
        return AddressRepository.findById(id);
    }
}
