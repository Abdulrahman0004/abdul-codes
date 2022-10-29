package partiallyOpenlabbook;

import java.util.Scanner;

public class AverageWithInputValidation {

	public static void main(String[] args) {
		final int NUM_STUDENTS = 3;
		int numberIn;
		boolean isValid;
		int sum=0;
		double average;
		Scanner in=new Scanner(System.in);
		for(int studentNo=1;studentNo<=NUM_STUDENTS;++studentNo) {
			isValid=false;
			do {
				System.out.println("Enter a number between 0-100:");
				numberIn=in.nextInt();
				if(numberIn>=0 && numberIn<=100) {
					isValid=true;
				}else {
					System.out.println("Invalid input,try again");
				}
			}while(!isValid);
			sum+=numberIn;
		}
		average=(double)sum/NUM_STUDENTS;
		System.out.printf("You have entered:%.2f",average);
	}
}
