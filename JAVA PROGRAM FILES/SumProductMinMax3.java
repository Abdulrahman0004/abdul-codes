package partiallyOpenlabbook;

import java.util.Scanner;
public class SumProductMinMax3 {

	public static void main(String[] args) {
		int number1,number2,number3;
		int sum,product,min,max;
		Scanner in=new Scanner(System.in);
		System.out.println("\n Enter 1st integer:");
		number1=in.nextInt();
		System.out.println("\n Enter 2nd integer:");
		number2=in.nextInt();
		System.out.println("\n Enter 3rd integer:");
		number3=in.nextInt();
		sum=number1+number2+number3;
		product=number1*number2*number3;
		min=number1;
		if(number2<min) {
			min=number2;
		}
		if(number3<min) {
			min=number3;
		}
		else {
			min=number1;
		}
		max=number1;
		if(number2>max) {
			max=number2;
		}
		if(number3>max) {
			max=number3;
		}
		else {
			max=number1;
		}
		System.out.println("The sum is:"+sum);
		System.out.println("The product is:"+product);
		System.out.println("The min is:"+min);
		System.out.println("The max is:"+max);
	}
}
