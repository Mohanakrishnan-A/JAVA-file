package mohan.day12;
interface ProductIntf{
	void meth1();
	default void meth2() {
		System.out.println("Default method java 8 feature");
	}
	public static void stameth() {
		System.out.println("Static Method");
	}
}
 

public class Sample2 implements ProductIntf {
	@Override
	public void meth1() {
		System.out.println("m1 ProductIntf method");
		
	}

	public static void main(String[] args) {
		Sample2 sob=new Sample2();
		sob.meth2();
		//sob.stameth();
		Sample2.meth1();
		
	}

	

}
