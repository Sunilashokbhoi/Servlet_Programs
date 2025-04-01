package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;

public class Simple {
public static void main(String[] args) {
	
	String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	String username = "system";
	String password = "sunil";
	
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con  = DriverManager.getConnection
			(URL,username,password);
		System.out.println("connection is  established Successfull...");
		con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
}
