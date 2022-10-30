package partiallyOpenlabbook;

import java.util.Scanner;

public class Hex2Dec {

	public static void main(String[] args) {
		String str;
		System.out.print("Enter a Hexa string:");
		Scanner scan=new Scanner(System.in);
		str=scan.next();
		scan.close();
		boolean
		isValid=true;
		char ch;
		for(int get=0;get<str.length();get++) {
			ch=str.charAt(get);
			if(!(ch<='9' && ch>='0' || ch<='f' && ch>='a' || ch<='F' && ch>='A')) {
				isValid=false;
				break;
			}
		}
		if(isValid) {
			int decimal=Integer.parseInt(str,16);
			System.out.println("The equivalent decimal for "+"\" "+str+"\" is :"+decimal);
		}else {
			System.out.println("Error:inValid HexaDecimal string"+str);
		}
	}
}
