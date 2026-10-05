package de.mohammed.firstapp.test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.mohammed.firstapp.db.entity.Category;
import de.mohammed.firstapp.db.repo.CategoriesRepo;

public class FirstDB {

	private final static Logger logger = Logger.getLogger(FirstDB.class.getSimpleName());
	private static CategoriesRepo repo = new CategoriesRepo();
	
	
	public static void main(String[] args) {
		insert();

	} // END main
	
	static void insert() {
		try {
			Category newCategory = new Category();
			newCategory.setName("Test07 Category new");
			newCategory.setDescription("TEST599....TEST");
			repo.insert(newCategory);
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "DB FEHLER....");
		}
		
	}
	

}// END class
