package mohan.day4;

import java.util.Scanner;

public class PrimeMain {

	public static void main(String[] args) {
		int num,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println(num+" is Prime number");
		}else {
			System.out.println(num+ " is not a prime number");
		}
		

	}

}
