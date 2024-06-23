package task10JavaOOPS;

import java.util.Scanner;

public class Circle {

	double radius;
	static double pi;
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		double input= in.nextDouble();
		
		new Circle();
		Circle obj = new Circle(input,pi);
		
		System.out.println(""+obj.Circumference(input));
		in.close();
	}
	public Circle() {
		pi=3.14;
		System.out.print("The circumference of the circle is ");
	}
	public Circle(double input, double pi) {
		radius=input;
		Circle.pi=pi;
	}
	
	public double Circumference(double input) {
		double circumference=2*pi*radius;
		return circumference;
	}
}
