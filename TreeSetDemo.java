
package mohan.day17;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> hob=new TreeSet<Integer>();
		hob.add(56); 	//not allows duplicate values
		hob.add(89);	//follows ascending order
		hob.add(56);
		hob.add(70);
		hob.add(89);
		hob.add(80);
		//hob.add(null); 	// does not allows null values
		System.out.println(hob);


	}

}
