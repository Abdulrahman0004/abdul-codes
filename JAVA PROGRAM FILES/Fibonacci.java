package partiallyOpenlabbook;

public class Fibonacci {

	public static void main(String[] args) {
		int n=3;
		int fn;
		int fnMinus1=1;
		int fnMinus2=2;
		int nMax=20;
		int sum=fnMinus1 + fnMinus2;
		double average;
		System.out.println("The first"+nMax+"Fibonacci numbers are:");
		while(n<=nMax) {
		System.out.println(fnMinus1+", ");
			++n;
			fn = fnMinus1 + fnMinus2;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
		}
		average=fnMinus2/nMax;
		System.out.println("\n The average of series is:"+average);
	}
}
