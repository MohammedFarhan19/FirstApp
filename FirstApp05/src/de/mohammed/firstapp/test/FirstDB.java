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
//		insert();
//		delete(1);
		Category foundCategory = select(1);
		if(foundCategory != null) {
			System.out.printf("ID: %d\nNAME: %s\nDESCRIPTION: %s\n", foundCategory.getId()
										    , foundCategory.getName()
										    , foundCategory.getDescription());
			
		} else {
			System.err.println("INVALID ID");
		}

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
	
	static void delete(Integer id) {
		try {
			repo.delete(id);
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "FEHELR...");
		}
	}

    
	static Category select(Integer id) {
		Category foundCategory = null;
		try {
			foundCategory = repo.selectCategory(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foundCategory;
	}
}// END class
