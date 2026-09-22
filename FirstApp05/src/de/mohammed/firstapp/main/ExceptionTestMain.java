package de.mohammed.firstapp.main;

import de.mohammed.firstapp.exception.MyException;
import de.mohammed.firstapp.helpers.QuizSolver;

public class ExceptionTestMain {
	
	public static void main(String[] args) {
		testException();
		
	}
	
	public static void testException() {
		try {
			QuizSolver quizSolver = new QuizSolver();
			int month = 10;
			int year = 2000;
			int count;
			count = quizSolver.getMonthDaysCountUsingExceptions(month, year);
			System.out.println("Count of Month: " + month + " is " + count + " days.");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
