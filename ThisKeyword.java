package mohan.day9;
class product{
	int pid;
	String pname;
	product(int pid,String pname){
		this.pid=pid;
		this.pname=pname;
	}

void display() {
	System.out.println("Product id="+pid);
	System.out.println("Product name="+pname);
}
	
}

public class ThisKeyword {
	

	public static void main(String[] args) {
		
		product p=new product(11111, "Samsung tv");
		p.display();
	}

}
