package mohan.day4;

//import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {
		int c=0,n=0;
		System.out.println("Prime Numbers Between 1 to 100");
		//Scanner sc=new Scanner(System.in);
		for(int i=2;i<=100;i++) {
			c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c=c+1;
				}
			}
			if(c==2) {
				n++;
				System.out.println(i+"  ");
				
			}
		}
		
		System.out.println("Total number of prime numbers between 1 to 100 is "+n);
	}

}
