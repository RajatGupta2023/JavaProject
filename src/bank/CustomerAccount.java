package bank;

public class CustomerAccount {
	private String bankAccountNumber = "123456789";
	private String customerName = "Rajat";
	private double currentBalance = 4560.20;
	private int atmPin = 6686;
	private String password = "Password123";

	int getAtmPin() {

		return atmPin;

	}

	String getPassword() {
		return password;
	}

	String getAccountNumber() {
		return bankAccountNumber;

	}

	String getCustomerName() {
		return customerName;
	}

	double getCurrentBalance() {
		return currentBalance;
	}
}
