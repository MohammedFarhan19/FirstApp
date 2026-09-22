package de.mohammed.firstapp.helpers;

public class NumbersEngine {

	int[] getNumberInfo(int number) {
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
	
	int sumNumbers(int x, int y) {
		return x + y;
	}
	
	// overloading
	float sumNumbers(float x, float y) {
		return x + y;
	}
}
