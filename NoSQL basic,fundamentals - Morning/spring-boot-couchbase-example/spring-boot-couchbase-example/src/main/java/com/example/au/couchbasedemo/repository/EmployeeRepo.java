package com.example.au.couchbasedemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.au.couchbasedemo.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, String> {
	List<Employee> deleteByLocationAndPincode(String address, String pincode);
	Employee getEmployeeByLocationAndPincode(String address, String pincode);
}
