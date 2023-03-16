package mohan.day3;

public class LoopMian {

	public static void main(String[] args) {
		int c=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;++j) {
				//System.out.println("i= "+i+" j= "+j);
				//System.out.println(i+" " +j+" ");
				System.out.print(c+" ");
				c=c+1;
			}
			System.out.println();
		}

	}

}
