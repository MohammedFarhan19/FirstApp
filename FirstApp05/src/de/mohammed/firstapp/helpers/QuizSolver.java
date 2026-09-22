package de.mohammed.firstapp.helpers;

import java.nio.file.AccessDeniedException;
import java.security.AccessControlException;

import de.mohammed.firstapp.exception.MyException;

public class QuizSolver {
	
	public void test() {
		// Param (requiered false)
		// Body of the function
		int firstNumber;
		firstNumber = 20;

		int secondNumber = 15;
		int sum;
		sum = firstNumber + secondNumber;

		int diff;
		diff = firstNumber - secondNumber;

		int multiplicationResult = firstNumber * secondNumber;
		float divisionResult = (float) firstNumber / secondNumber;

		System.out.println("Sum: " + sum);
		System.out.println("Diff: " + diff);
		System.out.println("Mul: " + multiplicationResult);
		System.out.printf("Div: %.2f\n", divisionResult);
	}

	public String calculateAngleBetweenClockArms(int h, int m) {

		///////////////////////////////////////////////////////////
		// Calculating Angle between Clock Arms | START //
		//////////////////////////////////////////////////////////

		// INPUT
//		int h = 23;
//		int m = 59;
		// boolean error = false;

		// PROCESSING
		float angle = 0;
		if (h > 12 && h < 24) {
			h = h - 12;
		}

		if ((h >= 0 && h <= 12) && (m >= 0 && m <= 59)) {
			// error = true;
			float minutesArm = m * 6;
			float hoursArm = h * 30 + m * 0.5f;
			angle = (hoursArm - minutesArm) % 360;
			if (hoursArm < minutesArm) {
				angle *= -1;
			}
		}

		// OUTPUT
		String message = "";
		if (h > 12) {
			message = "ERROR: hour's can't be greater than 12";
//			System.out.println("ERROR: hour's can't be greater than 12");
		} else if (h < 0) {
			message = "ERROR: hour's can't be less than 0";
//			System.out.println("ERROR: hour's can't be less than 0");
		} else if (m < 0) {
			message = "ERROR: minutes can't be less than 0";
//			System.out.println("ERROR: minutes can't be less than 0");
		} else if (m > 59) {
			message = "ERROR: minutes can't be greater than 60";
//			System.out.println("ERROR: minutes can't be greater than 60");
		} else {
			message = "Angle: " + angle;
//			System.out.println("Angle: " + angle);
		}
		return message;

		///////////////////////////////////////////////////////////
		// Calculating Angle between Clock Arms | END //
		//////////////////////////////////////////////////////////
	}
	
	public int calculateBerma() {
		///////////////////////////////////////////////////////////
		// Calculating Berma | START //
		//////////////////////////////////////////////////////////

		for (int number = 60;; number += 60) {
			if ((number + 1) % 7 == 0) {
//				System.out.println(number + 1);
				return number + 1; // return end the function
//				break;
			}
		}
		///////////////////////////////////////////////////////////
		// Calculating Berma | END //
		//////////////////////////////////////////////////////////
	}

	public int getMonthDaysCount(int month, int year) {
		///////////////////////////////////////////////////////////
		// Calculating Days count using IF| START //
		//////////////////////////////////////////////////////////

		// INPUT
//		int month = 5;
//		int year = 2045;

		int daysCount;

		// PROCESSING
//		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//			daysCount = 31;
//
//		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
//			daysCount = 30;
//		} else if (month == 2) {
//			if (year % 4 == 0) {
//				daysCount = 29;
//			} else {
//				daysCount = 28;
//			}
//		} else {
//			daysCount = 0;
//		}
//

		///////////////////////////////////////////////////////////
		// Calculating Days count | END //
		//////////////////////////////////////////////////////////

		///////////////////////////////////////////////////////////
		// Calculating Days count using SWITCH| START //
		//////////////////////////////////////////////////////////

		// INPUT
		// int month = 122;
		// int year = 2020;
		// int daysCount;

		// PROCESSING
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysCount = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysCount = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				daysCount = 29;
			} else {
				daysCount = 28;
			}
			break;
		default:
			daysCount = 0;
		}

		// OUTPUT
//		String output = "";
//		if (daysCount == 0) {
//			output = "INVALID MONTH";
////			System.out.println("INVALID MONTH");
//		} else {
//			output = "The month " + month + " is: " + daysCount + " days.";
////			System.out.println("The month " + month + " is: " + daysCount + " days.");
//		}
		return daysCount;

	}

	public void printStars(String functionName) {
		System.out.println("*********************** " + functionName + " *************************");
	}
	
	public int getMonthDaysCountUsingExceptions(int month, int year) throws MyException{

		// PROCESSING
		if(year < 1950) {
			throw new MyException("INVALID YEAR");  // AccessControlException is RuntimeException
		}
		
//		int[] test = new int[7];
//		test[6] = 53;
		int[] test = new int[month];
		if(test.length >= 7) {
			test[6] = 23;
		}
		
		/*
		 * Exception of Type RuntimeException
		 * called unchecked, you don't need to write it down in the head of the function
		 */
		int x = 34;
		int y = 0;
		if(y != 0) {
			int z = x / y;   // RunimeException division By Zero 
		}
		
//		int daysCount = 0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
//			daysCount = 31;
//			break;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
//			daysCount = 30;
//			break;
		case 2:
			if(year % 4 == 0) {
				return 29;
//				daysCount= 29;
			} else {
				return 28;
//				daysCount = 28;
			}
		default:
//			System.out.println("INVALID MONTH");
//			return 0;
/*
 * wir returnen hier kein 0, denn 0 gibt keine Erklärun, was eigentlich passiert ist, sondern machen ein Exception 
 * deshalb werfen wir ein Object vom Typ Exception
 * throe new Exception("Invalid Month"); 
 */
			throw new MyException("INVALID MONTH");  //IndexOutOfBoundsException();   // imperative (do!) => // is RuntimeException
		}
		
//		// OUTPUT
//		return daysCount;
	}

}
