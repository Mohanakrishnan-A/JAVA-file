package mohan.day12;
interface f1{
	void m1();
}
interface f2{
	void m2();
}
interface f3 {
	void m3();
}
class Product implements f3,f2,f1{

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 method");
		
	}

	
	
	
}

public class InterfaceSample {

	public static void main(String[] args) {
		Product pob=new Product();
		pob.m1();
		pob.m2();
		pob.m3();

	}

}
