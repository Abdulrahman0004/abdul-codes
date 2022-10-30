package partiallyOpenlabbook;

import java.util.Scanner;

public class CaesarsCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the plainText string:");
		String plainText=sc.nextLine();
		System.out.println("\n Enter shift value:");
		int shift=sc.nextInt();
		String ciphertText="";
		char alphabet;
		for(int i=0;i<plainText.length();i++) {
			alphabet=plainText.charAt(i);
			if(alphabet>='a' && alphabet<='z') {
				alphabet=(char)(alphabet+shift);
				if(alphabet>'z') {
					alphabet=(char)(alphabet+'a'-'z'-1);
				    ciphertText = ciphertText + alphabet;
				}else if(alphabet>='A' && alphabet<='Z') {
					alphabet=(char)(alphabet+shift);
				}
				ciphertText=ciphertText + alphabet;
			}else {
				ciphertText=ciphertText+alphabet;
			}
		}
		System.out.println("The ciphertText string is:"+ciphertText);
	}
}
