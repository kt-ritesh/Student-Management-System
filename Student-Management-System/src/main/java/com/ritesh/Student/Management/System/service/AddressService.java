package com.ritesh.Student.Management.System.service;

import com.ritesh.Student.Management.System.model.Address;
import com.ritesh.Student.Management.System.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String  addAddress(Address address) {

        addressRepo.save(address);
        return "New address added";
    }

    public String deleteAddressById(Long id) {

        addressRepo.deleteById(id);
        return "A address Deleted";
    }

    public Iterable<Address> getAllAddress() {

        return addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {

        return addressRepo.findById(id);
    }
}
