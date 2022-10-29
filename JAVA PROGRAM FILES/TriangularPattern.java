package partiallyOpenlabbook;

import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
		int size,i,j,k;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=in.nextInt();
		System.out.println(" ");
		for(i=0;i<=size;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
        for(i=0;i<size;i++) {
        	for(j=1;j<size-i;j++){
        		System.out.print(" ");
        	}
        	for(k=0;k<=i;k++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println();
        for(i=0;i<size;i++) {
        	for(j=0;j<size-i;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println();
        for(i=0;i<size;i++) {
        	for(j=0;j<i;j++) {
        		System.out.print(" ");
        	}
        	for(j=size;j>i;j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}
}
