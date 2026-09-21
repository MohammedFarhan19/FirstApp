package de.mohammed.firstapp.main;
/**
 * new Class
 */
public class ArrayEngine {
	
	int x;
	int[] test;
	
	public int[] reverseArray(int[] numbers) {
		int[] reversedArray = new int[numbers.length];
		for(int i = numbers.length - 1; i >= 0; i--) {
			reversedArray[i] = numbers[numbers.length - i - 1];
		}
		return reversedArray;
	}
	
	//overloading
	public float[]  reverseArray(float[] numbers) {
		float[]  reversedArray = new float[numbers.length];
		for(int i = numbers.length - 1; i >= 0; i--) {
			reversedArray[i] = numbers[numbers.length - i - 1];
		}
		return reversedArray;
	}
	
	public boolean isFound(int[] numbers, int target) {
		for(int i = 0; i < numbers.length; i++) {
			if(target == numbers[i]) {
				return true;
			}
		}
		return false;
	}
	
	public int getTargetIndex(int[] numbers, int target) {
//		int index = -1;
		for(int i = 0; i < numbers.length; i++) {
			if(target == numbers[i]) {
				return i;
			}
		}
		return -1; // if target not found
	}
	
	public void printIntArrayUsingForLoop(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	public void printIntArrayUsingWhile(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
	}

	public void printIntArrayUsingForEach(int[] arr) {
		for (Integer a : arr) {
			System.out.println(a);
		}
	}

	public void printStringArrayUsingForLoop(String[] arrString) {
		for (int i = 0; i < arrString.length; i++) {
			System.out.println(arrString[i]);
		}
	}

	public int sumNumbers(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public int countRepeatedNumber(int[] numbers, int target) {
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(target == numbers[i]) {
				count++;
			}
		}
		return count;
		
	}
	
	public int getMaximumNumber(int[] numbers) {
		int maxNumber = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > maxNumber) {
				maxNumber = numbers[i];
			}
		}
		return maxNumber;
	}
	
	public int getMinimumNumber(int[] numbers) {
		int minNumber = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < minNumber) {
				minNumber = numbers[i];
			}
		}
		return minNumber;
	}
	
	public int countEvenNumbers(int[] numbers) {
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public int countOddNumbers(int[] numbers) {
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	public int[] getDistinctValues(int[] numbers) {
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
	
	public int[] sliceArray(int[] numbers, int newSize) {
		int[] trimmedArray = new int[newSize];
		for(int i = 0; i < trimmedArray.length; i++) {
			trimmedArray[i] = numbers[i];
		}
		return trimmedArray;
	}

}
