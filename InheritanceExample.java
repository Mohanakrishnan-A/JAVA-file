package mohan.day9;
class A{
	int pnum;
	A(){
		System.out.println("Parent class constructor");
		pnum=10;
	}
}
class B extends A{
	int cnum,sum;
	B(){
		System.out.println("Child class constructor");
		cnum=9;
	}
	void sum() {
		sum=pnum+cnum;
	}
	void display() {
		System.out.println("sum = "+sum);
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		B bobj=new B();
				bobj.sum();
				bobj.display();

	}

}
