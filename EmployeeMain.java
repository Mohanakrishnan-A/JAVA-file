package mohan.day16;

import java.util.ArrayList;
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

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "Mohan krish", 45000);
		Employee e2=new Employee(2, "Karthi  ", 44999.9f);
		Employee e3=new Employee(3, "pugazh varman", 45000.78f);
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

	}

}
