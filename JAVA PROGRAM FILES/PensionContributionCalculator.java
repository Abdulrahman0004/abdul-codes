package partiallyOpenlabbook;

import java.util.Scanner;

public class PensionContributionCalculator {

	public static void main(String[] args) {
	    final int max_salary=6000;
	    final double EMPLOYEE_AGE_55_AND_BELOW = 0.2;
	    final double EMPLOYER_AGE_55_AND_BELOW = 0.17;
	    final double EMPLOYEE_AGE_55_TO_60 = 0.13;
	    final double EMPLOYER_AGE_55_TO_60 = 0.13;
	    final double EMPLOYEE_AGE_60_TO_65 = 0.075;
	    final double EMPLOYER_AGE_60_TO_65 = 0.09;
	    final double EMPLOYEE_AGE_65_ABOVE = 0.05;
	    final double EMPLOYER_AGE_65_ABOVE = 0.075;
		int salary,age;
		double contributableSalary1,contributableSalary2;
		double employeeContribution,employerContribution,totalContribution;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the salary:$");
		salary=in.nextInt();
		System.out.println("Enter the age:$");
		age=in.nextInt();
		while(salary<=max_salary){
		if(age<=55) {
			contributableSalary1=EMPLOYER_AGE_55_AND_BELOW*100;
			employeeContribution=contributableSalary1/100*salary;
			contributableSalary2=EMPLOYER_AGE_55_AND_BELOW*100;
			employerContribution=contributableSalary2/100*salary;
		}else if(age<=60) {
			contributableSalary1=EMPLOYER_AGE_55_TO_60*100;
			employeeContribution=contributableSalary1/100*salary;
			contributableSalary2=EMPLOYER_AGE_55_TO_60*100;
			employerContribution=contributableSalary2/100*salary;
        }else if(age<=65) {
        	contributableSalary1=EMPLOYER_AGE_60_TO_65*100;
			employeeContribution=contributableSalary1/100*salary;
			contributableSalary2=EMPLOYER_AGE_60_TO_65*100;
			employerContribution=contributableSalary2/100*salary;
        }else {
        	contributableSalary1=EMPLOYER_AGE_65_ABOVE*100;
			employeeContribution=contributableSalary1/100*salary;
			contributableSalary2=EMPLOYER_AGE_65_ABOVE*100;
			employerContribution=contributableSalary2/100*salary;
        }
		totalContribution=employeeContribution+employerContribution;
		System.out.printf("The employee's contribution is:$ %.2f%n",employeeContribution);
        System.out.printf("The employer's contribution is:$ %.2f%n",employerContribution);
        System.out.printf("The total contribution is:$ %2.f%n",totalContribution);
        break;
		}
	}
}