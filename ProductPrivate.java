package mohan.day17;

import java.util.ArrayList;
import java.util.Iterator;

class Product{
	private int pid;
	private String pname;
	private float pprice;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPprice() {
		return pprice;
	}
	public void setPprice(float pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
	
}

public class ProductPrivate {

	public static void main(String[] args) {
		
		Product p1=new Product();
		Product p2=new Product();
		
		p1.setPid(1);
		p1.setPname("TV");
		p1.setPprice(45598.21f);
		
		p2.setPid(2);
		p2.setPname("Washing Machine");
		p2.setPprice(65245.12f);
		
		ArrayList<Product> plist=new ArrayList<Product>();
		 plist.add(p1);
		 plist.add(p2);
		 
		 Iterator<Product> pit=plist.iterator();
		 System.out.println("ProductId\tProductName\tProductPrice");
		 while(pit.hasNext()) {
			 Product pob=pit.next();
			 System.out.println(pob.getPid()+"\t\t"+pob.getPname()+"\t\t"+pob.getPprice());
			
			 
		 }
		
	}

}
