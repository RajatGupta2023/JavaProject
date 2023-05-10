package bankOps;

import java.util.Scanner;

import bank.ATM;
import bank.BankOperations;
import bank.OnlineBanking;

public class BankOperationsMain {

	public static void main(String[] args) {
		CustomerAccount rajat = new CustomerAccount("123456789", "Rajat", 4105.2, "1234", "Password@123");
		CustomerAccount kanwal = new CustomerAccount("234567891", "Kanwal", 5105.2, "1235", "Password@124");
		CustomerAccount jeel = new CustomerAccount("345678912", "Jeel", 6105.2, "1236", "Password@125");
		CustomerAccount pratik = new CustomerAccount("456789123", "Pratik", 7105.2, "1237", "Password@126");
		CustomerAccount mohit = new CustomerAccount("567891234", "Mohit", 8105.2, "1238", "Password@127");
		CustomerAccount customers[] = { rajat, kanwal, jeel, pratik, mohit };
		CustomerAccount customer = new CustomerAccount();
		for (int i = 0; i < customers.length; i++) {
			customer.addCustomerToBank(customers[i]);

		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter customer name \nRajat \nKanwal \nJeel \nPratik \nMohit");

		String customerRequested = sc.next();
	

		BankOperations bankOps = null;
		System.out.println("Please Select the service \n ATM \n Online");
		String selectService = sc.next();

		if (selectService.equals("ATM")) {
			bankOps = new ATM();
			System.out.println(
					"Please Select the operation you want to perform at ATM \n withdraw \n deposit \n balance \n changepin");
			String operation = sc.next();
			switch (operation) {
			case "withdraw": {
				bankOps.withdraw(customer.getRequestedCustomerAccountBalance(customerRequested));
				break;
			}
			case "deposit": {
				bankOps.deposit(customer.getRequestedCustomerAccountBalance(customerRequested));
				break;
			}
			case "balance": {
				bankOps.viewBalance(customer.getRequestedCustomerAccountBalance(customerRequested));
				break;

			}
			case "changepin": {
				bankOps.changePinPassword(customer.getRequestedCustomerPin(customerRequested));
				break;
			}
			default: {
				System.out.println("Please select from the options ");
				break;

			}
			}
		} else if (selectService.equals("Online")) {
			bankOps = new OnlineBanking();
			System.out.println(
					"Please Select the operation you want to perform at ATM \n withdraw \n deposit \n balance \n changepassword");
			String operation = sc.next();
			switch (operation) {
			case "withdraw": {
				bankOps.withdraw(customer.getRequestedCustomerAccountBalance(customerRequested));
				break;
			}
			case "deposit": {
				bankOps.deposit(customer.getRequestedCustomerAccountBalance(customerRequested));
				break;
			}
			case "balance": {
				bankOps.viewBalance(customer.getRequestedCustomerAccountBalance(customerRequested));
				break;
			}
			case "changepassword": {
				bankOps.changePinPassword(customer.getRequestedCustomerAccountPassword(customerRequested));
				break;
			}
			default: {
				System.out.println("Please select from the options ");
				break;

			}
			}
		} else {
			System.out.println("!Invalid entry");
		}
		
		
		
	} // end of main class

}
