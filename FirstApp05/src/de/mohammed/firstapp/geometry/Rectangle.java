package de.mohammed.firstapp.geometry;

public class Rectangle {

	private float width;
	private float height;
	private float perimeter;
	private float area;
	
//	public Rectangle() {
//		//empty Constructor
//	}
	
	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getHeight() {
		return this.height;
	}
	
	public float calculateArea() {
		this.area = this.width * this.height;
		return this.area;
	}
	
	public float calculatePerimeter() {
		this.perimeter = 2 * (this.width + this.height);
		return this.perimeter;
	}
	
}
