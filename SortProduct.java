package mohan.day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Product01{
	int pid;
	String pname;
	float pprice;
	
	public Product01(int pid, String pname, float pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "Product01 [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
}
class SortProductId implements Comparator<Product01>{

	@Override
	public int compare(Product01 o1, Product01 o2) {
		if(o1.pid>o2.pid)
			return 1;
		if(o1.pid<o2.pid)
			return -1;
		else
		return 0;
	}
	
}
class SortProductName implements Comparator<Product01>{

	@Override
	public int compare(Product01 o1, Product01 o2) {
		return o1.pname.compareTo(o2.pname);
	}
	
}
class SortProductPrice implements Comparator<Product01>{

	@Override
	public int compare(Product01 o1, Product01 o2) {
		if(o1.pprice>o2.pprice)
			return 1;
		else if(o1.pprice<o2.pprice)
			return -1;
		else
		return 0;
	}
	
}

public class SortProduct {

	public static void main(String[] args) {
		Product01 p1=new Product01(2,"Air Cooler",54674.45f);
		Product01 p2=new Product01(3, "Television", 65897.98f);
		Product01 p3=new Product01(1, "Washing Machine", 98254.21f);
		Product01 p4=new Product01(8, "Refridgerator", 25124.21f);
		
		ArrayList<Product01> plist=new ArrayList<Product01>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		
		System.out.println(plist);
		
		Iterator <Product01> pit=plist.iterator();
		System.out.println("ProductId\tProductName\t\t\tProductPrice");
		while(pit.hasNext()) {
			Product01 p=pit.next();
			System.out.println(p.pid+"\t\t"+p.pname+"\t\t\t"+p.pprice);
		}
		
		SortProductId sid=new SortProductId();
		Collections.sort(plist, sid);
		System.out.println("After Sorting Id");
		System.out.println(plist);
		
		Iterator <Product01> pitid=plist.iterator();
		System.out.println("ProductId\tProductName\t\t\tProductPrice");
		while(pitid.hasNext()) {
			Product01 p=pitid.next();
			System.out.println(p.pid+"\t\t"+p.pname+"\t\t\t"+p.pprice);
		}
		
		SortProductName sname=new SortProductName();
		Collections.sort(plist, sname);
		System.out.println("After Sorting Name");
		System.out.println(plist);
		
		Iterator <Product01> pitname=plist.iterator();
		System.out.println("ProductId\tProductName\t\t\tProductPrice");
		while(pitname.hasNext()) {
			Product01 p=pitname.next();
			System.out.println(p.pid+"\t\t"+p.pname+"\t\t\t"+p.pprice);
		}
		
		SortProductPrice sprice=new SortProductPrice();
		Collections.sort(plist, sprice);
		System.out.println("After Sorting Price");
		System.out.println(plist);
		
		Iterator <Product01> pitprice=plist.iterator();
		System.out.println("ProductId\tProductName\t\t\tProductPrice");
		while(pitprice.hasNext()) {
			Product01 p=pitprice.next();
			System.out.println(p.pid+"\t\t"+p.pname+"\t\t\t"+p.pprice);
		}

	}

}
