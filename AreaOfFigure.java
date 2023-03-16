package mohan.day3;

import java.util.Scanner;

public class AreaOfFigure {
	int ar,length,br,ht,side,radius,base;
	float ar1;
	Scanner sc=new Scanner(System.in);
	public void areaRectangle() {
		System.out.println("Enter the length and breadth of a Rectangle : ");
		length=sc.nextInt();
		br=sc.nextInt();
		ar=length*br;
		System.out.println("Area of Rectangle = "+ar);
	}

	public static void main(String[] args) {
		int ch;
		
		AreaOfFigure ob=new AreaOfFigure();
		Scanner sc=new Scanner(System.in);
		System.out.println("********MENU*******");
		System.out.println("Area of Different Figures");
		System.out.println("Enter your choice");
		System.out.println("1.Area Of Rectangle ");
		System.out.println("2.Area Of Square ");
		System.out.println("3.Area Of Triangle ");
		System.out.println("4.Area Of Circle ");
		ch=sc.nextInt();
		switch(ch) {
		case 1:ob.areaRectangle();
		break;
		case 2:ob.areaSquare();
		break;
		case 3:ob.areaTriangle();
		break;
		case 4:ob.areaCircle();
		break;
		}


	}

	private void areaCircle() {
		System.out.println("Enter the radius of a circle ");
		radius=sc.nextInt();
		ar1=3.14159f*radius*radius;
		System.out.println("Area of a Circle is " +ar1);
		
		
	}

	private void areaTriangle() {
		System.out.println("Enter the base and heigth of triangle");
		base=sc.nextInt();
		ht=sc.nextInt();
		ar1=(base*ht)/2;
		System.out.println("Area of Triangle is" +ar1);
		
	}

	private void areaSquare() {
		System.out.println("Enter the sides of a sqaure");
		side=sc.nextInt();
		ar=side*side;
		System.out.println("Arae of a Square is " +ar);
		
	}

	

	
	}

