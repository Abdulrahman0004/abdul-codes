package partiallyOpenlabbook;

import java.util.Scanner;

public class Add2Integers {

	public static void main(String[] args) {
		int number1,num2;
		int sum;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first integer:");
		number1=in.nextInt();
		System.out.println("Enter second integer:");
		num2=in.nextInt();
		in.close();
		sum=number1+num2;
		System.out.println();
		System.out.println("The sum is:"+sum);
	}
}
