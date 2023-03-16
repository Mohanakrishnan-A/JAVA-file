package mohan.day7;

public class StringFuncts {

	public static void main(String[] args) {
		String s="edubridge india pvt ltd";
		char ch[]=new char[10];
		s.getChars(10, 15, ch, 0);
		System.out.println("Extracted String"+ch);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}

}
