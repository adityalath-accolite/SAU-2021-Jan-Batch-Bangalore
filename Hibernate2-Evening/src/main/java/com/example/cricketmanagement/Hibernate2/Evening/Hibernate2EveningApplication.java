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
		coach.setName("Ravi Shastri");
		coach.setTeam("IND");
		coach.setFromYear(2018);
		
		Sponsor sponsor = new Sponsor();
		sponsor.setName("Adidas");
		sponsor.setOwner("Adolf Dassler");
		
		Player player = new Player();
		player.setName("Rohit Sharma");
		player.setRuns(13596);
		player.setWickets(15);
		player.setTeam("IND");
		player.setCoach(coach);
		player.setSponser(sponsor);
		
		playerRepo.addPlayer(player);           //or playerRepoJPA.save(player)
		
		// 2.Getting player based on id
		Player p = playerRepo.getPlayer(1);
		System.out.println("Player at id " + p.getId() + " is " + p.getName() + " with " + p.getRuns() + " runs and "+ p.getWickets() + " from " + p.getTeam());

		//3.Adding another player with same coach
		player = playerRepoJPA.getPlayerById(1);
		coach = (Coach)player.getCoach();
		sponsor.setName("Alibaba");
		sponsor.setOwner("Jack Ma");
		Player player1 = new Player();
		player1.setName("Virat Kohli");
		player1.setRuns(15596);
		player1.setWickets(6);
		player1.setTeam("IND");
		player1.setCoach(coach);
		player1.setSponser(sponsor);
		
		playerRepo.addPlayer(player1);           //or playerRepoJPA.save(player)
		
		//4.Deleting a player
		playerRepo.deletePlayerByObject(p);
		
		//5.Deleting a player using JPA
		playerRepoJPA.deletePlayerById(2);
		
		
		//6.getting players of team india
		List<Player> list = playerRepo.getPlayerByTeam("IND");
		for(Player p1:list)
		{
			System.out.println("Player at id " + p1.getId() + " is " + p1.getName() + " with " + p1.getRuns() + " runs and " + p1.getWickets() + " from " + p1.getTeam());
		}
		
	}

}
