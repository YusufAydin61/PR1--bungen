package PÜ1;

import java.util.Scanner;

public class Währungsrechner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String Test;
		String Test2;
		double betrag = 0;
		double ergebnis;
		double dollar = 1.34;

		System.out.println("Bitte wählen Sie aus, welche Währung ausgerechnet werden soll");
		System.out.println("(1) Euro -> Dollar");
		System.out.println("(2) Dollar -> Euro");
		do {

			int test = in.nextInt();
			if (test == 1) {
				System.out.println("Geben Sie Ihren € Betrag ein:");
				betrag = in.nextDouble();
				if (betrag > 0) {
					ergebnis = betrag * dollar;
					System.out.println(betrag + "€" + " sind " + ergebnis + "$");

				} else if (betrag < 0)
					System.out.println("Kann nicht berechnet werden, da die eingegebene betrag kleiner als 0 ist");
			}

			else if (test == 2) {
				System.out.println("Geben Sie Ihren $ Betrag ein:");
				betrag = in.nextDouble();
				if (betrag > 0) {
					ergebnis = betrag / dollar;
					System.out.println(betrag + "$" + " sind " + ergebnis + "€");

				} else if (betrag < 0)
					System.out.println("Kann nicht berechnet werden, da die eingegebene betrag kleiner als 0 ist");
			}

			else {
				System.out.println("Falsche Eingabe");
				main(args);
			}
			
			System.out.println("Ist noch eine weitere Brechnung notwendig?(J/N) oder (j/n)");
			
			Test = in.nextLine();
			Test2 = in.nextLine();
			
			if(Test2.equals("j") || Test2.equals("J"))
				main(args);
			else if(Test2.equals("n") || Test2.equals("N")) {
				in.close();
				System.out.println("Berechnungen werden beendet");
			}
			
		} while (betrag != 0);
		System.out.println("Es kann kein Betrag von 0 oder kleiner errechent werden");
		in.close();
	}
}