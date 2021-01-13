package com.example.au.couchbasedemo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class Cricket {
    
    @Id
    String id;
    String name;
    int runs;
    int wickets;
    double avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return avg;
	}
	
	public void setAverage(double avg) {
		this.avg = avg;
	}
	
	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getId() {
		return id;
	}

	
	public Cricket(String id, String name, int runs ,int wickets,double avg) {
		super();
		this.id = id;
		this.name = name;
		this.runs = runs;
		this.avg = avg;
		this.wickets = wickets; 
	}
}
