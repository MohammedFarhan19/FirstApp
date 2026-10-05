package de.mohammed.firstapp.test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.mohammed.firstapp.db.entity.Category;
import de.mohammed.firstapp.db.repo.CategoriesRepo;

public class FirstDB {

	private final static Logger logger = Logger.getLogger(FirstDB.class.getSimpleName());
	public static void main(String[] args) {
		
		CategoriesRepo repo = new CategoriesRepo();
		
		try {
			Category newCategory = new Category();
			newCategory.setName("Test3 Category new");
			newCategory.setDescription("TEST....TEST");
			repo.insert(newCategory);
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "DB FEHLER");
		}

	} // END main

}// END class
