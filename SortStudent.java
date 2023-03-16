package mohan.day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student01{
	int studentid;
	String studentname;
	float studentfees;
	public Student01(int studentid, String studentname, float studentfees) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentfees = studentfees;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentfees=" + studentfees
				+ "]";
	}
		

}

 class SortStudentName implements Comparator<Student01>{

	@Override
	public int compare(Student01 o1, Student01 o2) {
		
		return o1.studentname.compareTo(o2.studentname);
	}
	
}
 class SortStudentId implements Comparator<Student01>{

	@Override
	public int compare(Student01 o1, Student01 o2) {
		if(o1.studentid>o2.studentid)
			return 1;
		if(o1.studentid<o2.studentid)
			return -1;
		else
		return 0;
	}
	 
 }
 class SortStudentFees implements Comparator<Student01>{

	@Override
	public int compare(Student01 o1, Student01 o2) {
		if(o1.studentfees>o2.studentfees)
			return 1;
		if(o1.studentfees<o2.studentfees)
			return -1;
		else
		return 0;
	}
	 
 }
public class SortStudent {

	public static void main(String[] args) {
		Student01 s1=new Student01(2, "Mohan", 785758.3f);
		Student01 s2=new Student01(3, "Karthi", 67846.4f);
		Student01 s3=new Student01(5, "Manoj", 35266.5f);
		Student01 s4=new Student01(1, "Praveen", 86788.8f);
		ArrayList<Student01> slist=new ArrayList<Student01>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		System.out.println(slist);
		//using iterator
		Iterator<Student01> sit=slist.iterator();
		while(sit.hasNext()) {
			Student01 s=sit.next();
			System.out.println(s.studentid+"\t\t"+s.studentname+"\t\t"+s.studentfees);
		}
			
			//sorting based on name
			SortStudentName sortName=new SortStudentName();
			Collections.sort(slist, sortName);
			System.out.println("After Sorting Name");
			Iterator<Student01> sitname=slist.iterator();
			while(sitname.hasNext()) {
				Student01 s=sitname.next();
				System.out.println(s.studentid+"\t\t"+s.studentname+"\t\t"+s.studentfees);
			}
			
			//based on id
			SortStudentId sortid=new SortStudentId();
			Collections.sort(slist, sortid);
			System.out.println("After Sorting ID");
			Iterator<Student01> sitid=slist.iterator();
			while(sitid.hasNext()) {
				Student01 s=sitid.next();
				System.out.println(s.studentid+"\t\t"+s.studentname+"\t\t"+s.studentfees);
			}

			
			//based on fees
			SortStudentFees sortfees=new SortStudentFees();
			Collections.sort(slist, sortfees);
			System.out.println("After sorting Fees");
			Iterator<Student01> sitfees=slist.iterator();
			while(sitfees.hasNext()) {
				Student01 s=sitfees.next();
				System.out.println(s.studentid+"\t\t"+s.studentname+"\t\t"+s.studentfees);
			}
		
		}

	}


