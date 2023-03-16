package mohan.day15;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
				System.out.println("Multiclipation Table of ");
				Scanner sc=new Scanner(System.in);
				int a;
				a=sc.nextInt();
				System.out.println("Multiplication Table of "+a);
				for(int num=1;num<=10;num++) {
					System.out.println(a+"X" +num+"="+(num*a));
				}
		 
			}

	}


