package partiallyOpenlabbook;

public class SumAvgRunningDoWhile {

	public static void main(String[] args) {
		int sum=0;
		double average;
		int number=1;
		do {
			sum+=number;
			number++;
		}
		while(number<=100);
		{
			System.out.println("Sum of 1 to 100 is:"+sum);
			average=sum/100;
			System.out.println("Average is:"+average);
		}
	}
}
