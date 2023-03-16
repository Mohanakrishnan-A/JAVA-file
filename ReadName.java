package mohan.day6;

import java.util.Scanner;

public class ReadName {

	public static void main(String[] args) {
		String names[]= new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Names");
		for(int i=0;i<names.length;i++) {
			names[i]=sc.nextLine();
		}
		System.out.println("Entered names are:");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}

	}

}
