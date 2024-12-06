package Basic;

import java.util.Scanner;

public class Fibonacci1 {
	
	public static void fibonacii(int num) {
		int f=0;
		int s=1;
		int t;
		
		int count=0;
		
		while(count<num) {
			System.out.print(f+" ");
						
			t=f+s;
			f=s;
			s=t;
			
			count++;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int num=scanner.nextInt();
		
		fibonacii(num);
		
	}

}
