package Basic;

import java.util.Scanner;

public class Fibonacci {

	public static void Fibonacii(int num) {
		int f = 0;
		int s = 1;
		int t;

		while (f <= num) {

			System.out.print(f + " ");

			t = f + s;
			f = s;
			s = t;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int num = sc.nextInt();

		Fibonacii(num);
	}

}