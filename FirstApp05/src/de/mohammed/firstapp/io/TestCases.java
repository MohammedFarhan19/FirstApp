package de.mohammed.firstapp.io;

import java.util.Scanner;

public class TestCases {

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
}
