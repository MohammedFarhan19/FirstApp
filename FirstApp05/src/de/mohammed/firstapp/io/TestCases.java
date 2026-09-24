package de.mohammed.firstapp.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;

public class TestCases {
	
	private final static Logger logger = Logger.getLogger(TestCases.class.getName());

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
	public static void testBufferedReader() {
		
		try {
			Reader reader = new InputStreamReader(System.in);
			BufferedReader bfReader = new BufferedReader(reader);
			logger.log(Level.INFO, "read name");
			System.out.print("Enter name:");
			String name = bfReader.readLine();
			
			logger.log(Level.INFO, "calling Engine class => Method Welcome");
			Engine engine = new Engine();
			System.out.println(engine.welcome(name));
		} catch (IOException e) {
			logger.log(Level.INFO, e.getMessage());
		}
		
	}
	
	public static void test() {
	}
	
	/**
	 * Methode zum testen von Reader(abstract class, und BufferedReader)
	 * nutzung von Logger.Level
	 */
	public static void testReaderZwo() {
		try {
			Reader reader = new InputStreamReader(System.in);
			BufferedReader bfReader = new BufferedReader(reader);
			System.out.print("Enter Text: ");
			String text = bfReader.readLine();
			logger.log(Level.INFO, "your text\n");
			System.out.println(text);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "FEHLE IN DER KLASSE: " + TestCases.class.getSimpleName() + " : " + e.getMessage());;
		}
	}
	
	/**
	 * Methode zum testen von FileInputStream mit Scanner
	 */
	public static void testFileInputStream() {
		try {
			// /FirstApp05/test.txt
			FileInputStream inputFile = new FileInputStream("test.txt");
			Scanner fileScanner = new Scanner(inputFile);
			String line = fileScanner.nextLine();
			System.out.println(line);
			
		} catch (FileNotFoundException e) {
			logger.log(Level.SEVERE, "Fehler: " + TestCases.class.getSimpleName() + " : " + e.getMessage());
		}
	}
	
	public static void readFileUsingFileChooser() {
		try {
			JFileChooser fileChooser = new JFileChooser();
			int response = fileChooser.showOpenDialog(null);
			if (response == fileChooser.APPROVE_OPTION) {
				String path = fileChooser.getSelectedFile().getAbsolutePath();

				// now FileInputStream
				FileInputStream fileInputStream = new FileInputStream(path);
				Scanner inputScanner = new Scanner(fileInputStream);
				String lineFromFile = inputScanner.nextLine();
				logger.log(Level.INFO, "Now Read the Line");
				System.out.println(lineFromFile);
			}
		} catch (FileNotFoundException e) {
			logger.log(Level.SEVERE, "Fehler: " + TestCases.class.getSimpleName() + " : " + e.getMessage());
		}
	}
}


















