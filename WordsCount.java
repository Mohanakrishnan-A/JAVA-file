package mohan.day7;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		int wc=1; //to include starting word
		String s;
		System.out.println("Enter the String");
		s=sc.nextLine().toLowerCase();
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch==' ') {
				//wc=wc+1;
				wc++;
			}
		}
			//wc++;		//it is incremented because to count the starting word otherwise ans will be -1
			System.out.println("No of words in a given String : "+wc);
	}

}
