package bankOps;

public class ATM extends BankOperations {
	@Override
	public void withdraw(double currentBalance) {
		super.withdraw(currentBalance);
	}

	@Override
	public void deposit(double currentBalance) {
		super.withdraw(currentBalance);
	}

	@Override
	public void viewBalance(double currentBalance) {
		super.withdraw(currentBalance);
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
			System.out.println("Pin is successfully changed");
		}

	}
}
