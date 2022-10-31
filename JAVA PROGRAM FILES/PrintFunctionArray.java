package partiallyOpenlabbook;

import java.util.Scanner;

public class PrintFunctionArray {

	public static void main(String[] args) {
		System.out.println("Enter the number of items:");
		Scanner in=new Scanner(System.in);
		final int max=in.nextInt();
		int[] arr=new int[max];
		System.out.println("\nEnter the values of items:");
		if(max>0) {
			for(int i=0;i<max;i++) {
				arr[i]=in.nextInt();
			}
			System.out.println("\n The elements of the arrays are:");
			for(int i=0;i<max;i++) {
				System.out.print(" "+arr[i]);
			}
		}
	}
}
