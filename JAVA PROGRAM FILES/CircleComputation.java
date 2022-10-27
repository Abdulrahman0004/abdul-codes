package partiallyOpenlabbook;

import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		double radius,diameter,circumference,area;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius=in.nextDouble();
		diameter=2.0*radius;
		area=Math.PI*radius*radius;
		circumference=2.0*Math.PI*radius;
		System.out.printf("Diameter is:%.2f%n",diameter);
		System.out.printf("Area is:%.2f%n",area);
		System.out.printf("Circumference is:%.2f%n",circumference);
	}
}
