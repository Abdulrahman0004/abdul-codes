package partiallyOpenlabbook;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		int i,j,row;
		int num=1;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		row=in.nextInt();
		for(i=0;i<row;i++) {
			for(j=0;j<=1;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<row;i++) {
			for(j=0;j<row-i;j++) {
				System.out.print(num++);
			}
			num=1;
			System.out.println();
		}
		System.out.println();
		for(i=0;i<row;i++) {
			for(j=1;j<row-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(num++);
			}
			num=1;
			System.out.println();
		}
		System.out.println();
		for(i=0;i<row;i++) {
			System.out.print(" ");
		}
		for(j=0;j<row-i;j++) {
			System.out.print(num++);
		}
		num=1;
		System.out.println();
	}
}
