package mohan.day17;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hob=new HashSet<Integer>();
		hob.add(56); 	//not allows duplicate values
		hob.add(89);	//order of insertion is not predictable
		hob.add(56);	//it allows null
		hob.add(null);
		hob.add(70);
		hob.add(89);
		hob.add(80);
		hob.add(null);
		System.out.println(hob);

	}

}
