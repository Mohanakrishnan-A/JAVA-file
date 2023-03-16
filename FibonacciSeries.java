package mohan.day15;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of terms to be printed");
		int n1,n2,n3,n;
		n1=1;
		n2=1;
		n=sc.nextInt();
		System.out.println("Fibonacci Series");
		System.out.println(n1);
		System.out.println(n2);
		for(int i=1;i<=n-1;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
