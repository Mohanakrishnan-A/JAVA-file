package mohan.day15;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number The Number");
		Scanner sc=new Scanner(System.in);
		int n;
		long fact=1;
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of the given number is "+fact);

	}

}
