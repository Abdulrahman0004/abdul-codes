package partiallyOpenlabbook;

import java.util.Scanner;

public class TestPalindromicWord {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=in.nextLine();
		if(isPalindrome(input)) {
			System.out.println(input+"is a palindrome string");
		}else {
			System.out.println(input+"is not a palindrome string");
		}
		}
	public static boolean isPalindrome(String str) {
		int fidx=0,bidx=str.length()-1;
		while(fidx<bidx) {
			if(str.charAt(fidx)!=str.charAt(bidx)) {
				return false;
			}
			fidx++;
			bidx--;
		}
		return true;
	}
}
