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
//		geoEngine.calculateTriangleArea(0, 0);
		
		Rectangle r1 = new Rectangle();
		float area = r1.calculateArea();
		System.out.println("Area: " + area);
		
	}
}
