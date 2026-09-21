package de.mohammed.firstapp.test;

/*
 * final class can't be extended
 */
public final class FirstChild extends Parent{

	@Override
	public void method() {
		System.out.println("Do Someting Special");
	}
	
//	@Override
//	public void again() {
//	
//	}
}
