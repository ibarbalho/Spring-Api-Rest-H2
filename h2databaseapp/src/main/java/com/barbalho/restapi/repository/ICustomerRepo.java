package com.barbalho.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barbalho.restapi.entity.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long>{

}
