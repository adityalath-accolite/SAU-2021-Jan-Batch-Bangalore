package com.example.au.couchbasedemo.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.au.couchbasedemo.model.Cricket;

public interface CricRepo extends CrudRepository<Cricket, String> {
	
}
