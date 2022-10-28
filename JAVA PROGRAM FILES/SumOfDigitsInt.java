package partiallyOpenlabbook;

import java.util.Scanner;

public class SumOfDigitsInt {

	public static void main(String[] args) {
		int number,digit,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		number=in.nextInt();
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
        System.out.println("Sum of all digits:"+sum);
	}
}
