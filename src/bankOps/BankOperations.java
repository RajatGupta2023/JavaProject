package bankOps;

import java.util.Scanner;

public abstract class BankOperations {
	Scanner sc = new Scanner(System.in);
	private CustomerAccount[] customer = new CustomerAccount[5];
	String[] nameList = new String[5];

	public void addCustomerToBank(CustomerAccount newCustomer) {
		for (int i = 0; i < customer.length; i++) {
			if (customer[i] == null) {
				customer[i] = newCustomer;
				break;
			}
		}
	}

	public double getRequestedCustomerAccountBalance(String customerRequested) {
		double balanceOfRequestedCustomer = 0;
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getCustomerName().equals(customerRequested)) {
				balanceOfRequestedCustomer = customer[i].getCurrentBalance();
				break;
			}
		}
		return balanceOfRequestedCustomer;

	}

	public void withdraw(double currentBalance) {
		System.out.println("Please enter withdraw amount");
		int withdrawAmount = sc.nextInt();
		if (withdrawAmount > currentBalance) {
			System.out.println("Not enough Funds");
		} else {
			currentBalance -= withdrawAmount;
		}
		System.out.println("Your current balance is " + currentBalance);
	}

	public void deposit(double currentBalance) {
		System.out.println("Please enter deposit amount");
		int depositAmount = sc.nextInt();
		currentBalance += depositAmount;

		System.out.println("Your current balance is " + currentBalance);
	}

	public void viewBalance(double currentBalance) {
		System.out.println("Your current balance is " + currentBalance);

	}

	public abstract void changePinPassword(String pinPassword);

}
