package de.mohammed.firstapp.geometry;

import de.mohammed.firstapp.exception.MyException;

public class Circle extends Shape {

	private float radius;
	private final float PI = 3.14f;

	public Circle(float radius) throws MyException {
		this.setRadius(radius);
	}

	public float getPI() {
		return PI;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) throws MyException{
		if(radius <= 0) {
			throw new MyException("Invalid radius");
		}
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		this.area = PI * this.radius * this.radius;
		return this.area;
	}

	@Override
	public float calculatePerimeter() {
		this.perimeter = 2 * PI * this.radius;
		return this.perimeter;
	}

}
