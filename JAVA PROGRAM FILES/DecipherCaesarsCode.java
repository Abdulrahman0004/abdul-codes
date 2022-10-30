package partiallyOpenlabbook;

import java.util.Scanner;

public class DecipherCaesarsCode {

	public static void main(String[] args) {
		final int max=3;
		int numIn;
		int sum=0;
		boolean isvalid = false;
		double average;
		Scanner in=new Scanner(System.in);
		for(int studentNo=1;studentNo<=max;studentNo++)
			isvalid=false;
		do {
			System.out.print("Enter a number between 0-100:");
			numIn=in.nextInt();
			if(numIn>=0 && numIn<=100) {
				isvalid=true;
			}else {
				System.out.println("Invalid input,try again");
			}
		}while(!isvalid);
		     sum+=numIn;
	average=(double)sum/max;
	System.out.printf("You have entered:%.2f",average);
      }
}