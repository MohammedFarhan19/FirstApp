package de.mohammed.firstapp.db.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
1- connect to Database (localhost, 3306, username, password, store_java)
2- prepare Query (Insert, update, delete, select)
3- execute Query
4- Fetch result (feedback, data)
5- close connection => besser try with resource try(hier){}
 */
public class DBConnectionManager {
	
	private final String URL = "jdbc:mysql://localhost:3306/store_java";
	private final String USERNAME = "root";
	private final String PASSWORD = "";
	
	public Connection connect() {
		/* Connection ist iterface extends Autoclosable => try with resource */
				// 1- connect to Database (localhost, 3306, username, password, store_java)
				try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);)
						{	
					return connection;
							
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
	}

}
