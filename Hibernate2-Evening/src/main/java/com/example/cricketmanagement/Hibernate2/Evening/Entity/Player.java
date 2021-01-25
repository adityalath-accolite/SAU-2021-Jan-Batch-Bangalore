package com.example.cricketmanagement.Hibernate2.Evening.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="player")
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="playerId")
	private int id;
	
	@Column(name="playerName")
	private String name;
	
	@Column
	private int runs;
	
	@Column
	private int wickets;
	
	@Column
	private String team;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	Coach coach;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	Sponsor sponser;

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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public Sponsor getSponser() {
		return sponser;
	}

	public void setSponser(Sponsor sponser) {
		this.sponser = sponser;
	} 
	
	
}
