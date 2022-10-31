package partiallyOpenlabbook;

import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		int dec;
		System.out.println("Enter the decimal number:");
		Scanner in=new Scanner(System.in);
		dec=in.nextInt();
		System.out.println("The Hexadeicmal equivalent is:"+Integer.toHexString(dec));
	}
}
