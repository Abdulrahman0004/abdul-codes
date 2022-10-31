package partiallyOpenlabbook;

import java.util.Scanner;

public class GradesStatistics {

	public static void main(String[] args) {
		final int max;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		max=in.nextInt();
		int[] arr=new int [max];
		double average;
		int temp=0,sum=0,maximum=0,minimum=100;
		for(int idx=0;idx<max;idx++) {
			System.out.println("\nEnter the grade for the student"+idx+":");
			temp=in.nextInt();
			if(temp>maximum) {
				maximum=temp;
			}
			if(temp<minimum) {
				minimum=temp;
			}
			sum=sum+temp;
			arr[idx]=temp;
		}
		average=(double)sum/max;
		System.out.println("The Average of this marks is:"+average);
		System.out.println("The Maximum of this marks is:"+maximum);
		System.out.println("The Minumum of this marks is:"+minimum);
	}
}
