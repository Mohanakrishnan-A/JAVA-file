package Polymorphism;
class Display
{
	void dis() {
		System.out.println("NO argument");
	}

	void dis(int i) {
		System.out.println("one integer argument "+i);
	}
	
		void dis(float i) {
			System.out.println("one float argument "+i);
		}
		void dis(double i) {
			System.out.println("one double argument "+i);
		}
		void dis(int i,int j) {
			System.out.println("two integer argument "+i+" and "+j);
		}
		void dis(float i,float j) {
			System.out.println("two float argument "+i+" and "+j);
		}
		void dis(double i,double j) {
			System.out.println("two double argument "+i+" and "+j);
		}
		void dis(int i,float j) {
			System.out.println("one integer argument "+i+" and one float argument "+j);
		}
		void dis(int i,double j) {
			System.out.println("one integer argument "+i+" and one double argument "+j);
		}
		void dis(float i,int j) {
			System.out.println("one float argument "+i+" and one int argument "+j);
		}
		void dis(float i,double j) {
			System.out.println("one float argument "+i+" and one double argument "+j);
		}
		void dis(double i,int j) {
			System.out.println("one double argument "+i+" and one integer argument "+j);
		}
		void dis(double i,float j) {
			System.out.println("one double argument "+i+" and one float argument "+j);
		}
}

public class DisplayOverLoading {

	public static void main(String[] args) {
		
		Display d=new Display();
		d.dis();
		d.dis(10);
		d.dis(2.5f);
		d.dis(50.25);
		d.dis(5, 2);
		d.dis(5.3f, 6.2f);
		d.dis(25.32, 34.25);
		d.dis(5, 3.2f);
		d.dis(7, 55.2);
		d.dis(2.3f, 7);
		d.dis(2.3f, 55.2);
		d.dis(55.2, 7);
		d.dis(55.2, 2.3f);
	}

}
