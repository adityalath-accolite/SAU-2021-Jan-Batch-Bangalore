CREATE SCHEMA `Cricket World Cup 2020`;
/*Creating Tables required*/

/*Assumption: all 11 players of each team has played all the matches of the team*/

create table players (
	playerId INT AUTO_INCREMENT, 
    playerName varchar(200) NOT NULL, 
    runs numeric(5), 
    wickets numeric(4)NOT NULL, 
    team varchar(50) NOT NULL,
    PRIMARY KEY(playerId));

/*
I have created a second table i.e. points table because if not, we will have to add an extra column to players table 
i.e. matches played. As per my assumption, all 11 players of each team has played all the matches of the team
which will incur duplicacy in the players table
*/

create table pointsTable(
	teamName varchar(50) NOT NULL,
    matchesPlayed int NOT NULL,
    matchesWon int NOT NULL,
    runsScored int NOT NULL,
    wicketTaken int NOT NULL,
    PRIMARY KEY(teamName));

/* a) Create sample data in all the tables.*/
    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Sachin Tendulkar',350,1,'IND');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Rohit Sharma',256,0,'IND');
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Virat Kohli',321,0,'IND');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Yuvraj Singh',292,4,'IND');
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Suresh Raina',126,2,'IND');
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Mahendra Bahubali',222,0,'IND');
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Hardik Pandya',198,7,'IND');
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Ravindra Jadeja',203,9,'IND');
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Anil Kumble',26,13,'IND');
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Mohammad Shami',9,16,'IND');
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Jasprit Bumrah',0,8,'IND');

INSERT INTO players (playerName,runs,wickets,team) VALUES ('Adam Gilchrist',256,0,'AUS');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('David Warner',189,0,'AUS'); 
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Michael Hussey',255,1,'AUS');       
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Ricky Ponting',312,0,'AUS');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Steve Smith',286,1,'AUS');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Michael Clarke',275,0,'AUS');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Andrew Symonds',156,12,'AUS');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Shane Warne',88,7,'AUS');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Mitchell Starc',36,15,'AUS');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Pat Cummins',52,9,'AUS');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Glenn McGrath',2,11,'AUS');    

INSERT INTO players (playerName,runs,wickets,team) VALUES ('Hashim Amla',243,0,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Herschelle Gibbs',202,0,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Quinton deKock',214,0,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('AB Devilliers',293,0,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Graeme Smith',234,0,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Faf du Plessis',191,1,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('JP Duminy',100,5,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Chris Morris',67,12,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Dale Steyn',11,15,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Kagiso Rabada',9,11,'SA');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Emraan Tahir',4,7,'SA');    

INSERT INTO players (playerName,runs,wickets,team) VALUES ('Brendon McCullum',389,0,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Jos Butler',256,0,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Kane Williamson',355,1,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Joe Root',288,3,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Eoin Morgan',224,0,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Ross Taylor',245,0,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Ben Stokes',212,11,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Jofra Archer',56,15,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Aadil Rashid',22,13,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Tim Southee',18,8,'United England & NewZealand');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Trent Boult',6,18,'United England & NewZealand');    

INSERT INTO players (playerName,runs,wickets,team) VALUES ('Chris Gayle',312,2,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Viv Richards',258,0,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Kumar Sangakkara',388,0,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Babar Azam',298,0,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Brian Lara',347,0,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Kieron Pollard',288,5,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Imran Khan',182,15,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Wasim Akram',88,10,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Lasith Malinga',26,17,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Saeed Ajmal',3,14,'Rest of the world');    
INSERT INTO players (playerName,runs,wickets,team) VALUES ('Muttiah Marlidharan',6,22,'Rest of the world');    

INSERT INTO pointstable VALUES ('IND',7,5,2003,60);    
INSERT INTO pointstable VALUES ('AUS',7,4,1907,56);    
INSERT INTO pointstable VALUES ('SA',6,2,1568,51);    
INSERT INTO pointstable VALUES ('United England & NewZealand',8,2,2071,69);    
INSERT INTO pointstable VALUES ('Rest of the world',8,5,2196,79);    

/*
delete from records where team = 'Rest of the world'; 	
select playerId from players where playerName = 'Saeed Ajmal';
select * from pointstable;
select * from players;
update players set wickets=8 where playerId = 54;
select sum(runs), sum(wickets) from players where team = 'Rest of the world';
select max(runs) from players where team = 'IND';
*/

/* b) Fetch the top 5 batsmen who scored the maximum runs.*/
select * from players order by runs desc limit 5;


/* c) Fetch the top 5 bowlers who has taken the maximum wickets.*/
select * from players order by wickets desc limit 5;


/* 
(d) Fetch the average score scored by each team considering the matches played. 
there are 2 ways to solve this query, one with pointstable and another using joins. Both queries are stated below.
*/
select teamName, runsScored/matchesPlayed from pointstable order by runsScored/matchesPlayed desc;

select team, sum(runs)/matchesPlayed from players left join pointstable on players.team=pointstable.teamName group by team;


/* e) Increase the scores of each batsmen in the team, which has the least average computed in Step 6, by 10 runs.*/
update players set runs = runs + 10 where playerId <> 0 and team = (
	select teamName from pointstable order by runsScored/matchesPlayed asc limit 1);


/* (f) Create a procedure which takes country as the input and gives the highest score of the country up to date, as output*/

DELIMITER $$
drop procedure if exists highestScorer$$
create procedure highestScorer(teaminput varchar(50), out highestScore int)
begin
	select max(runs) into highestScore from players where team = teaminput;
end$$

DELIMITER ;

call HighestScorer('IND',@highestScore);
select @highestScore;