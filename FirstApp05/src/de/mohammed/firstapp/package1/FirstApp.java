/**
 * @author mohammed
 * Project name: FirstApp
 * History: 2026
 */
package de.mohammed.firstapp.package1;

public class FirstApp {

	public static void test() {
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

	public static String calculateAngleBetweenClockArms(int h, int m) {

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

	public static int calculateBerma() {
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

	public static int getMonthDaysCount(int month, int year) {
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

	public static void printStars(String functionName) {
		System.out.println("*********************** " + functionName + " *************************");
	}

	public static int[] getNumberInfo(int number) {
		// INPUT
//		int number = 12;
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

		do {
			int digit = number % 10;
			System.out.println(digit);
			digitsSum += digit;
			int digitSquare = digit * digit;
			newNumber = newNumber + digitSquare;
			number /= 10;
			digitsCount++;

		} while (number != 0);

		// OUTPUT
		// output is three messsages (return just one Info)
//		System.out.println("Digits Count is: " + digitsCount);
//		System.out.println("Digits Sum is: " + digitsSum);
//		System.out.println("New Number is: " + newNumber);
//		System.out.println("***************** END *******************");

//		String output = "Digits Count is\t" + digitsCount;
//		output += "\nDigits Sum is\t" + digitsSum;
//		output += "\nNew Number is\t" + newNumber;

		// print message using Array
		int[] output = new int[3];
		output[0] = digitsCount;
		output[1] = digitsSum;
		output[2] = newNumber;
		return output;
	}

	public static void printIntArrayUsingForLoop(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	public static void printIntArrayUsingWhile(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
	}

	private static void printIntArrayUsingForEach(int[] arr) {
		for (Integer a : arr) {
			System.out.println(a);
		}
	}

	public static void printStringArrayUsingForLoop(String[] arrString) {
		for (int i = 0; i < arrString.length; i++) {
			System.out.println(arrString[i]);
		}
	}

	public static int sumNumbers(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public static int countRepeatedNumber(int[] numbers, int target) {
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(target == numbers[i]) {
				count++;
			}
		}
		return count;
		
	}
	
	public static int getMaximumNumber(int[] numbers) {
		int maxNumber = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > maxNumber) {
				maxNumber = numbers[i];
			}
		}
		return maxNumber;
	}
	
	public static int getMinimumNumber(int[] numbers) {
		int minNumber = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < minNumber) {
				minNumber = numbers[i];
			}
		}
		return minNumber;
	}
	
	public static int countEvenNumbers(int[] numbers) {
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int countOddNumbers(int[] numbers) {
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] reverseArray(int[] numbers) {
		int[] reversedArray = new int[numbers.length];
		for(int i = numbers.length - 1; i >= 0; i--) {
			reversedArray[i] = numbers[numbers.length - i - 1];
		}
		return reversedArray;
	}
	
	public static int getTargetIndex(int[] numbers, int target) {
//		int index = -1;
		for(int i = 0; i < numbers.length; i++) {
			if(target == numbers[i]) {
				return i;
			}
		}
		return -1; // if target not found
	}
	
	public static boolean isFound(int[] numbers, int target) {
		for(int i = 0; i < numbers.length; i++) {
			if(target == numbers[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static int[] getDistinctValues(int[] numbers) {
		int[] result = new int[numbers.length];
		int resultIndex = 0;
		for(int i = 0; i <numbers.length ; i++) {
			int targetIndex = getTargetIndex(result, numbers[i]);
			if(targetIndex == -1 || targetIndex == resultIndex) {  // >= resultIndex ====> not exist
				result[resultIndex] = numbers[i];
				resultIndex++;
			}
		}
		int[] trimmedArray = sliceArray(numbers, resultIndex);
		return trimmedArray;
	}
	
	public static int[] sliceArray(int[] numbers, int newSize) {
		int[] trimmedArray = new int[newSize];
		for(int i = 0; i < trimmedArray.length; i++) {
			trimmedArray[i] = numbers[i];
		}
		return trimmedArray;
	}
	
	public static void main(String[] args) {
		int numbers[] = { 0, 2, 0, 3, 2, 0, 5};
		int[] myDistinctArry = getDistinctValues(numbers);
		printIntArrayUsingForLoop(myDistinctArry);
		
	}
}

















