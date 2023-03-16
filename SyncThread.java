package mohan.day15;
class MultiplicationTable{
	synchronized public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"X"+i+"="+n*i);
		}
	}
}
class Myclas extends Thread{
	MultiplicationTable t1;
	public Myclas(MultiplicationTable mtob) {
		this.t1=mtob;
	}
	public void run() {
		t1.printTable(6);
	}
}

class Myclass2 extends Thread{
	MultiplicationTable t2;
	public Myclass2(MultiplicationTable mtob) {
		this.t2=mtob;
		
	}
	public void run() {
		t2.printTable(3);
	}
	
}

public class SyncThread {

	public static void main(String[] args) {
	MultiplicationTable mtob=new MultiplicationTable();
	Myclas ob1=new Myclas(mtob);
	Myclass2 ob2=new Myclass2(mtob);
	ob1.start();
	//ob1.join();
	ob2.start();
	

	}

}
