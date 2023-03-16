package mohan.day13;

import java.util.Scanner;

class BankBalance extends Exception{
	public BankBalance(String s) {
		super(s);
	}
}
class Bank{
	float balance;
	public Bank() {
		balance=10000;
	}
	public void withdraw(float wamount) {
		try {
			if(wamount>balance) {
				throw new BankBalance("Insufficient Balance");
			}
			else {
				balance=balance-wamount;
				System.out.println("Bank Balance After Withdraw "+balance);
			}
		}
		catch(BankBalance e){
			e.printStackTrace();
		}
	}
}

public class BankMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount for withdrawal");
		float wamt=sc.nextFloat();
		Bank bob=new Bank();
		bob.withdraw(wamt);
		

	}

}
