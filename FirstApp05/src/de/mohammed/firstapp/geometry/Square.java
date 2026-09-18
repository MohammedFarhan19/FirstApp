package de.mohammed.firstapp.geometry;

public class Square {

	private float side;

	public float getSide() {
		return this.side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	
	public float calculateArea() {
		return this.side * this.side;
	}
	
}
