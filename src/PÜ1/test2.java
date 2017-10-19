package P‹1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

//		int randNumber = (int)(Math.random()*100);
//		int guess;
//		
//		do {
//			System.out.println("Bitte raten sie die Zahl zwischen 0 und 100");
//			guess = in.nextInt();
//			if(guess > randNumber) {
//				System.out.println("zu groﬂ!");
//			}
//			if(guess<randNumber) {
//				System.out.println("zu klein!");
//			}
//		}
//		while(guess!=randNumber);
//		System.out.println("Jawohl SSSSSSSSSSuper!");
//		for(int i=0;i<=10000000;i=i+1000) {
//			System.out.println(i);
//		}
		System.out.println("Bitte geben sie eine Zahl ein");
		int x = in.nextInt();
		int num;
		double divided;
		int quersumme = 0;
		do {
			num = x%10;
//			divided = ((x+0.5) / 10.0-(int)(x/10))*10;
//			System.out.println(divided);
//			num = (int)divided;
//			System.out.println(num);
			
			x = x/10;
			quersumme += num;
			System.out.println(num);
		}while(x>0);
		System.out.println("Die Quersumme ist " + quersumme);
	}

}
