package com.example.cricketmanagement.Hibernate2.Evening.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coach {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="CoachName")
	private String name;
	
	@Column
	private String team;
	
	@Column 
	private int fromYear;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	} 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public int getFromYear() {
		return fromYear;
	}
	
	public void setFromYear(int fromYear) {
		this.fromYear = fromYear;
	}
	
	public Coach() {
		super();
	}
		
}
