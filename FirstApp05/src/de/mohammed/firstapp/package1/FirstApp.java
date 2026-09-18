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
		r1.setWidth(10);
		r1.setHeight(25);;
		float area = geoEngine.calculateRectangleArea(r1);
		System.out.println("Area: " + area);
	}
}
