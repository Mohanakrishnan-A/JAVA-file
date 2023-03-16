package mohan.day15;

public class MainAppAnno {
	public static void main(String[] args) {
		//annonymous class
		Runnable tob=new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println(6+"x"+i+"="+6*i);
			}
			
		}
		};
		Thread t=new Thread(tob);
		t.start();
     
   }
}
