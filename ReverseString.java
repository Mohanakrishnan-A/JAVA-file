package mohan.day7;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		char ch;
		String rev="";
		System.out.println("Enter the String");
		s=sc.nextLine().toLowerCase();
		for(int i=s.length()-1;i>=0;i--) {
			ch=s.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println("Reverse String ");
		System.out.println(rev);
	}

}
