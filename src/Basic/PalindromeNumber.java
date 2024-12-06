package Basic;

import java.util.Scanner;

public class PalindromeNumber {

	public static String checkPalindromeNumber(int num) {
		int rem = 0;
		int rev = 0;
		int temp = num;

		if (num > 0) {
			while (num > 0) {
				rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			if (rev == temp) {
				return "Its a Palindrome Number ";
			} else {
				return "Its not a Palindrome Number ";
			}
		} else {
			return "Not a palindrome number";
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check Palindrome Number Or Not");

		int num = sc.nextInt();

		System.out.println(checkPalindromeNumber(num));	}

}
