package partiallyOpenlabbook;

import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j|| i+j == n+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int row=0;row<n;row++) {
			for(int column=0;column<n;column++) {
				if(row==0||row==n-1||column==n-1-row) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
