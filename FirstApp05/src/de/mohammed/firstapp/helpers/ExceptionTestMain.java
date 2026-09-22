package de.mohammed.firstapp.helpers;

import de.mohammed.firstapp.exception.MyException;
import de.mohammed.firstapp.geometry.Circle;

public class ExceptionTestMain {

	public static void main(String[] args) {
		
		try {
			Circle circle = new Circle(-12);
			System.out.println(circle.calculateArea());
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
