package de.mohammed.firstapp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
		// 1- connect to Database (localhost, 3306, username, password, store_java)
		try (
				Connection connection = DriverManager.getConnection(url, username, password);
		// 2- prepare Query (Insert, update, delete, select)
				Statement stmt = connection.createStatement();
				){
			System.out.println("connected....");
			logger.log(Level.INFO, "connected");
			
			String sqlQuery = "INSERT INTO categories (name, description)"
							+ " VALUES ('Category56', 'some category')";
			logger.log(Level.INFO, "New category inserted");
			// 3- execute Query
			 int noOfRowsAffected = stmt.executeUpdate(sqlQuery);
			 // 4- Fetch result (feedback, data)
			 if(noOfRowsAffected == 0) {
				 System.out.println("No rows affected.....");
			 } else {
				 System.out.println("No of Rows Affected: " + noOfRowsAffected);
			 }
		
			 // 5- close connection
			 // Autoclose in the try with resource
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "DB Exception: " + e.getMessage());
		}
	}
}
