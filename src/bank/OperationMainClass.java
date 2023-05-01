package bank;

import java.util.Scanner;

public class OperationMainClass {

	public static void main(String[] args) {
		//BankOperations bankOps = null;
		ATM atm = new ATM();
	OnlineBanking online =	new OnlineBanking();
	CustomerAccount customer = new CustomerAccount();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select the service \n ATM \n Online");
		String selectService = sc.next();
		
		switch (selectService) {
		case "ATM":
			System.out.println("Please enter your ATM PIN");
			int pin = sc.nextInt();
			if (pin==customer.getAtmPin()) {
				atm.selectOperation();
			} else {
				System.out.println("Please enter valid PIN");
			}
			
			break;
		case "Online":
			System.out.println("Please enter your account password");
			String password = sc.next();
			if (password.equals(customer.getPassword())) {
				online.selectOperation();
			} else {
				System.out.println("Please enter valid password");
			}
			
			break;

		default:
			System.out.println("Please select from the options ");
			
			break;
		}

	}

}
