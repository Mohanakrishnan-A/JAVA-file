package mohan.day9;
class prod{
	int pid;
	String pname;
	prod(int pid,String pname){	//pid=1111 pname="samsung tv"
		this(pid);
		System.out.println("Two argument constructor");
		this.pname=pname;
	}
	prod(int pid){
		this.pid=pid;
		System.out.println("One argument constructor");
	}

void display() {
	System.out.println("Product id="+pid);
	System.out.println("Product name="+pname);
}
	
}

public class ThisKeyword1 {
	

	public static void main(String[] args) {
		
		prod p=new prod(11111, "Samsung tv");	//calls two argument constructor
		p.display();
	}

}



