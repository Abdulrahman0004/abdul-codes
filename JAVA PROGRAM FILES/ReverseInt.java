package partiallyOpenlabbook;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int inNumber;
		int inDigit=0;
		System.out.println("Enter a positive number:");
		inNumber=in.nextInt();
		while(inNumber>0) {
			int remain=inNumber%10;
			inDigit = inDigit*10+remain;
			inNumber/=10;
		}
        System.out.println("The reverse of the integer is:"+inDigit);
	}
}
