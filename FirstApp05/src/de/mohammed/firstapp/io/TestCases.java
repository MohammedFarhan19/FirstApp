package de.mohammed.firstapp.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCases {
	
	Logger logger = Logger.getLogger(TestCases.class.getName());

	public static void oddOrEven() {
		
		//[1] INPUT
		// HW verlnagt Keyboard (default input)
		// in diesem Fall ist der Scanner class der Ventil, der alles kontrolliert
		
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = keyboardScanner.nextInt();
		
//		int number = 23;

		// [2] PROCESSING
		Engine e = new Engine();
		String message = e.oddOrEven(number);

		// [3] OUTPUT
		System.out.println(message);
	}
	
	public static void welcomeName() {
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = keyboardScanner.next();
		
		// [2] PROCESSING
				Engine e = new Engine();
				String message = e.welcome(name);
				
		// OUTPUT
		System.out.println(message);
	}
	
	/**
	 * Methode um Reader zu testen
	 * @throws IOException 
	 */
	public static void testReader(){
		
		try {
			// Reader ist abstract class kein Object möglich
			Reader keyboardReader = new InputStreamReader(System.in);
			System.out.print("Enter name: ");
			int character = keyboardReader.read();
			System.out.println(character);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Methode zum testen von BufferedReader
	 */
	public void testBufferedReader() {
		
		try {
			Reader reader = new InputStreamReader(System.in);
			BufferedReader bfReader = new BufferedReader(reader);
			System.out.print("Enter name:");
			logger.log(Level.INFO, "read name");
			String name = bfReader.readLine();
		} catch (IOException e) {
			logger.log(Level.INFO, e.getMessage());
		}
		
	}
}
