package mohan.day17;

import java.util.ArrayList;
import java.util.Iterator;



class Student{
	private int studentid;
	private String studentname;
	private float studentfees;
	
	
	public int getStudentid() {
		return studentid;
	}


	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}


	public String getStudentname() {
		return studentname;
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}


	public float getStudentfees() {
		return studentfees;
	}


	public void setStudentfees(float studentfees) {
		this.studentfees = studentfees;
	}


	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentfees=" + studentfees
				+ "]";
	}
		

}
public class StudentPrivate {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		 
		
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		s1.setStudentid(1);
		s1.setStudentname("Mohan Krish");
		s1.setStudentfees(45679);
		
		s2.setStudentid(2);
		s2.setStudentname("NS Karthi");
		s2.setStudentfees(43679.25f);
		
		s3.setStudentid(3);
		s3.setStudentname("Pugazh varman");
		s3.setStudentfees(35679.54f);
		
		s4.setStudentid(4);
		s4.setStudentname("Dinesh kumar");
		s4.setStudentfees(65679);
		
		System.out.println(slist);
		//using iterator
		Iterator<Student> sit=slist.iterator();
		while(sit.hasNext()) {
			Student s=sit.next();
			System.out.println(s.getStudentid()+"\t\t"+s.getStudentname()+"\t\t"+s.getStudentfees());
		}
		
		


	}
}
