package loopsDemo;

import java.util.Scanner;

public class ForLoopExample {
	int actualPIN = 1234;
	int availableBalance = 10000;
	int enteredPIN;
	int withdrawAmount;
	int counter;
	Scanner sc = new Scanner(System.in);

	void checkPinIsCorrect() {
		for (counter = 1; counter <= 3; counter++) {
			System.out.println("Enter the PIN");
			enteredPIN = sc.nextInt();
			if (actualPIN == enteredPIN) {
				System.out.println("Entered PIN is correct");
				System.out.println("Enter the amount to be withdrawn:");
				withdrawAmount = sc.nextInt();

				if (availableBalance > withdrawAmount) {

					System.out.println("Cash withdrawn in amount of: " + withdrawAmount);
				} else {
					System.out.println("Not enough balance");
				}

				break;
			} else {
				System.out.println("Entered PIN is incorrect");
			}
		}
		if (counter == 4) {
			System.out.println("Your Card is blocked");
		} else {
			System.out.println("Thank You For Coming");
		}

		/*
		 * if (availableBalance > withdrawAmount) {
		 * System.out.println("Cash withdrawn in amount of: " + withdrawAmount);
		 * 
		 * } else { System.out.println("Not enough balance"); }
		 */
	}

}
