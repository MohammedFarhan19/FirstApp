package de.mohammed.firstapp.test;

public class Person {

	private String name;
	
	
	public Person() {
	}

	public Person(String name) {
		this.name = name;
		System.out.println("Parent Constructor : " + name);
	}

	public Person(String name, String familyName) {
		this.name = name;
		System.out.println("Parent Constructor: " + name + " " + familyName);
	}
	

	public void method() {
		System.out.println("Do nothing...");
	}
	
	public final void again() {
		System.out.println("again.....");
	}
}
