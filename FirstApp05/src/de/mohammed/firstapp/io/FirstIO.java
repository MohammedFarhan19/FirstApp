package de.mohammed.firstapp.io;

/**
 * @author moham
 * Class über Input Output Stream
 * History : 2026
 * Stream ist wie ein Rohr, in dem was fließt (z.B. Wasser, Strom)
 * an diesem Rohr ist ein Ventil angeschlossen, mit dem der Fluß kontrolliert wird
 * öffenen vs. schließen
 */
public class FirstIO {

	public static void main(String[] args) {
		
		//[1] INPUT
		int number = 23;
		
		//[2] PROCESSING
		String message = "";
		if(number % 2 == 0) {
			message = "EVEN";
		} else {
			message = "ODD";
		}
		
		//[3] OUTPUT
		System.out.println(message);
	}
}
