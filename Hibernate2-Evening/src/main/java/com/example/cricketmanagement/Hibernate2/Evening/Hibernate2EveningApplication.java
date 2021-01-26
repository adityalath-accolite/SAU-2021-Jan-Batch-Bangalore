package com.example.cricketmanagement.Hibernate2.Evening;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cricketmanagement.Hibernate2.Evening.Entity.Coach;
import com.example.cricketmanagement.Hibernate2.Evening.Entity.Player;
import com.example.cricketmanagement.Hibernate2.Evening.Entity.Sponsor;
import com.example.cricketmanagement.Hibernate2.Evening.Repository.PlayerRepo;
import com.example.cricketmanagement.Hibernate2.Evening.Repository.PlayerRepoJPA;


@SpringBootApplication
public class Hibernate2EveningApplication implements CommandLineRunner{

	@Autowired
	PlayerRepo playerRepo;
	
	@Autowired
	PlayerRepoJPA playerRepoJPA;
	
	public static void main(String[] args) {
		SpringApplication.run(Hibernate2EveningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//1.Adding a player
		Coach coach = new Coach();
		coach.setName("Rahul Dravid");
		coach.setTeam("IND");
		coach.setFromYear(2019);
		
		Sponsor sponsor = new Sponsor();
		sponsor.setName("Alibaba");
		sponsor.setOwner("Jack Ma");
		
		Player player = new Player();
		player.setName("Rishab Pant");
		player.setRuns(3596);
		player.setWickets(0);
		player.setTeam("IND");
		player.setCoach(coach);
		player.setSponser(sponsor);
		
		playerRepo.addPlayer(player);           //or playerRepoJPA.save(player)
		
		// 2.Getting player based on id
		Player p = playerRepo.getPlayer(1);
		System.out.println("Player at id " + p.getId() + " is " + p.getName() + " with " + p.getRuns() + " runs and "+ p.getWickets() + " wickets from " + p.getTeam());


		//3.getting players of team india
		List<Player> list = playerRepo.getPlayerByTeam("IND");
		for(Player p1:list)
		{
			System.out.println("Player at id " + p1.getId() + " is " + p1.getName() + " with " + p1.getRuns() + " runs and " + p1.getWickets() + " from " + p1.getTeam());
		}
		
		//4.Deleting a player
		playerRepo.deletePlayerById(p.getId());	
		System.out.println("Player data deleted successfully");
	}

}
