package com.git.student;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentSelect {
	public static void main(String[] args) {
		 String url ="jdbc:mysql://localhost:3306/school";
		 String username ="root";
		 String password ="Root";
		 
		 String sql ="SELECT * FROM student";
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url, username, password);
			Statement state = connect.createStatement();
			ResultSet resultset = state.executeQuery(sql);
			while(resultset.next()) {
				System.out.println("=======================");
				System.out.print(resultset.getInt(1) + " ");
				System.out.print(resultset.getString(2)+ " ");
				System.out.print(resultset.getString(3)+ " ");
				System.out.println();
				System.out.println("=======================");
			}
			connect.close();
					} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}

