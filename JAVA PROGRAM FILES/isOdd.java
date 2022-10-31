package partiallyOpenlabbook;

import java.util.Scanner;

public class isOdd {

	public static void main(String[] args) {
		int num;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=in.nextInt();
		in.close();
		if(isOdd(num)) {
			System.out.println(num+"is a odd number");
		}else {
			System.out.println(num+"is even number");
		}
	}
	static boolean isOdd(int num) {
		boolean n=true;
		if(num%2==0) {
			n=false;
		}
		return  n;
	}
}
