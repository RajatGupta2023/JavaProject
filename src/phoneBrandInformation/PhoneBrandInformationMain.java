package phoneBrandInformation;

import java.util.Scanner;

public class PhoneBrandInformationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Brand name from the following list: 1 Samsung 2 Google 3 Apple");
		String brand = sc.next();
		PhoneBrandInformationClass phone = new PhoneBrandInformationClass();
		

		switch (brand) {
		case "Samsung":
			phone.samsungPhone();
			break;
		case "Google":
			phone.googlePhone();
			break;
		case "Apple":
			phone.applePhone();
			break;
	default:
		System.out.println("Please select brand name from the list");
		}
		

	}

}
