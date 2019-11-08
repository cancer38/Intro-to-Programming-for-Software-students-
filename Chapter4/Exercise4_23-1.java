
import java.util.Scanner;
public class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				System.out.print("Enter Employee's name: ");
				String name = input.next();
				System.out.print("Enter number of hours worked in a week: ");
				double hoursworked = input.nextDouble();
				System.out.print("Enter hourly pay: ");
				double pay = input.nextDouble();
				System.out.print("Enter federal tax rate: ");
				double federal = input.nextDouble();
				System.out.print("Enter state tax rate: ");
				double state = input.nextDouble();
				
				//note the usefulness of setting variables here
				double grossPay = pay * hoursworked;
				double federalTax = grossPay * federal;
				double stateTax = grossPay * state;
				double totalDeduction = federalTax + stateTax;
				double netPay = grossPay - totalDeduction;
				
				System.out.println("Employee name: " + name);
				System.out.println("Hours Worked: " + hoursworked);
				System.out.printf("Pay Rate: " + pay);
				System.out.printf("Gross pay: " + grossPay);
				System.out.println("Deductions: ");
				System.out.printf("\tFed Withholding (" + federal *100 +
						"): " + federalTax);
				System.out.printf("\tState Withholding (" + state *100 +
						"): " + stateTax);
				System.out.println("\tTotal Deduction: " + totalDeduction);
				System.out.println("Net Pay: " + netPay);

	}
}