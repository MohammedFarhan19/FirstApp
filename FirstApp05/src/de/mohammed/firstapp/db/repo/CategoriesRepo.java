package de.mohammed.firstapp.db.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.mohammed.firstapp.db.entity.Category;
import de.mohammed.firstapp.test.FirstDB;

public class CategoriesRepo {

	private final static Logger logger = Logger.getLogger(FirstDB.class.getSimpleName());
	private DBConnectionManager connManager = new DBConnectionManager();
	
	public int insert(Category category) throws SQLException {
		try (Connection connection = connManager.connect();
				// 2- prepare Query (Insert, update, delete, select)
				Statement stmt = connection.createStatement();) {

			System.out.println("connected....");
			logger.log(Level.INFO, "connected");

			String sqlQuery = "INSERT INTO categories (name, description)" 
							+ " VALUES ('" + category.getName() 
							+ "', '" + category.getDescription() + "')";

			logger.log(Level.INFO, "New category inserted");
			// 3- execute Query
			int noOfRowsAffected = stmt.executeUpdate(sqlQuery);
			// 4- Fetch result (feedback, data)

			return noOfRowsAffected;
			// 5- close connection
			// Autoclose in the try with resource
		}
	}
	
	public int update(Category category) throws SQLException {
		try(
				Connection connection = connManager.connect();
				Statement stmt = connection.createStatement();){
			logger.log(Level.INFO, "Updated.....");
			
			String updateQuery = "UPDATE categories SET "
					+ " name = '" + category.getName()+ "'"
					+ " description = '" + category.getDescription() + "'"
					+ " WHERE id = '" + category.getId()+ "'";
			
			int noOfRowsAffected = stmt.executeUpdate(updateQuery);
			return noOfRowsAffected;
		}
	}
	
	public int delete(Integer id) throws SQLException {
		try(
				Connection connection = connManager.connect();
				Statement stmt = connection.createStatement();){
			logger.log(Level.INFO, "Updated.....");
			
			String deleteQuery = "DELETE FROM categories "
					+ " WHERE id = '" + id + "' ";
			
			int noOfRowsAffected = stmt.executeUpdate(deleteQuery);
			return noOfRowsAffected;
		}
	}
	
	public Category selectCategory(Integer id) {
		throw new UnsupportedOperationException();
	}
	
	public List<Category> selectAllCategories(){
		throw new UnsupportedOperationException();
	}

}
