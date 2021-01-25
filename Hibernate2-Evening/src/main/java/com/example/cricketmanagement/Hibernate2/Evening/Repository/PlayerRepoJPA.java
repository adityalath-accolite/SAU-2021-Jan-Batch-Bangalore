package com.example.cricketmanagement.Hibernate2.Evening.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.cricketmanagement.Hibernate2.Evening.Entity.Player;

public interface PlayerRepoJPA extends CrudRepository<Player,Integer>{

	public Player getPlayerById(int id);
	
	public void deletePlayerById(int id);
	
}
