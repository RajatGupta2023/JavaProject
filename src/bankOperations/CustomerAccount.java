package bankOperations;

public class CustomerAccount {
	private String bankAccountNumber;
	private String customerName;
	private double currentBalance;
	private String atmPin;
	private String password;

	public CustomerAccount(String bankAccountNumber, String customerName, double currentBalance, String atmPin,
			String password) {
		this.bankAccountNumber = bankAccountNumber;
		this.customerName = customerName;
		this.currentBalance = currentBalance;
		this.atmPin = atmPin;
		this.password = password;
	}
	String getAtmPin() {

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
