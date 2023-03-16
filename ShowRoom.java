package mohan.day8;

import java.util.Scanner;

public class ShowRoom {
	String name;
	long mobileno;
	double cost;
	double amount;
	double dis;
	ShowRoom(){
		name="";
		mobileno=0;
		cost=0;
		dis=0;
		amount=0;
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name");
		name=sc.nextLine();
		System.out.println("Enter Mobile No");
		mobileno=sc.nextLong();
		System.out.println("Enter the cost");
		cost=sc.nextDouble();
	}
	void calculate() {
		if(cost<=10000) {
			dis=(cost*5)/100;
		}
		else if(cost>10000 && cost<=20000) {
			dis=(cost*10)/100;
		}
		else if(cost>20000 && cost<=35000) {
			dis=(cost*15)/100;
		}
		else if(cost>35000) {
			dis=(cost*20)/100;
		}
		
		amount=cost-dis;
	}
	void display() {
		System.out.println("Customer Name : "+name);
		System.out.println("Mobile No : "+mobileno);
		System.out.println("Amount to be paid after dicount : "+amount);
	}
	public static void main(String[] args) {
		
		ShowRoom sob=new ShowRoom();
		sob.input();
		sob.calculate();
		sob.display();
	}

}
