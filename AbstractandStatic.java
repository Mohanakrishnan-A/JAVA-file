package mohan.day10;
abstract class Shape{
	abstract void area();
	void display() {
		System.out.println("Display method of abstract class ");
	}
	static void func() {
		System.out.println("static method");
	}
	
}
class Square extends Shape{
	void area() {
		System.out.println("Square Area");
	}
	
}
public class AbstractandStatic {

	public static void main(String[] args) {
		//Shape ob=new Shape() ;
			
		Square sob=new Square();	
		sob.area();
		sob.display();
		Shape.func();

	}

}

