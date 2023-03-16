package mohan.day17;

import java.util.ArrayList;
import java.util.Iterator;



class Employ{
	private int eid;
	private String ename;
	private float esalary;
	// generating getter and setter method by right click source 
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	//generating toString
	@Override
	public String toString() {
		return "Employ [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}

public class EmployeePrivate {

	public static void main(String[] args) {
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();
		Employ e4=new Employ();
		
		e1.setEid(1);
		e1.setEname("Mohan krish");
		e1.setEsalary(89992.45f);
		
		e2.setEid(2);
		e2.setEname("NS Karthi");
		e2.setEsalary(82992.45f);
		
		e3.setEid(3);
		e3.setEname("Pugazh varman");
		e3.setEsalary(80192.45f);
		
		e4.setEid(4);
		e4.setEname("Dinesh kumar");
		e4.setEsalary(76992.45f);
		
		//add employee object to arraylist
		ArrayList<Employ> elist= new ArrayList<Employ>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		
		//display
		System.out.println(elist);
		
		//using iterator
		Iterator<Employ> eit=elist.iterator();
		System.out.println("Employeeid\tEmployeeName\tEmployeesalary");
		System.out.println("---------------------------------------------------");
		while(eit.hasNext()) {
		Employ eob=eit.next();
		System.out.println(eob.getEid()+"\t\t"+eob.getEname()+"\t\t"+eob.getEsalary());
	}
	}

}
