package de.mohammed.firstapp.firstCollection;

import java.util.ArrayList;
import java.util.List;

public class ThirdCollection {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Tim");
		names.add("Tom");
		names.add("Jan");
		names.add("Sandra");
		
		printListUsingForeach(names);
		System.out.println("================ For Loop =================");
		printUsingForLoop(names);
		System.out.println("================ Stream =================");
		printUsingStream(names);
		System.out.println("================ Stream + start with letter=================");
		printUsingStreamLetter(names, 'S');
	}
	
	
	/**
	 * for each
	 * @param names
	 */
	public static void printListUsingForeach(List<String> names) {
		for(String str : names) {
			System.out.println(str);
		}
	}
	
	/**
	 * For loop
	 * @param names
	 */
	public static void printUsingForLoop(List<String> names) {
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
	
	/**
	 * stream()
	 * @param names
	 */
	static void printUsingStream(List<String> names) {
		names.stream()
			.forEach(n -> System.out.println(n));
	}
	
	/**
	 * Methode => stream() filter() .charAt(0)
	 * @param names
	 * @param letter
	 */
	static void printUsingStreamLetter(List<String> names, char letter) {
		names.stream()
			 .filter(na -> na.charAt(0) == letter)
			 .forEach(na-> System.out.println(na));
	}
	
	
}
