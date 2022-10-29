package partiallyOpenlabbook;

import java.util.Scanner;

public class CountVovelsDigits {

	public static void main(String[] args) {
		String line;
		double digit,vowel;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		line=sc.nextLine();
		int vowels=0,digits=0;
		line=line.toLowerCase();
		for(int i=0;i<line.length();++i) {
			 char ch=line.charAt(i);
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='e'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				 ++vowels;
			 }
			 else if(ch>='0' && ch<='9') {
				 ++digits;
			 }
		}
		vowel=vowels/line.length()*100;
		digit=digits/line.length()*100;
		System.out.println("No of Vowels in string:"+ vowels +" "+vowel);
		System.out.println("No of Digits in string:"+ digits +" "+digit);    
	}
}
