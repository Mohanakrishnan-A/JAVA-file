package mohan.day17;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hob=new LinkedHashSet<Integer>();
		hob.add(56); 	//not allows duplicate values
		hob.add(89);	//maintains insertion order
		hob.add(56);	//it allows null
		hob.add(70);
		hob.add(null);
		hob.add(89);
		hob.add(80);
		hob.add(null);
		System.out.println(hob);

	}

}
