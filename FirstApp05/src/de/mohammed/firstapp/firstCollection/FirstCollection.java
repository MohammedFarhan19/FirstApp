package de.mohammed.firstapp.firstCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.stream.events.Namespace;

import de.mohammed.firstapp.helpers.ArrayEngine;

/**
 * Class about Collection
 * 
 * @author mohammed History: 2026
 * 
 */
public class FirstCollection {

	public static void main(String[] args) {
		/*
		 * ArrayList extends AbstractList extends AbstractCollection extends Object
		 * AbstractCollection implements Collection Collection ist interface extends
		 * (interface)Iterable interface Iterable ist Parent von (Collection <=
		 * AbstractCollection <= AbstractList) AbstractList extends AbstractCollection
		 * implements List List ist interface which extends Collection Iterable ist
		 * interface
		 */
		
		List<MeineAutos> meineAutos = new ArrayList<>();
		meineAutos.add(new MeineAutos("Mercedes", 1256.505, true));
		meineAutos.add(new MeineAutos("Opel", 11.702, false));
		meineAutos.add(new MeineAutos("BMW", 500.210, true));
		meineAutos.add(new MeineAutos("Ferrari", 568945.15, false));
		loopUsingForEach(meineAutos);
		System.out.println("************* Reparatur Autos ***************");
		printListUsingStream(meineAutos);
		
	}
	
	/*
	 * BSP. Loop using ForEach just test
	 * print Autos, deren price mehr als 100 ist  
	 */
	public static void loopUsingForEach(List<MeineAutos> meineAutosList) {
		// zuerst erstellen eine List, um später Autos hinzuzufügen
		List<MeineAutos> teureAutos = new ArrayList<>();
		List<MeineAutos> billigeAutos = new ArrayList<>();
				
		for(MeineAutos mAutos : meineAutosList) {
			if(mAutos.getPrice() > 100) {
				teureAutos.add(mAutos);
			} else {
				billigeAutos.add(mAutos);
			}
		}
		System.out.println("************* teuere Autos ***************");
		printList(teureAutos);
		System.out.println("************* billige Autos ***************");
		printList(billigeAutos);
	}

	/**
	 * Method um List auszugeben. benutzen forEach
	 * @param neueAutosList
	 * @return void
	 */
	public static void printList(List<MeineAutos> neueAutosList) {
		for(MeineAutos meineAutos : neueAutosList) {
			System.out.print(meineAutos.getModelName() + " : " + meineAutos.getPrice() + "$\n");
		}
	}
	
	/**
	 * Methode um List auszugeben, benutzen von stream
	 * @param meinAutosList
	 */
	public static void printListUsingStream(List<MeineAutos> meinAutosList) {
		// name der List dann .stream() dann methoden
		// 1- filter station
		meinAutosList.stream()
					 .filter(teuere -> teuere.isReparaturbeduerftig() )
					 .forEach(teuere -> System.out.println(teuere.getModelName()));		 
	}
	
	
	
	
	
	
}
