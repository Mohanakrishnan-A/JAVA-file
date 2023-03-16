package mohan.day7;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		//String m="Mohanakrishnan".toLowerCase();
		Scanner sc=new Scanner(System.in);
		char ch;
		int vc=0;
		String s;
		System.out.println("Enter the String");
		s=sc.nextLine().toLowerCase();
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vc=vc+1;
			}
		}
		System.out.println("No of vowels in given string = "+vc);

	}

}
