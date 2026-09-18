/**
 * @author mohammed
 * Project name: FirstApp
 * History: 2026
 */
package de.mohammed.firstapp.package1;

import java.awt.geom.Area;

import de.mohammed.firstapp.geometry.GeometryEngine;
import de.mohammed.firstapp.geometry.Rectangle;

public class FirstApp {

	public static void main(String[] args) {
		
		GeometryEngine geoEngine = new GeometryEngine();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(25);
		
		r2.setWidth(r1.getWidth());
		r2.setHeight(r1.getHeight());
		
		float area = geoEngine.calculateRectangleArea(r1);
		float area2 = geoEngine.calculateRectangleArea(r2);

		System.out.println("Area: " + area);
		System.out.println("Area2: " + area2);
		
	}
}
