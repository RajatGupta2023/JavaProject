package bank;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {
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
	public void changePinPassword(String password) {
		char[] specialChars = { '&', '$', '@' };
		boolean isPresent = false;
		System.out.println("Please enter new password");
		String newPassword = sc.next();
		if (newPassword.equals(password)) {
			System.out.println("You entered old password");

		}

		for (int i = 0; i < specialChars.length; i++) {
			if (newPassword.contains(Character.toString(specialChars[i]))) {
				isPresent = true;
				break;
			}
		}
		if (newPassword.length() >= 8 & (isPresent)) {
			password = newPassword;

		} else {
			System.out.println("Please enter atleast 8 characters with special characters password");
		}

	}
}
