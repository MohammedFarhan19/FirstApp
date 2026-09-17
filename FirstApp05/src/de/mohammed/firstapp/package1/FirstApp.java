/**
 * @author mohammed
 * Project name: FirstApp
 * History: 2026
 */
package de.mohammed.firstapp.package1;

import java.awt.Rectangle;

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
		
		// INPUT
		int h = 81;
		int m = 66;
		float angle = 0;
		boolean error = false;
		
		// PROCESSING
		if(h > 12) {
//			error = true;
		} else {
			float minutesArm = m * 6;
			float hoursArm = h * 30 + minutesArm * 0.5f;
			angle = hoursArm - minutesArm;
			if(hoursArm < minutesArm) {
				angle *=  -1;
			}
		}
		
		// OUTPUT
		if(h > 12) {
			System.out.println("ERROR: hour's can't be greater than 12");
		} else if(m > 60) {
			
		}
		
		else {
			System.out.println("Angle: " + angle);
		}
	}
}
