package mohan.day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int employeeid;
	String employeename;
	float employeesalary;
	
	public Employee(int employeeid, String employeename, float employeesalary) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + "]";
	}
	
}
class SortEmpId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.employeeid>o2.employeeid)
			return 1;
		else if(o1.employeeid<o2.employeeid)
			return -1;
		else
		return 0;
	}
	
}
class SortEmpName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.employeename.compareTo(o2.employeename);
	
	}
	
}
class SortEmpSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.employeesalary>o2.employeesalary)
		return 1;
		else if(o1.employeesalary<o2.employeesalary)
		return -1;
		else
			return 0;
	}
}

public class SortEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "Mohan krish", 45000);
		Employee e2=new Employee(2, "Karthi  ", 44999.9f);
		Employee e3=new Employee(5, "pugazh varman", 45000.78f);
		Employee e4=new Employee(4, "Dinesh kumar", 50152.9f);
		ArrayList<Employee> elist=new ArrayList<Employee>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		System.out.println(elist);
		//using iterator
				Iterator<Employee> eit=elist.iterator();
				System.out.println("Employeeid\tEmployeename\t\tEmployeesalary");
				while(eit.hasNext()) {
					Employee e=eit.next();
					System.out.println(e.employeeid+"\t\t"+e.employeename+"\t\t"+e.employeesalary);
				}
				SortEmpId sid=new SortEmpId();
				Collections.sort(elist, sid );
				System.out.println("After sorting id");
				System.out.println(elist);
				
				
				
				Iterator<Employee> eitid=elist.iterator();
				System.out.println("Employeeid\tEmployeename\t\tEmployeesalary");
				while(eitid.hasNext()) {
					Employee e=eitid.next();
					System.out.println(e.employeeid+"\t\t"+e.employeename+"\t\t"+e.employeesalary);
				}
					
					SortEmpName sname=new SortEmpName();
					Collections.sort(elist, sname);
					System.out.println("After sorting name");
					System.out.println(elist);
					
					Iterator<Employee> eitname=elist.iterator();
					System.out.println("Employeeid\tEmployeename\t\tEmployeesalary");
					while(eitname.hasNext()) {
						Employee e=eitname.next();
						System.out.println(e.employeeid+"\t\t"+e.employeename+"\t\t"+e.employeesalary);
				}
					
					SortEmpSalary ssalary=new SortEmpSalary();
					Collections.sort(elist, ssalary);
					System.out.println("After sorting salary");
					System.out.println(elist);
					
					
					Iterator<Employee> eitsalary=elist.iterator();
					System.out.println("Employeeid\tEmployeename\t\tEmployeesalary");
					while(eitsalary.hasNext()) {
						Employee e=eitsalary.next();
						System.out.println(e.employeeid+"\t\t"+e.employeename+"\t\t"+e.employeesalary);
				}
				}


	}

