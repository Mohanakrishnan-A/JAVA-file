package mohan.day6;

public class CompareString {

	public static void main(String[] args) {
		String s="Hell";
		String s1="Hello";
		String s2="Hello";
		String s3="Java";
		System.out.println("Using equals()methods:");
		System.out.println(s1.equals(s2));
		System.out.println(s.equals(s1));
		System.out.println("    ");
		System.out.println("Using == Operator:");
		String s4=new String ("Java");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println("    ");
		System.out.println("By Using compareTo() method: ");
		System.out.println(s.compareTo(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s));

	}

}
