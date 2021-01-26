package com.example.cricketmanagement.Hibernate2.Evening.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.cricketmanagement.Hibernate2.Evening.Entity.Player;

@Repository
@Transactional
public class PlayerRepo {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public void addPlayer(Player p)
	{
		entityManager.persist(p);
	}
	
	public Player getPlayer(int id)
	{
		return entityManager.find(Player.class,id);
	}
	
	public void deletePlayerById(int id)
	{
		Player m = entityManager.find(Player.class,id);
		m.setCoach(null);
		entityManager.merge(m);
		entityManager.remove(m);
	}
	
	public List<Player> getPlayerByTeam(String team)
	{
		Query query = entityManager.createQuery("select m from player m where m.team= :team");
		//Query query = entityManager.createQuery("select m from player m where team=" + team);
		//entityManager.createNativeQuery("select * from player m where team=" + team);
		query.setParameter("team", team);
		return query.getResultList();      //query.getSingleResult();
	}
	
}
