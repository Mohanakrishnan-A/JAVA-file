package mohan.day4;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int num,digit,rev=0,copynum;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		num=sc.nextInt();
		copynum=num;
		while(num!=0) {
			digit=num%10;
			//System.out.print(digit);
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reverse number is "+rev);
		if(rev==copynum) {
			System.out.println("Given number is Palindrome");
		}else {
			System.out.println("Given number is not a Palindrome");
		}

	}

}
