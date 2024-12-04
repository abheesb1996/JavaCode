package Basic;

import java.util.Scanner;

public class SwapNmbersWithoutTemp {
	
	public static String swapNumbers(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		return " a: "+a+" b: "+b;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=scanner.nextInt();
		System.out.println("Enter b: ");
		int b=scanner.nextInt();
		
		System.out.println(swapNumbers(a, b));
	}

}
