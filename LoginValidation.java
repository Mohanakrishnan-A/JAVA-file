package mohan.day6;

import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		String uname,upass;
		System.out.println("Enter user Name and Password");
		Scanner sc=new Scanner(System.in);
		uname=sc.next();
		upass=sc.next();
		
		if(uname.equalsIgnoreCase("mohan") && upass.equals("mohan123") )
		{
			System.out.println("Valid User");
		}
		else
		{
			System.out.println("Invalid User");
		}

	}

}
