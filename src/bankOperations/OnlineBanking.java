package bankOperations;

import java.util.Scanner;

public class OnlineBanking extends BankOperations{
	Scanner sc = new Scanner(System.in);
public	void selectOperation() {
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
			break;

		}
	}
}
