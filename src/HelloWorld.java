import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double zahl = 0;
		double zahl2;
		double dollar = 1.34;

		do {
			System.out.println("Bitte wählen Sie aus, welche Währung ausgerechnet werden soll");
			System.out.println("(1) Euro -> Dollar");
			System.out.println("(2) Dollar -> Euro");
			
			int test = in.nextInt();
			if (test == 1) {
				System.out.println("Geben Sie Ihren € Betrag ein:");
				zahl = in.nextDouble();
				if (zahl > 0) {
					zahl2 = zahl * dollar;
					System.out.println(zahl + "€" + " sind " + zahl2 + "$");
				} 
				else if(zahl< 0)
					System.out.println("Kann nicht berechnet werden, da die eingegebene Zahl kleiner als 0 ist");
			}
			
			else if (test == 2) {
				System.out.println("Geben Sie Ihren $ Betrag ein:");
				zahl = in.nextDouble();
				if (zahl > 0) {
					zahl2 = zahl / dollar;
					System.out.println(zahl + "$" + " sind " + zahl2 + "€");
				} 
				else if(zahl < 0)
					System.out.println("Kann nicht berechnet werden, da die eingegebene Zahl kleiner als 0 ist");
			} 
			
			else {
				System.out.println("Geben Sie entweder 1 oder 2 ein");
			}
			
		} while (zahl != 0);
		System.out.println("Es kann kein Betrag von 0 oder kleiner errechent werden");
		in.close();
	}
}