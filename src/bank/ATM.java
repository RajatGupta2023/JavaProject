package bank;

import java.util.Scanner;

public class ATM extends BankOperations {

	Scanner sc = new Scanner(System.in);

	@Override
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

	@Override
	public void deposit(double currentBalance) {
		System.out.println("Please enter deposit amount");
		int depositAmount = sc.nextInt();
		currentBalance += depositAmount;

		System.out.println("Your current balance is " + currentBalance);
	}

	@Override
	public void viewBalance(double currentBalance) {
		System.out.println("Your current balance is " + currentBalance);

	}

	@Override
	public void changePinPassword(String pin) {
		System.out.println("Please enter your new pin");
		String enteredPin = sc.next();

		if (enteredPin.equalsIgnoreCase(pin)) {
			System.out.println("You Entered the old password ");
		} else if (enteredPin.length() != 4) {
			System.out.println("Please enter the 4 digit PIN");
		} else {
			pin = enteredPin;
		}

	}

}
