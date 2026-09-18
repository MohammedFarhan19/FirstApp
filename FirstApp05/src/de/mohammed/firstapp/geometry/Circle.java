package de.mohammed.firstapp.geometry;

public class Circle extends Shape{

	private float radius;
	private final float PI = 3.14f;
	
	public Circle(float radius) {
		this.radius = radius;
	}

	public float getPI() {
		return PI;
	}

	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float calculateArea() {
		this.area = PI * this.radius * this.radius;
		return this.area;
	}
	
	public float calculatePerimeter() {
		this.perimeter = 2 * PI * this.radius;
		return this.perimeter;
	}
	
	
}
