package bankOperations;

import java.util.Scanner;

import bank.CustomerAccount;

public class OperationsMainClass {

	public static void main(String[] args) {
		BankOperations bankOps = null;

		CustomerAccount customer1 = new CustomerAccount("123456789", "Rajat", 4105.2, "6686", "Password@123");
				Scanner sc = new Scanner(System.in);
				System.out.println("Please Select the service \n ATM \n Online");
				String selectService = sc.next();
				
				switch (selectService) {
				case "ATM":
					bankOps = new ATM();
					System.out.println("Please enter your ATM PIN");
					String pin = sc.next();
					if (pin.equals(customer1.getAtmPin())) {
						bankOps.selectOperation();
					} else {
						System.out.println("Please enter valid PIN");
					}
					
					break;
				case "Online":
					bankOps = new OnlineBanking();
					System.out.println("Please enter your account password");
					String password = sc.next();
					if (password.equals(customer1.getPassword())) {
						bankOps.selectOperation();
					} else {
						System.out.println("Please enter valid password");
					}
					
					break;

				default:
					
					break;
				}



	}

}
