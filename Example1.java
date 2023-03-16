package mohan.day3;

public class Example1 {

	public static void main(String[] args) {
		int r=4;
		for(int i=1;i<=r;i++) {
			for(int b=1;b<=r;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
