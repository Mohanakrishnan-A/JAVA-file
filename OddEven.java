package mohan.day3;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num= sc.nextInt();
		int a=num%2;
		switch (a) {
		case 1: 
			System.out.println("Given Number " +num+ " is ODD number ");
			break;
		case 0: 
			System.out.println("Given Number " +num+ " is EVEN number ");
			break;
		}
	}

}
