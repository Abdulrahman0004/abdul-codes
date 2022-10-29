package partiallyOpenlabbook;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String inStr;
		String inStrLen="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String:");
        inStr=in.next();
        for(int i=inStr.length()-1;i>=0;i--) {
        inStrLen=inStrLen+inStr.charAt(i);
            System.out.println("The reversed string of the"+ inStr +"is:");
            System.out.println(inStrLen);
        }
	}
}
