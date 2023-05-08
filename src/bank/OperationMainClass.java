package bank;

import java.util.Scanner;

public class OperationMainClass {

	public static void main(String[] args) {
		BankOperations bankOps = null;
		CustomerAccount customer1 = new CustomerAccount("123456789", "Rajat", 4105.2, "6686", "Password@123");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select the service \n ATM \n Online");
		String selectService = sc.next();

		if (selectService.equals("ATM")) {
			bankOps = new ATM();
			System.out.println(
					"Please Select the operation you want to perform at ATM \n withdraw \n deposit \n balance \n changepin");
			String operation = sc.next();
			switch (operation) {
			case "withdraw": {
				bankOps.withdraw(customer1.getCurrentBalance());
				break;
			}
			case "deposit": {
				bankOps.deposit(customer1.getCurrentBalance());
				break;
			}
			case "balance": {
				bankOps.viewBalance(customer1.getCurrentBalance());
				break;

			}
			case "changepin": {
				bankOps.changePinPassword(customer1.getAtmPin());
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
				bankOps.withdraw(customer1.getCurrentBalance());
				break;
			}
			case "deposit": {
				bankOps.deposit(customer1.getCurrentBalance());
				break;
			}
			case "balance": {
				bankOps.viewBalance(customer1.getCurrentBalance());
				break;
			}
			case "changepassword": {
				bankOps.changePinPassword(customer1.getPassword());
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

	}

}
