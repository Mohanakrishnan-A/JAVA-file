package mohan.day8;

import java.util.Scanner;

public class RailwayTicket {
	String name;
	String coach;
	long mobno;
	int amt;
	int totalamt;
	RailwayTicket(){
		name="";
		coach="";
		mobno=0;
		amt=0;
		totalamt=0;
	}
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the coach");
		coach=sc.nextLine();
		System.out.println("Enter the mobile no");
		mobno=sc.nextLong();
		System.out.println("Enter the amount");
		amt=sc.nextInt();
	}
	void update() {
		if(coach.equals("First_AC")) {
			//totalamt=(700+amt);
			System.out.println(totalamt=(amt+700));
			
			
		}
		else if(coach.equals("Second_AC")){
			//totalamt=(500+amt);
			System.out.println(totalamt=(amt+500));
			
		}
		else if(coach.equals("Third_AC")) {
			//totalamt=(250+amt);
			System.out.println(totalamt=(amt+250));
		}
		else if(coach.equals("sleeper")){
			
			System.out.println(totalamt=amt);
		}
	}

	public static void main(String[] args) {
		
		RailwayTicket r=new RailwayTicket();
		r.accept();
		r.update();
	}

}
