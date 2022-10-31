package partiallyOpenlabbook;

import java.util.Scanner;

public class Exponent {

	public static void main(String[] args) {
		int exp;
		int base;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the base:");
		base=in.nextInt();
		System.out.print("\nEnter the exponent:");
		exp=in.nextInt();
		System.out.print("\n"+base+"raises to the power of"+exp+"is:"+exponent(base,exp));
	}
	public static int exponent(int base,int exp) {
		int product=1;
		for(int run=1;run<=exp;run++) {
			product*=base;
		}
		return product;
	}
}
