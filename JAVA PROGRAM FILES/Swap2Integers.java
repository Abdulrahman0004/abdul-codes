package partiallyOpenlabbook;

import java.util.Scanner;

public class Swap2Integers {

	public static void main(String[] args) {
	      int number1,number2,temp;
	      Scanner in=new Scanner(System.in);
	      System.out.println("Enter number 1:");
	      number1=in.nextInt();
	      System.out.println("Enter number 2:");
	      number2=in.nextInt();
	      temp=number1;
	      number1=number2;
	      number2=temp;
	      System.out.println("After the swap,first integer is:"+number1+"Second integer is:"+number2);
	}
}