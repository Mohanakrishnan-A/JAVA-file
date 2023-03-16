package mohan.day8;

import java.util.Scanner;

public class ElectricBill {
	String n;
	int units;
	double bill;
	double surcharge;
	ElectricBill(){
		n="";
		units=0;
		bill=0;
		//surcharge=0f;
	}
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name");
		n=sc.nextLine();
		System.out.println("Enter Number of units consumed");
		units=sc.nextInt();
		
		}
	void calculate() {
		if(units<100) {
			bill=units*2.0;
		}
		else if(units>100 && units<=300) {
			bill=(100*2.0)+(units-100)*3.0;
		}
		else if(units>300) {
			bill=(100*2.0)+(200*3.0)+(units-300)*5;
			surcharge=(bill*2.5)/100;
			bill=bill+surcharge;
		}
	}
	void display() {
		System.out.println("Nmae of the customer : "+n);
		System.out.println("Number of units consumed : "+units);
		System.out.println("Bill amount : "+bill);
	}

	public static void main(String[] args) {
		ElectricBill e=new ElectricBill();
		e.accept();
		e.calculate();
		e.display();

	}

}
