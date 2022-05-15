package com.revice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Revision {
	

	public static void main(String args[]){
try {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/Sada";
	String username="root";
	String password="root";
	
	Connection con=DriverManager.getConnection(url,username,password);
	String q="create table Laxmi(Id int(20)primary key auto_increment,	Name varchar (200)not null,City varchar(400))";
	Statement stmt=con.createStatement();
	stmt.executeUpdate(q);
	System.out.println("table created in database..");
	con.close();
}catch(Exception e)
{
	e.printStackTrace();
	
}
}
}