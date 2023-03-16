package mohan.day15;
class Myclass1 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Run method "+Thread.currentThread());
			try {
				System.out.println("Inside sleep method");
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class MainAppRunnable {

	public static void main(String[] args) throws InterruptedException
	{
		Myclass1 ob1=new Myclass1();
		Thread tob1=new Thread(ob1);
		
		Myclass1 ob2=new Myclass1();
		Thread tob2=new Thread(ob2);
		
		tob1.setName("First");
		tob2.setName("Second");
		
		tob1.start();
		tob2.start();

	}

}
