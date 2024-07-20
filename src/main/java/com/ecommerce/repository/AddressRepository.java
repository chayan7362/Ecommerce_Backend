package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.module.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
