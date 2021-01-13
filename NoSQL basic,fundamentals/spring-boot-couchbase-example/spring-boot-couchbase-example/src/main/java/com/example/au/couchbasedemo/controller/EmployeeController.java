package com.example.au.couchbasedemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.au.couchbasedemo.model.Employee;
import com.example.au.couchbasedemo.repository.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepo employeeRepo;
    
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee newEmployee) {
        return employeeRepo.save(newEmployee);
    }
    
    @GetMapping("/employee/empId/{empId}")
    public Optional<Employee> getEmployee(@PathVariable String empId) {
        if (employeeRepo.existsById(empId)) 
        {
            return employeeRepo.findById(empId);
        } 
        else
            return Optional.empty();
    }
    
    @GetMapping("/employee/location/{location}/pincode/{pincode}")
    public Employee getEmployeeByLocAndPin(@PathVariable String location,@PathVariable String pincode ) {
        return employeeRepo.getEmployeeByLocationAndPincode(location,pincode);
    }
    
    @DeleteMapping("/employee/location/{location}/pincode/{pincode}")
    public List<Employee> deleteByLocAndPin(@PathVariable String location,@PathVariable String pincode) {
        return employeeRepo.deleteByLocationAndPincode(location,pincode);
    }
    
    @DeleteMapping("/employee/{empId}")
    public void deleteById(@PathVariable String empId) {
        employeeRepo.deleteById(empId);
    }
    
}
