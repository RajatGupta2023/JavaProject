package chocolatesBox;

import java.util.Scanner;

public class ChocolateBoxClass {

	void chocolateBoxFillingMechanism() {
		int currentChocolateCount = 27;

		while (currentChocolateCount <= 63) {

			System.out.println("Current chocolate in box:- " + currentChocolateCount);
			int capacityRemaining = 63 - currentChocolateCount;
			System.out.println("Capcity Remaining:- " + capacityRemaining);

			currentChocolateCount = currentChocolateCount + 5;

		}
		System.out.println("We can not add more chocolates ");
	}

}
