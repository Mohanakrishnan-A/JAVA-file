package mohan.day10;
class Student{
	int sid;
	String sname;
	static String iname;
	static {
		iname="Edubridge India";
	}
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	void display() {
		System.out.println("Student ID : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Institute Name : "+iname);
	}
	static void myStaticMethod(){
		System.out.println("Static method access only static data");
		System.out.println("Institute Name = "+iname);
	}

}

public class Static {

	public static void main(String[] args) {
		Student sob1=new Student(1111, "Mohan");
		Student sob2=new Student(1112, "krishnan");
		Student sob3=new Student(1113, "karthi");
		sob1.display();
		sob2.display();
		sob3.display();
		Student.myStaticMethod();
		
		

	}

}
