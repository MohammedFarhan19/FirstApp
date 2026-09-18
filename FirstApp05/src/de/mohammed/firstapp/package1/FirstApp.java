/**
 * @author mohammed
 * Project name: FirstApp
 * History: 2026
 */
package de.mohammed.firstapp.package1;

public class FirstApp {

	public static void main(String[] args) {

//		int firstNumber;
//		firstNumber = 20;
//		
//		int secondNumber = 15;
//		int sum;
//		sum = firstNumber + secondNumber;
//		
//		int diff;
//		diff = firstNumber - secondNumber;
//		
//		int multiplicationResult = firstNumber * secondNumber;
//		float divisionResult = (float)firstNumber / secondNumber;
//		
//		System.out.println("Sum: " + sum);
//		System.out.println("Diff: " + diff);
//		System.out.println("Mul: " + multiplicationResult);
//		System.out.printf("Div: %.2f\n" , divisionResult);

		///////////////////////////////////////////////////////////
		//      Calculating Angle between Clock Arms | START     //
		//////////////////////////////////////////////////////////
	
		// INPUT
//		int h = 23;
//		int m = 59;
////		boolean error = false;
//
//		// PROCESSING
//		float angle = 0;
//		if(h > 12 && h < 24) {
//			h = h - 12;
//		}
//		
//		if ((h >= 0 && h <= 12) && (m >= 0 && m <= 59)) {
////			error = true;
//			float minutesArm = m * 6;
//			float hoursArm = h * 30 + m * 0.5f;
//			angle = (hoursArm - minutesArm) % 360;
//			if (hoursArm < minutesArm) {
//				angle *= -1;
//			}
//		}
//		
//		// OUTPUT
//		if (h > 12) {
//			System.out.println("ERROR: hour's can't be greater than 12");
//		} else if (h < 0) {
//			System.out.println("ERROR: hour's can't be less than 0");
//		} else if (m < 0) {
//			System.out.println("ERROR: minutes can't be less than 0");
//		} else if (m > 59) {
//			System.out.println("ERROR: minutes can't be greater than 60");
//		} else {
//			System.out.println("Angle: " + angle);
//		}
		
		///////////////////////////////////////////////////////////
		//      Calculating Angle between Clock Arms | END      //
		//////////////////////////////////////////////////////////

		
		///////////////////////////////////////////////////////////
		//            Calculating Berma | START                  //
		//////////////////////////////////////////////////////////
		
		
//		for(int number = 60; ; number+= 60){
//			if(	(number+1)  % 7 == 0 ) {
//				System.out.println(number + 1);
//				break;
//			}
//		}
		///////////////////////////////////////////////////////////
		//            Calculating Berma | END                   //
		//////////////////////////////////////////////////////////

		///////////////////////////////////////////////////////////
		//            Calculating Days count using IF| START     //
		//////////////////////////////////////////////////////////
		
//		// INPUT
//		int month = 5;
//		int year = 2045;
//		
//		int daysCount;
//		
//		//PROCESSING
//		if(    month == 1 
//			|| month == 3
//			|| month == 5
//			|| month == 7
//			|| month == 8
//			|| month == 10
//			|| month == 12
//				) {
//			daysCount = 31;
//			
//		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
//			daysCount = 30;
//		} else if(month == 2){
//			if(year % 4 == 0) {
//				daysCount = 29;
//			} else {
//				daysCount = 28;
//			}
//		} else {
//			daysCount = 0;
//		}
//		
//		// OUTPUT
//		if(daysCount == 0) {
//			System.out.println("INVALID MONTH");
//		} else {
//			System.out.println("The month " + month + " is: " + daysCount + " days.");
//		}
		
		///////////////////////////////////////////////////////////
		//            Calculating Days count | END              //
		//////////////////////////////////////////////////////////

		
		/*
		 * *****************************************************************************
		 */
		
		
		///////////////////////////////////////////////////////////
		//       Calculating Days count using SWITCH| START     //
		//////////////////////////////////////////////////////////

		// INPUT
//		
//		int month = 122;
//		int year = 2020;
//		
//		int daysCount;
//		
//		// PROCESSING
//		switch(month) {
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12:
//				daysCount = 31;
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				daysCount = 31;
//				break;
//			case 2:
//				if(year % 4 == 0) {
//					daysCount = 29;
//				} else {
//					daysCount = 28;
//				}
//				break;
//			default:
//				daysCount = 0;
//		}
//		
//		// OUTPUT
//		if(daysCount == 0) {
//			System.out.println("INVALID MONTH");
//		} else {
//			System.out.println("The month " + month + " is: " + daysCount + " days.");
//		}
		
		///////////////////////////////////////////////////////////
		//       Calculating Days count using SWITCH| END        //
		//////////////////////////////////////////////////////////
		
		
		System.out.println("********************* using for ***********************************");
		// using for
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("********************* using while ***********************************");
		// INPUT
		int number = 12;
		int digitsCount = 0;
		int digitsSum = 0;
		int newNumber = 0;
		
		// PROCESSING
//		if(number < 0) {
//			number *= -1;
//		}
//		if(number == 0) {
//			digitsCount = 1;
//		}
//		while(number > 0) {
//			int digit = number % 10;
//			System.out.println(digit);
//			digitsSum += digit;
//			number/= 10;
//			digitsCount++;
//		}
//		// OUTPUT
//		System.out.println("Digits Count is: " + digitsCount);
//		System.out.println("Digits Sum is: " + digitsSum);
		
		System.out.println("********************* using do while ***********************************");
		
		do {
			int digit = number % 10;
			System.out.println(digit);
			digitsSum += digit;
			int digitSquare = digit * digit;
			newNumber = newNumber + digitSquare;
			number/= 10;
			digitsCount++;
			
		} while (number != 0);
		
		// OUTPUT
		System.out.println("Digits Count is: " + digitsCount);
		System.out.println("Digits Sum is: " + digitsSum);
		System.out.println("New Number is: " + newNumber);
		System.out.println("***************** END *******************");
	}
}

















