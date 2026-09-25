package de.mohammed.firstapp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
1- connect to Database (localhost, 3306, username, password, store_java)
2- prepare Query (Insert, update, delete, select)
3- execute Query
4- Fetch result (feedback, data)
5- close connection => besser try with resource try(hier){}
 */
public class FirstDB {
	private final static Logger logger = Logger.getLogger(FirstDB.class.getSimpleName());

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/store_java"; 
		String username = "root"; 
		String password = ""; 
		
		/**
		 * Connection ist iterface extends Autoclosable => try with resource
		 */
		try (
				Connection connection = DriverManager.getConnection(url, username, password);){
				System.out.println("connected....");
		
		
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "DB Exception: " + e.getMessage());
		}
	}
}
