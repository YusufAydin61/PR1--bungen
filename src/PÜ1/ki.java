package PÜ1;

public class ki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = -1;
		int sign = 1;
//		do {
//			System.out.println(i);
//			i = i + 2;
//			System.out.println(j);
//			j = j - 2;
//		} while (i < 100);
		while(i<=100)
		{
			System.out.println(i * sign);
			i++;
			sign = sign * (-1);
		}
	}
}
