package com.au.assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assignment {
	public static void main(String[] args) throws IOException,ClassNotFoundException, SQLException{
		
		//opening a file
		File file = new File("info.txt");
		file.createNewFile();
		
		//Writing random numbers
		FileWriter fw = new FileWriter("info.txt");
		Random rand = new Random();
		int num;
		do 
		{
			num = rand.nextInt(1000);
			//System.out.println(num);
			fw.write(Integer.toString(num));
			fw.write(" ");
		}while(num%5!=0);	
		fw.close();
		
		//reading the numbers in the file
		List<Integer> list = new ArrayList<>();
		Scanner s = new Scanner(file);
		do
		{
			list.add(s.nextInt());
		}while(s.hasNext());
		s.close();
		
		//System.out.println(list.toString());
		
		//getting number divisible by 5 and multiplying it by 2 
		list = list.stream().filter(a -> a%5==0).map(a -> a*2).collect(Collectors.toList());
		int id = list.get(0);
		
		//System.out.println(list.toString());
		
		//System.out.println(id);
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		String url = "jdbc:mysql://remotemysql.com:3306/sMkXvyYxZM";
		
		String username = "sMkXvyYxZM";
		String password = "8h9tWhCKws";
		
		Connection connection = DriverManager.getConnection(url,username,password);
		
		String sql = "insert into test(id,name) VALUES (?,?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, "Aditya Lath");
		ps.executeUpdate();
		
		String sql2 = "select * from test where id=?";
		ps = connection.prepareStatement(sql2);
		ps.setInt(1, id);
		ResultSet set = ps.executeQuery();
		while(set.next())
		{
			int myId = set.getInt("id");
			String name = set.getString("name");
			System.out.println(myId+" "+name);
		}
		
		connection.close();
		
	}
}
