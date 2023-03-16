package mohan.day3;

import java.util.Scanner;

public class AcceptGrade {

	public static void main(String[] args) {
		char grade;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Grade (ex:A,B,C,D) : ");
		grade =sc.next().charAt(0);
		switch(grade) {
		case 'A':System.out.println("Marks Range 90-100 ");
		break;
		case 'B':System.out.println("Marks Range 70-89 ");
		break;
		case 'c':System.out.println("Marks Range 40-69 ");
		break;
		case 'D':System.out.println("Marks Range 0-39 ");
		break;
		default :System.out.println("Invalid Input");
		}
	}

}
