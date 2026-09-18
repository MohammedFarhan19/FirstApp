/**
 * @author mohammed
 * Project name: FirstApp
 * History: 2026
 */
package de.mohammed.firstapp.package1;

public class FirstApp {

	public static void main(String[] args) {

		ArrayEngine arrayEngine = new ArrayEngine();
		int[] numbers = { 0, 2, 0, 3, 2, 0, 5 };
		int[] result = arrayEngine.getDistinctValues(numbers);
		arrayEngine.printIntArrayUsingForLoop(result);
	}
}
