package com.example.au.couchbasedemo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.Cricket;
import com.example.au.couchbasedemo.repository.CricRepo;


@RestController
public class CricketController {
    
    @Autowired
    CricRepo cricRepo;
    
    @PostMapping("/cricket")
    public Cricket addPlayer(@RequestBody Cricket newPlayer) {
        return cricRepo.save(newPlayer);
    }
    
    @GetMapping("/cricket/runs/{runs}")
    public List<Cricket> greaterThanNRuns(@PathVariable int runs)
    {
    	List<Cricket> list = new ArrayList<>();
    	for(Cricket c: cricRepo.findAll())
    	{
    		if(c.getRuns() > runs)
    		{
    			list.add(c);
    		}
    	}
    	return list;
    }
       
}