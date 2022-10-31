package partiallyOpenlabbook;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		System.out.print("Enter the number of items:");
		Scanner in=new Scanner(System.in);
		final int max=in.nextInt();
		int[] arr=new int[max];
		System.out.print("\n Enter the value of items:");
		if(max>0)
			for(int i=0;i<=max;i++) {
				arr[i]=in.nextInt();
			}
		print(arr);
	}
	static void print(int[] arr) {
		System.out.print("\n The elements of the arrays are [");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.print("]");
	}
}
