package partiallyOpenlabbook;

public class ExtractDIgits {

	public static void main(String[] args) {
		int n=54321,rev=0;
	    while(n>0) {
	    	int remainder=n%10;
	    	rev=rev*10+remainder;
	    	int digit = n%10;
	    	n=n/10;
	    }
            System.out.println("The Reverse of the given number is:"+rev);
	}
}
