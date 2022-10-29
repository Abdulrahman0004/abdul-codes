package partiallyOpenlabbook;

import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		int size,i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=in.nextInt();
		for(i=1;i<=size;i++) {
			System.out.println(" ");
			for(j=1;j<=size;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println(" ");
		}
	}
}
