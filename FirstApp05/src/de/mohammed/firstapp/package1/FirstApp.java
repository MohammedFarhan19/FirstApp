/**
 * @author mohammed
 * Project name: FirstApp
 * History: 2026
 */
package de.mohammed.firstapp.package1;

import java.awt.geom.Area;

import de.mohammed.firstapp.geometry.Circle;
import de.mohammed.firstapp.geometry.GeometryEngine;
import de.mohammed.firstapp.geometry.Rectangle;
import de.mohammed.firstapp.geometry.Square;

public class FirstApp {

	public static void main(String[] args) {
		
		GeometryEngine geoEngine = new GeometryEngine();
		Rectangle r1 = new Rectangle(101, 23);

		float area = r1.calculateArea();
		System.out.printf("Area: %.2f\n", area);
		
		Square s = new Square(5);
		float sArea = s.calculateArea();
		System.out.println("Square Area: " + sArea);

		s.setSide(6);
		float s2Area = s.calculateArea();
		
		System.out.println("Square Area: " + s2Area);
		
		Circle circle = new Circle(32);
		float circleArea = circle.calculateArea();
		System.out.println("Area: " + circleArea);
		
	}
}
