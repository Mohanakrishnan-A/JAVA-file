package mohan.day10;
class  Employee{
	Employee(){
		System.out.println("Employee");
	}
	
	
		void display() {
		System.out.println("Display method employee");
	}
	
}

class HR extends Employee{
	final int i=90;
	void display() {
		System.out.println("Display method HR"+i);
		//i=i+1;
	}
	
}

public class Final {

	public static void main(String[] args) {
		
HR obj=new HR();
obj.display();

	}

}
