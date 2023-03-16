package mohan.day9;
class parent{
	void display(){
		System.out.println("Display method of parent");
	}
}
class child extends parent{
	void display() {
		super.display();
		System.out.println("Display method of child");
	}
	
}

public class FunctionOverRidding {

	public static void main(String[] args) {
		
		child c=new child();
		c.display();
				
	}

}
