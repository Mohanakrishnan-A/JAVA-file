package mohan.edu;
class Product{
	String pname;
	int pid;
	float pprice;
	
	public Product(String string, int i, float f) {
		//constructor with argument
		
		pname=string;
		pid=i;
		pprice=f;
	}

	/*Product(){  //constructor with no arg
		//constructor is used to initialize instance variables of a class
		 //it is called implicitly on creation of an object.
		//Constructor does not have return type
		  //name of the constructor is same name as class
	pname="Samsung TV";
	pid=12312;
	pprice=87612.5f;
	System.out.println("Product name="+pname);
	System.out.println("Product id="+pid);
	System.out.println("Product price="+pprice);
		
	}*/
	
	void displayProduct() {
		System.out.println("Display method");
		System.out.println("Product name="+pname);
		System.out.println("Product id="+pid);
		System.out.println("Product price="+pprice);
	}
}

public class productmain {

	public static void main(String[] args) {
		System.out.println("Main method");
		Product pobj=new Product("Dell Laptop",8765,8723.89f); //it will call constuctor
		pobj.displayProduct();

	}

}
