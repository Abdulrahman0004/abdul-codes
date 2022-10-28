package partiallyOpenlabbook;

public class SumAvgRunningWhile {

	public static void main(String[] args) {
		int sum=0;
		double average;
		int number=1;
		while(number<=100) {
			sum+=number;
			number++;
		}
		{
			System.out.println("Sum of 1 to 100 is:"+sum);
			average=sum/100;
			System.out.println("Average is:"+average);
		}


	}

}
