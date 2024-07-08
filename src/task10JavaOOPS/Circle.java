package task10JavaOOPS;

import java.util.Scanner;

public class Circle {

	double radius;
	static double pi;
	public static void main(String[] args) {
		
		//Initialization of Scanner class
		Scanner in =new Scanner(System.in);
		
		//to get the input of radius
		System.out.println("Enter the radius of the circle");
		double input= in.nextDouble();
		
		//Object creation 
		new Circle();
		
		Circle obj = new Circle(input,pi);
		
		//Circumference of the circle
		System.out.println(""+obj.Circumference(input));
		
		//dereference the object
		in.close();
	}
	
	//constructor with no parameter
	public Circle() {
		pi=3.14;
		System.out.print("The circumference of the circle is ");
	}
	//constructor with two parameter
	public Circle(double input, double pi) {
		radius=input;
		Circle.pi=pi;
	}
	
	//method to calculate circumference of the circle
	public double Circumference(double input) {
		double circumference=2*pi*radius;
		return circumference;
	}
}
