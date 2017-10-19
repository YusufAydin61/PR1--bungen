package PÜ1;

import java.util.Scanner;

public class Währungsrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// With this part we can write with our keyboard on the console
		Scanner in = new Scanner(System.in);
		
		// Our variables for the program to calculate		
		double betrag = 0;
		double ergebnis;
		double dollar = 1.34;
		
		/*
		 * The do-while loop runs as long as the variable "betrag" is 0
		 * And if betrag is 0 or negative we get a output and the program is finished
		 */
		do {
			/*
			 *  This is the desired menu
			 *  The output is on the console
			 */
			System.out.println("Bitte wählen Sie aus, welche Währung ausgerechnet werden soll");
			System.out.println("(1) Euro -> Dollar");
			System.out.println("(2) Dollar -> Euro");
			
			//Input function to choose witch currency we want
			int test = in.nextInt();
			
			/*
			 * If you write a 1 in the console the program calculate € in $ with a if-query
			 * The amount must be over 0 to calculate the desired result
			 * But when the amount is under 0 the program gives a output back,
			 * because we want a amount over 0
			 */
			if (test == 1) {
				System.out.println("Geben Sie Ihren € Betrag ein:");
				betrag = in.nextDouble();
				if (betrag > 0) {
					ergebnis = betrag * dollar;
					System.out.println(betrag + "€" + " sind " + ergebnis + "$");
				} 
				else if(betrag< 0)
					System.out.println("Kann nicht berechnet werden, da die eingegebene betrag kleiner als 0 ist");
			}
			
			/*
			 * If you write a 2 in the console, happens the same, just the program calculate
			 * $ in €
			 */
			else if (test == 2) {
				System.out.println("Geben Sie Ihren $ Betrag ein:");
				betrag = in.nextDouble();
				if (betrag > 0) {
					ergebnis = betrag / dollar;
					System.out.println(betrag + "$" + " sind " + ergebnis + "€");
				} 
				else if(betrag < 0)
					System.out.println("Kann nicht berechnet werden, da die eingegebene betrag kleiner als 0 ist");
			} 
			
			else {
				System.out.println("Geben Sie entweder 1 oder 2 ein");
			}
			
		} while (betrag != 0);
		System.out.println("Es kann kein Betrag von 0 oder kleiner errechent werden");
		in.close();
	}
}