package partiallyOpenlabbook;

import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {

	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K=0.1;
		final double TAX_RATE_ABOVE_40K=0.2;
		final double TAX_RATE_ABOVE_60K=0.3;
		final int SENTINEL=-1;
		int taxableIncome;
		double taxPayable,taxPayableOutput;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the taxable income(or -1 to end):$");
		taxableIncome=in.nextInt();
		while(taxableIncome!=SENTINEL) {
		if(taxableIncome<=20000) {
			taxPayableOutput=taxableIncome*0;
		}else if(taxableIncome>20000 && taxableIncome<40000) {
			taxPayable=(taxableIncome-20000)+5000;
			taxPayableOutput=TAX_RATE_ABOVE_20K*taxPayable;
		}else if(taxableIncome>40000 && taxableIncome<60000){
			taxPayable=(taxableIncome-40000)+10000;
			taxPayableOutput=TAX_RATE_ABOVE_40K*taxPayable;
		}else {
			taxPayable=(taxableIncome-60000)+20000;
			taxPayableOutput=TAX_RATE_ABOVE_60K;
		}
		 System.out.printf("The income tax payable is: $%.2f%n",taxPayableOutput);
		 System.out.println("Enter the taxable income(or -1 to end):$");
		 taxableIncome=in.nextInt();
		 while(taxableIncome==SENTINEL) {
			 System.out.println("Byee!!...");
			 break;
		 }
		}
	}
}

