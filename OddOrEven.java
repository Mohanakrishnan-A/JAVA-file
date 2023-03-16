package mohan.day15;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n;
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("The Given Number "+n+" Is Even Number");
		}
		else {
			System.out.println("The Given Number "+n+" Is Odd Number");
		}

	}

}
