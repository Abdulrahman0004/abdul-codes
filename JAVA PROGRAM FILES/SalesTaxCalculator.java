package partiallyOpenlabbook;

import java.util.Scanner;

public class SalesTaxCalculator {

	public static void main(String[] args) {
		final double SALES_TAX_RATE = 0.07;
		final int SENTINEL = -1;
		double price,actualPrice,salesTax;
		double totalPrice = 0.0,totalActualPrice = 0.0,totalSalesTax = 0.0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the tax-inclusive price in dollars(or -1 to end):");
        price=in.nextDouble();
        while(price!=SENTINEL) {
        	salesTax=SALES_TAX_RATE*price;
        	actualPrice=price-salesTax;
        	totalPrice=actualPrice+salesTax;
        	totalActualPrice=actualPrice+actualPrice;
        	totalSalesTax=salesTax+salesTax;
        	System.out.println("Actual price is:$"+String.format("%.2f",actualPrice));
        	System.out.println("Sales Tax is:$"+String.format("%.2f\n",salesTax));
        	System.out.printf("Total price is:%.2f\n",totalActualPrice);
        	System.out.printf("Total Actual price is:%.2f\n",totalActualPrice);
        	System.out.printf("Total sales tax is:%.2f\n",totalSalesTax);
        	System.out.println("Enter the tax-inclusive price in dollars(or -1 to end):");
        	price=in.nextDouble();
        }
        while(price==SENTINEL) {
        	System.out.println("Bye!!...");
        	break;
        }
        }
}