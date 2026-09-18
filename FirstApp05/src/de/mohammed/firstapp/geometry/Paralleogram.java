package de.mohammed.firstapp.geometry;

public class Paralleogram extends Shape{
	
	private float sideA;
	private float sideB;
	
	
	
	
	public Paralleogram(float sideA, float sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public float calculatePerimeter() {
		this.perimeter = 2 * (sideA + sideB);
		return this.perimeter;
	}
	
}
