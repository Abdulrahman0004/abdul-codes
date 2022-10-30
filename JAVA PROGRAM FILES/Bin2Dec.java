package partiallyOpenlabbook;

import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter a binary string:");
		Scanner in=new Scanner(System.in);
		str=in.next();
		boolean
		isValid=false;
		char ch;
		for(int get=0;get<str.length();get++) {
			ch=str.charAt(get);
			if(ch=='0'||ch=='1') {
				isValid=true;
			}else {
				isValid=false;
				break;
			}
		}
		if(isValid) {
			int decimal=Integer.parseInt(str,2);
			System.out.println("The equivalent decimal for "+"\""+str+"\"is:"+decimal);
		}else {
			System.out.println("Error:inValid binary string "+"\""+str+"\"");
		}
	}
}
