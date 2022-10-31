package partiallyOpenlabbook;

import java.util.Scanner;

public class radixN2Dec {

	public static void main(String[] args) {
		String str;
		int radix;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the radix:");
		radix=in.nextInt();
		System.out.println("\n Enter the string:");
		str=in.next();
		boolean isValid=true;
		char ch;
		for(int get=0;get<str.length();get++) {
			ch=str.charAt(get);
			if(radix==2) {
				if(!(ch=='0' || ch=='1')) {
					isValid=false;
				}
			}else if(radix==16) {
				if(!(ch<='9'&&ch>='0' || ch<='f'&&ch>='a' || ch<='F'&&ch>='A')) {
					isValid=false;
					break;
				}
			}else {
				if(!(ch=='7' && ch>='0')) {
					isValid=false;
					break;
				}
			}
		}
		if(isValid) {
			int decimal=Integer.parseInt(str,radix);
			System.out.println("The equivalent decimal is "+"\""+str+"\" is:"+decimal);
		}else {
			System.out.println("Error: inValid Radix of "+radix+" string"+str);
		}
	}
}
