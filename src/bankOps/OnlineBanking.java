package bankOps;

public class OnlineBanking extends BankOperations {
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
			System.out.println("Password is successfully changed");

		} else {
			System.out.println("Please enter atleast 8 characters with special characters password");
		}

	}

}
