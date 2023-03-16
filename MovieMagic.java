package mohan.day8;

import java.util.Scanner;

public class MovieMagic {
	int year;
	String title;
	float rating;
	 MovieMagic()
	{
		year=0;
		title="";
		rating=0;
	}
	 void accept() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the title of the movie");
		 title=sc.nextLine();
		 System.out.println("Enter the year of release of a movie");
		 year=sc.nextInt();
		 
		 System.out.println("Enter the popularity rating of the movie");
		 rating=sc.nextFloat();
	 }
	 void calculate() {
		 if(rating>0.0 && rating<=2.0) {
			 System.out.println(title+" movie is Flop");
		 }
		 else if(rating>=2.1 && rating<=3.4) {
			 System.out.println(title+" movie is Semi Hit");
		 }
		 else if(rating>=3.5 && rating<=4.5) {
			 System.out.println(title+" movie is Hit");
		 }
		 else if(rating>=4.6 && rating<=5.0) {
			 System.out.println(title+" movie is Super Hit");
		 }
	 }
	

	public static void main(String[] args) {
		MovieMagic m=new MovieMagic();
		m.accept();
		m.calculate();
		
		
	}

}
