/**
 * @author mohammed
 * Project name: FirstApp
 * History: 2026
 */
package de.mohammed.firstapp.package1;

import de.mohammed.firstapp.geometry.Circle;
import de.mohammed.firstapp.geometry.Shape;
import de.mohammed.firstapp.geometry.GeometryEngine;
import de.mohammed.firstapp.geometry.Paralleogram;
import de.mohammed.firstapp.geometry.Rectangle;
import de.mohammed.firstapp.geometry.Square;

public class FirstApp {

	public static void main(String[] args) {

		GeometryEngine geoEngine = new GeometryEngine();
		Paralleogram p = new Paralleogram(3, 5);
		System.out.println("Area: " + p.calculateArea());
		System.out.println("Perimeter: " + p.calculatePerimeter());
		
		Shape s = new Circle(5);  // kein Object von abstract class, reference von abstract class
		System.out.println("Circle Area: " + s.calculateArea());
		

	}
}
