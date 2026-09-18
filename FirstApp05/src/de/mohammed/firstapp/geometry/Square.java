package de.mohammed.firstapp.geometry;

public class Square {

	private float side;
	private float area;
	private float perimeter;

	public Square(float side) {
		this.side = side;
	}

	public float getSide() {
		return this.side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	
	public float calculateArea() {
		this.area = this.side * this.side;
		return this.area;
	}
	
	public float calculatePerimeter() {
		this.perimeter = 4 * this.side;
		return this.perimeter;
	}
	
}
