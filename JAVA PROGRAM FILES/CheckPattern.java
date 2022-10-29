package partiallyOpenlabbook;

import java.util.Scanner;

public class CheckPattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size,row,col;
		System.out.print("Please enter the size:");
		size=in.nextInt();
		for(row=1;row<=size;row++) {
			for(col=1;col<=size;col++) {
				System.out.print(" *");
		}
			System.out.println("\n");
		}
	}
}
