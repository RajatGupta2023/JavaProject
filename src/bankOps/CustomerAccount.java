package bankOps;

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

	public CustomerAccount() {
		// TODO Auto-generated constructor stub
	}

//	public String getAtmPin() {
//
//		return atmPin;

	//}

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
				//balanceOfRequestedCustomer = customer[i].getCurrentBalance();
				balanceOfRequestedCustomer =customer[i]. currentBalance;
				break;
			}
		}
		return balanceOfRequestedCustomer;

	}
	public String getRequestedCustomerPin(String customerRequested) {
		String pin = null;
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getCustomerName().equals(customerRequested)) {
				pin = customer[i].atmPin;
				break;
			}
		}
		return pin;

	}

	public String getRequestedCustomerAccountPassword(String customerRequested) {
		String password = null;
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getCustomerName().equals(customerRequested)) {
				password = customer[i].getPassword();
				break;
			}
		}
		return password;

	}
}
