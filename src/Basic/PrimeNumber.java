package Basic;

import java.util.Scanner;

public class PrimeNumber {

	public static String checkPrimeNumber(int num) {
		if (num <= 1) {
			return " It's not a Prime Number ";
		}
		int count = 0;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			return " It's not a Prime Number ";
		} else {
			return " It's a Prime Number ";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check Prime Number Or Not");

		int num = sc.nextInt();

		System.out.println(checkPrimeNumber(num));
	}

}