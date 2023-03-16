package mohan.day7;

public class SubString {

	public static void main(String[] args) {
		String s="edubridge";
		for(int i=s.length();i>=0;i--) {
			System.out.println(s.substring(0,i));
		}
		for(int i=0;i<=s.length();i++) {
			System.out.println(s.substring(0,i));
		}
	}

}
