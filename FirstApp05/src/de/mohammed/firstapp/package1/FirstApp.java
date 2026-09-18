/**
 * @author mohammed
 * Project name: FirstApp
 * History: 2026
 */
package de.mohammed.firstapp.package1;

import java.awt.geom.Area;

import de.mohammed.firstapp.geometry.GeometryEngine;

public class FirstApp {

	public static void main(String[] args) {
		
		GeometryEngine geoEngine = new GeometryEngine();
		float area = geoEngine.calculateRectangleArea(10, 52);
		System.out.println("Area: " + area);
	}
}
