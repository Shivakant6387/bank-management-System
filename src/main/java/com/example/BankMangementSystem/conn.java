package com.example.BankMangementSystem;
import java.sql.*;
public class conn {
	Connection c;
	Statement s;

	conn(){
		
		try {
			//Class.forName(com.mysql.cj.jdbc.Driver); 
			c=DriverManager.getConnection("jdbc:mysql:///rootdb/","shiva","data123456");
			s=c.createStatement();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
