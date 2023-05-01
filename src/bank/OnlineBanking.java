package bank;

import java.util.Scanner;

public class OnlineBanking extends BankOperations{
	Scanner sc = new Scanner(System.in);
	void selectOperation() {
		System.out.println("Please Select the operation you want to perform at online portal \n withdraw \n deposit \n balance");
		String operation = sc.next();
		switch (operation) {
		case "withdraw": {
			withdraw();
			break;
		}
		case "deposit": {
			deposit();
			break;
		}
		case "balance": {
			viewBalance();
			break;
		}
		default:
			System.out.println("Please select from the options ");
			break;

		}
	}
//	@Override
//	void withdraw() {
//		// TODO Auto-generated method stub
//		super.withdraw();
//	}
//	@Override
//	void deposit() {
//		// TODO Auto-generated method stub
//		super.deposit();
//	}
//	@Override
//	void viewBalance() {
//		// TODO Auto-generated method stub
//		super.viewBalance();
//	}
}
