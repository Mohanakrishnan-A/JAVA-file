package Polymorphism;
class Addition{
	void add(int i,int j) {
		int sum;
		sum=i+j;
		System.out.println("Sum of two integer values="+sum);
	}
	void add(float i,float j) {
		float sum;
		sum=i+j;
		System.out.println("Sum of two float values="+sum);
	}
	void add(double i,double j) {
		double sum;
		sum=i+j;
		System.out.println("Sum of two double values="+sum);
	}
	
}
public class OverLoading {
	

	public static void main(String[] args) {
		Addition a=new Addition();
		
		a.add(8,4 );
		a.add(2.5f, 8.3f);
		a.add(20.2, 25.225);
		

	}

}
