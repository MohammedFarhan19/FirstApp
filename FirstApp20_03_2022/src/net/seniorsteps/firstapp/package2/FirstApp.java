/**
 * @author mohammed Farhan
 * 
 */
package net.seniorsteps.firstapp.package2;

public class FirstApp {
	/*
	 * Ram , cash, Register we have Variables, we store values in it k
	 */

	public static void test() {
		int firstnumberber; // Declaration
		firstnumberber = 10; // Assignment
		int secondnumberber = 20; // Initialization

		/*
		 * Operator types 1- = -->
		 */

		int sum;
		sum = firstnumberber + secondnumberber;

		int diff;
		diff = firstnumberber - secondnumberber;

		int multiplicationresult;
		multiplicationresult = firstnumberber * secondnumberber;

		float divisioresult;
		divisioresult = (float) firstnumberber / secondnumberber;

		System.out.println(firstnumberber + " + " + secondnumberber + " = " + sum);
		System.out.println(firstnumberber + " - " + secondnumberber + " = " + diff);
		System.out.println(firstnumberber + " X " + secondnumberber + " = " + multiplicationresult);
		System.out.println(firstnumberber + " / " + secondnumberber + " = " + divisioresult);

		System.out.println(firstnumberber + secondnumberber);
		System.out.println("sum " + firstnumberber + secondnumberber);
		System.out.println(firstnumberber + secondnumberber + " => Sum");

		for (int i = 0; i < 1000; i = i + 7) { // i for iteration
			System.out.println(i);
		}
	}

	public static String calculateAngleBetweenClockArms(int h, int m) {

		/*
		 * ** Calculating Angle between Clock Arms | Start **
		 */
		// Input
//		int h = 23;
//		int m = 59;
		float angle = 0;
//		boolean error = false;

		// Processing
//			error = true;
		// if we have 24 hour format
		if (h > 12 && h < 24) {
			h = h - 12;
		}
		if ((h >= 0 && h <= 12) && (m >= 0 && m <= 59)) {
			float minutesArm = m * 6;
			float hoursArm = h * 30 + m * 0.5f; // Explicit Casting
			angle = (hoursArm - minutesArm) % 360;
			if (angle < 0) { // boolean expression, using comparison Operators or we could use following
								// expression if(hoursArm < minutesArm)
				angle = angle * -1;
			}
		}
		// Output

		String message = "";
		if (h > 12) {
			message = "Error: Hours can't be greater than 12";
//			System.out.println("Error: Hours can't be greater than 12");
		} else if (h < 0) {
			message = "Error: Hours can't be less than 0";
//			System.out.println("Error: Hours can't be less than 0");
		} else if (m > 59) {
			message = "Error: minutes can't be greater than 60";
//			System.out.println("Error: minutes can't be greater than 60");
		} else if (m < 0) {
			message = "Error: minutes can't be less than 0";
//			System.out.println("Error: minutes can't be less than 0");
		} else {
			message = "Angle is " + angle;
//			System.out.println("Angle is " + angle);
		}

		/* Calculating Angle between Clock Arms | End */

		return message;

	}

	public static int calculatingBerma() {

		/* Calculating Berma | Start */
		for (int number = 60;; number = number + 60) {
			if (((number + 1) % 7) == 0) {
//				System.out.println(number + 1);
//				break;

				return number + 1;
			}
		}
		/* Calculating Berma | End */
	}

	public static int getMonthDays(int month, int year) {

		/* Months DaysCount | Start */
		// INPUT

//		int month = 112;
//		int year = 2045;
//
//		//PROCESSING
		int daysCount;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			daysCount = 31;

		} else if (month == 4 || month == 6 || month == 9) {
			daysCount = 30;

		} else if (month == 2) {

			if (year % 4 == 0) {
				daysCount = 29;
			} else {
				daysCount = 28;
			}
		} else {
			daysCount = 0;
		}

		// OUTPUT
		return daysCount;

//		String output = "";
//		if (daysCount == 0) {
////			System.out.println("Invalid Month ...............");
//			output = "Invalid Month ...............";
//
//		} else {
//
//			output = "The Month " + month + " is " + daysCount + " days.";
////			System.out.println("The Month " + month +" is "+ daysCount + " days.");
//		}
//
//		/* Months DaysCount | End */


	}

	public static int[] getNumberInfo(int number) {
		/* Input */
//		int number = 130;
		int digitsCount = 0;
		int digitsSum = 0; // accumulator Variable
		int newNumber = 0;

		/* Processing */
		if (number < 0) {
			number = number * -1;
		}
//		while (number > 0) {
//			int digit = number % 10;
//			digitsSum = digitsSum + digit;
//			System.out.println(digit);
//			number = number / 10 ;
////			number = number / 10 ;
//			
//			digitsCount++;
//		}
		do {
			int digit = number % 10;
			digitsSum = digitsSum + digit;
			int digitSquare = digit * digit;
			newNumber = newNumber + digitSquare;
//			System.out.print(digit + " ");
			number = number / 10;
			digitsCount++;
		} while (number > 0);
//
//		/* Output */

		int[] output = new int[3];
				
		output[0] =	digitsCount;
		output [1]= digitsSum;
		output [2] =newNumber;

		return output;
//		System.out.println("\nDigits Count is :" + digitsCount);
//		System.out.println("Digits Sum is :" + digitsSum);
//		System.out.println("New Number is :" + newNumber);
//

	}

	
	public static int sumNumbers(int[] numbers) {
		
		int sum = 0;
		for(int i =0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {

//		String result = calculateAngleBetweenClockArms(11, 30);
//		System.out.println(result);
//		
//		
//		System.out.println("Berma result is: "+ calculatingBerma());
//		System.out.println(getMonthDays(12, 2000));

//		System.out.println(getNumberInfo(222));
		
//		int x =3;
//		String str= "Ali";
		
//		int [] a = new int[5];
//		
//		a[0] = 13;
//		a[4] = 16;
//		
//		for(int i =0; i< a.length; i++) {
//			System.out.println(a[i]);
//			
//		}
//		
//		String[] b = new String[2];
//		b[0] = "Ali";
//		
//		for(int i =0; i <b.length; i++) {
//			System.out.println(b[i]);
//		}
//
//		int[] c = {13,15,253,55,66,99,44};
//		
//		System.out.println(c.length);
//		System.out.println(c[c.length-1]);  // last Index
//		System.out.println(c[8]);
		
//		int [] numberInfo= getNumberInfo(222);
//		System.out.println("Digits Cout\t"+numberInfo[0]);
//		System.out.println("Digits Sum\t"+numberInfo[1]);
//		System.out.println("new Number\t"+numberInfo[2]);
		
		int [] x = new int [5];
		x[0]= 1;
		x[1]= 5;
		x[2]= 2;
		x[3]= 3;
		x[4]= 4;
		
		int result = sumNumbers(x);
		System.out.println(result);
		
		// new Message 
		
		
		
	}
}























