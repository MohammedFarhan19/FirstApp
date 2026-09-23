package de.mohammed.firstapp.io;

import java.util.Scanner;

public class Engine {

	public String oddOrEven(int number) {
//		String message = "";
		if(number % 2 == 0) {
			return "EVEN";
		} else {
			return "ODD";
		}
	}

	public String welcome(String name) {
		return "welcome: " + name;
	}
	
	
}
