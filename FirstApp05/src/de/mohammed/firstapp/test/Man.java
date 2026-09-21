package de.mohammed.firstapp.test;

/*
 * final class can't be extended
 * like String class, which is final
 */
public final class Man extends Person{

	private String name;
	
	/*
	 * in this Constructor we override the parent Constructor
	 * es macht zuerst den Constructor für den Parent danach der Constructor des Child class
	 */
	public Man() {
//		this.name = name;
		super("Unnkown.");
		System.out.println("FirstChild Constructor");
	}
	
	
	
	@Override
	public void method() {
		System.out.println("Do Someting Special");
	}
	
//	@Override
//	public void again() {
//	
//	}
}
