package com.ritesh.Student.Management.System.repository;

import com.ritesh.Student.Management.System.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Long> {
}
