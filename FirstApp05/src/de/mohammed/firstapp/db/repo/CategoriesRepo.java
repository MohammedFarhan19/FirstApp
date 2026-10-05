package de.mohammed.firstapp.db.repo;

/**
 * Data Access Object (DAO)
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.mohammed.firstapp.db.common.DBConnectionManager;
import de.mohammed.firstapp.db.entity.Category;
import de.mohammed.firstapp.test.FirstDB;

public class CategoriesRepo {

	private final static Logger logger = Logger.getLogger(FirstDB.class.getSimpleName());
	private DBConnectionManager connManager = new DBConnectionManager();
	
	public int insert(Category category) throws SQLException {
		try (Connection connection = connManager.connect();
				// 2- prepare Query (Insert, update, delete, select)
				Statement stmt = connection.createStatement();) {

			System.out.println("connected ok....");
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
	
	public Category selectCategory(Integer id) throws SQLException {
		
		try(
				Connection connection = connManager.connect();
				Statement stmt = connection.createStatement();
				){
			String query = "SELECT * FROM categories"
					     + " WHERE id = " + id + ";";
			
			ResultSet result = stmt.executeQuery(query);
			
			if(result.next()) {
				Category currentCategory = new Category();
				currentCategory.setId(result.getInt("id"));
				currentCategory.setName(result.getString("name"));
				currentCategory.setDescription(result.getString("description"));
				return currentCategory;
			}
			return null;
		}
	}
	
	public List<Category> selectAllCategories() throws SQLException{
		try(
				Connection connection = connManager.connect();
				Statement stmt = connection.createStatement();
				){
			String query = "SELECT * FROM categories;";
			
			ResultSet result = stmt.executeQuery(query);
			
			List<Category> allCategories = new ArrayList<>();
			while(result.next()) {
				Category currentCategory = new Category();
				currentCategory.setId(result.getInt("id"));
				currentCategory.setName(result.getString("name"));
				currentCategory.setDescription(result.getString("description"));
				allCategories.add(currentCategory);
			}
			
			return allCategories;
		}
	}

}
