package Basic;

import java.util.Scanner;

public class SwapNumberWithTemp {
	
	public static String swapNumbers(int a,int b) {
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
	    return "a: "+a+" b:"+b;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println(" Enter a :");
		int a=scanner.nextInt();
		System.out.println(" Enter b :");
		int b=scanner.nextInt();
		
		System.out.println(swapNumbers(a, b));
	}

}
