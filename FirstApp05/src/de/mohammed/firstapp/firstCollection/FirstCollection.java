package de.mohammed.firstapp.firstCollection;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.stream.events.Namespace;

import de.mohammed.firstapp.helpers.ArrayEngine;

/**
 * Class about Collection
 * 
 * @author mohammed History: 2026
 * 
 */
public class FirstCollection {

	public static void main(String[] args) {
		/*
		 * ArrayList extends AbstractList extends AbstractCollection extends Object
		 * AbstractCollection implements Collection Collection ist interface extends
		 * (interface)Iterable interface Iterable ist Parent von (Collection <=
		 * AbstractCollection <= AbstractList) AbstractList extends AbstractCollection
		 * implements List List ist interface which extends Collection Iterable ist
		 * interface
		 */
		ArrayEngine arrayEngine = new ArrayEngine();

		ArrayList<String> names = new ArrayList<>();
		names.add("Tim");
		names.add("Sami");
		names.add("Thomas");
		
		arrayEngine.printStringListUsingForEach(names);
	}
}
