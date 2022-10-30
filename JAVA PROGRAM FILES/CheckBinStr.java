package partiallyOpenlabbook;

import java.util.Scanner;

public class CheckBinStr {

	public static void main(String[] args) {
		int r=0,c=0,num,b;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter a binary string:");
		num=s1.nextInt();
		b=num;
		while(num>0) {
			if((num%10==0)||(num%10==1)) {
				c++;
				r++;
				num=num/10;
			}
			if(c==r)
				System.out.println("\""+b+"\""+"is a binary number.");
			else
				System.out.println("\""+b+"\""+"is not a binary number");		
		}
	}
}
