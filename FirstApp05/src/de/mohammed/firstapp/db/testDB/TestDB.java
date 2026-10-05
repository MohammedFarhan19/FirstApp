package de.mohammed.firstapp.db.testDB;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.mohammed.firstapp.db.entity.Category;
import de.mohammed.firstapp.db.repo.CategoriesRepo;
import de.mohammed.firstapp.test.FirstDB;

public class TestDB {

	private final static Logger logger = Logger.getLogger(FirstDB.class.getSimpleName());
	private static CategoriesRepo repo = new CategoriesRepo();

	public static void insert() {
		try {
			Category newCategory = new Category();
			newCategory.setName("Test07 Category new");
			newCategory.setDescription("TEST599....TEST");
			repo.insert(newCategory);
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "DB FEHLER....");
		}

	}

	public static void delete(Integer id) {
		try {
			repo.delete(id);
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "FEHELR...");
		}
	}

	public static Category select(Integer id) {
		Category foundCategory = null;
		try {
			foundCategory = repo.selectCategory(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foundCategory;
	}

	public static void selectAllCategories(){
		try {
			List<Category> foundedList = repo.selectAllCategories();
			if(foundedList != null && !foundedList.isEmpty()) {
				for(Category iCat : foundedList) {
				System.out.print("ID: " + iCat.getId());
				System.out.print(" | NAME: " + iCat.getName());
				System.out.println(" | DESCRIPTION: " + iCat.getDescription());
				}
			} else {
				System.out.println("No Catgories found...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
