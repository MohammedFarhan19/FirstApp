package de.mohammed.firstapp.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.mohammed.firstapp.db.entity.Category;
import de.mohammed.firstapp.db.testDB.TestDB;


public class FirstDB {

	
	public static void main(String[] args) {

		TestDB.selectAllCategories();

	} // END main


}// END class
