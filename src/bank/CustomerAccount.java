package bank;

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

	public String getAtmPin() {

		return atmPin;

	}

	public String getPassword() {
		return password;
	}

	public String getAccountNumber() {
		return bankAccountNumber;

	}

	public String getCustomerName() {
		return customerName;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}
}
