package PÜ1;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		// With this part we can write with our keyboard on the console
		Scanner in = new Scanner(System.in);
		
		// Our variables for the program to calculate
		double betrag = 0;
		double ergebnis;
		double dollar = 1.34;		
		
		/*
		 *  This is the desired menu
		 *  The output is on the console
		 */
		System.out.println("Bitte wählen Sie aus, welche Währung ausgerechnet werden soll");
		System.out.println("(1) Euro -> Dollar");
		System.out.println("(2) Dollar -> Euro");
		
		//Input function to choose witch currency we want
		int auswahl = in.nextInt();
		switch (auswahl) {
		
		/*
		 * At the case 1 the program calculate € in $ with a if-query
		 * The amount must be over 0 to calculate the desired result
		 * But when the amount is under 0 the program gives a output back,
		 * because we want a amount over 0
		 */
		case 1:
				System.out.println("Geben Sie Ihren € Betrag ein:");
				betrag = in.nextDouble();
				if (betrag > 0) {
					ergebnis = betrag * dollar;
					System.out.println(betrag + "€" + " sind " + ergebnis + "$");
				} 
				else if(betrag< 0)
					System.out.println("Kann nicht berechnet werden, da die eingegebene betrag kleiner als 0 ist");
				break;
		
		/*
		 * The case 2 is same like the case 1 , but here we have $ to €
		 */
		case 2:
				System.out.println("Geben Sie Ihren $ Betrag ein:");
				betrag = in.nextDouble();
				if(betrag > 0) {
					ergebnis = betrag / dollar;
					System.out.println(betrag + "$" + " sind " + ergebnis + "€");
				}
				else if(betrag< 0)
					System.out.println("Kann nicht berechnet werden, da die eingegebene betrag kleiner als 0 ist");
				break;
		
		//We get a output, when we write number between 1 and 2		 
		default: 
				System.out.println("Geben Sie entweder 1 oder 2 ein");
				break;
		}
		
		System.out.println("Ist noch eine weitere Brechnung notwendig?(J/N) oder (j/n)");
		String ki = in.nextLine();
		String ki2 = in.nextLine();

		/*
		 *  The if-query, when we want to calculate a other amount
		 *  If we write a "j" or a "J" the main function calls itself
		 *  But when we write a "n" or a "N" the program will be finished
		 *  With a wrong input the program will end
		 */
		if(ki2.equals("j") || ki2.equals("J")) {
			main(args);
		}
		
		else if(ki2.equals("n") || ki2.equals("N")) {
			System.out.println("Es folgen keine weitere Berechnungen");
			in.close();
		}
		else {
			System.out.println("Falsche Eingabe, Programm wird beendet");
			in.close();
		}

		
//		do {
//			System.out.println("Bitte wählen Sie aus, welche Währung ausgerechnet werden soll");
//			System.out.println("(1) Euro -> Dollar");
//			System.out.println("(2) Dollar -> Euro");
//			
//			if (auswahl == 1) {
//			}
//			System.out.println("auswahl");
//			auswahl = in.nextLine();
//		}
//		
//		while(betrag != 0 || auswahl.equals("n") || auswahl.equalsIgnoreCase("N"));
//		System.out.println("Es folgen keine weitere Berechnungen");
//		in.close();
	}

}
