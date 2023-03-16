package mohan.day13;

public class TryCatch {

	public static void main(String[] args) {
		int a=10, b=2,c=0;
		int ar[]=new int [5];
		System.out.println("Before operation");
		try {
			c=a/b;
			ar[10]=12;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block will executes always");
			System.out.println("used for resource closing");
		}
		System.out.println("after operation");
		System.out.println("c="+c);
		System.out.println("ar[3]="+ar[3 ]);
	}

}
