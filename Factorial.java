package mohan.day4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		long fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of a Given Number "+num+" is "+fact);
	}

}
