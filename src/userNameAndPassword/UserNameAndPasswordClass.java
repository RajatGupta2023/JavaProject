package userNameAndPassword;

import java.util.Scanner;

public class UserNameAndPasswordClass {
	void comapreuserNameAndPassword() {
		int counter;
		Scanner sc = new Scanner(System.in);
		for (counter = 1; counter <= 3; counter++) {

			System.out.print("Enter a user name ");
			String userId = sc.next();

			if (userId.equals("pivotAdmin")) {
				System.out.println("Enter password");
				String password = sc.next();
				boolean s1 = password.equals("Admin123");
				if (s1) {

					break;
				} else {
					System.out.println("Wrong Password");

				}
			} else {
				System.out.println("Incorrect User id or password.Try again");
			}

		}
		if (counter == 4) {
			System.out.println("Account locked");
		} else {
			System.out.println("You are logged in to the application");
		}

	}
}
