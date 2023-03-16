package mohan.day9;
class A1{
	int pnum;
	/*A1(int j){
		pnum = j ;*/
	A1(int pnum){
		this.pnum=pnum;
		System.out.println("Parent class constructor");
		
	}
}
class B1 extends A1{
	int cnum,sum;
	B1(int i,int j){
		super(j);	//to call parent class constructor from child class
					//use  super key word and super word should be first line in child class
		cnum=i;
		System.out.println("Child class constructor");
		
	}
	void sum() {
		sum=pnum+cnum;
	}
	void display() {
		System.out.println("sum = "+sum);
	}
}


public class InheritanceExample1 {

	public static void main(String[] args) {
		B1 bobj=new B1(10,20);
		bobj.sum();
		bobj.display();

	}

}
