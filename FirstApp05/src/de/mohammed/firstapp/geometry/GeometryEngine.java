package de.mohammed.firstapp.geometry;

public class GeometryEngine {
	
	public float calculateRectangleArea(Rectangle rect){
		return rect.getWidth() * rect.getHeight();
	}
	
	public float calculateTriangleArea(float base, float height){
		return 0.5f * base * height;
	}
	
	// overloading
	public float calculateTriangleArea(float side1, float side2, float angle){
		return 0.5f *side1 * side2;
	}
}
