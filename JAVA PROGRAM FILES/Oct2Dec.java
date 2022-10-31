package partiallyOpenlabbook;

import java.util.Scanner;

public class Oct2Dec {

	public static void main(String[] args) {
		String str;
		System.out.print("Enter a Octadecimal string:");
		Scanner in=new Scanner(System.in);
		str=in.next();
		in.close();
		boolean
		isValid=true;
		char ch;
		for(int get=0;get<str.length();get++) {
			ch=str.charAt(get);
			if(!(ch<='7' && ch>='0')) {
				isValid=false;
				break;
			}
		}
		if(isValid)
		{
			int decimal=Integer.parseInt(str,8);
			System.out.println("The equivalent decimal for "+"\" "+str+"\" is:"+decimal);
		}else {
			System.out.println("Error: inValid Octa string"+str);
		}
	}

}
