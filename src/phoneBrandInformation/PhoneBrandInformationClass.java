package phoneBrandInformation;

import java.util.Scanner;

public class PhoneBrandInformationClass {
	Scanner sc = new Scanner(System.in);

	void samsungPhone() {
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		System.out.println("Products available in Samsung brand");
		boolean found = false;
		for (int i = 0; i < samsung.length; i++) {
			System.out.println(samsung[i]);
		}
		System.out.println("Please Select the product name from above list");
		String productName = sc.next();
		for (int j = 0; j < samsung.length; j++) {
			if (productName.equals(samsung[j])) {
				found = true;
				System.out.println("Product selected is : " + samsung[j]);

			}

		}
		if (!found) {
			System.out.println("Please select a product from the list");

		}
	
	}

	void googlePhone() {
		String[] google = { "Google_Pixel_6", "Google_Pixel_6_Pro", "Google_Pixel_Pro", "Google_Pixel_Pro" };
		System.out.println("Products available in Google brand");
		boolean found = false;
		for (int i = 0; i < google.length; i++) {
			System.out.println(google[i]);
		}
		System.out.println("Please Select the product name from above list");
		String productName = sc.next();
		for (int j = 0; j < google.length; j++) {
			if (productName.equals(google[j])) {
				System.out.println("Product selected is : " + google[j]);
				found=true;
			}
		}
		if (!found) {
			System.out.println("Please select a product from the list");

		}
	}

	void applePhone() {
		String[] apple = { "Iphone12", "Iphone12_mini", "Iphone11", "Iphone11_Pro" };
		System.out.println("Products available in Samsung brand");
		boolean found = false;
		for (int i = 0; i < apple.length; i++) {
			System.out.println(apple[i]);
		}
		System.out.println("Please Select the product name from above list");
		String productName = sc.next();
		for (int j = 0; j < apple.length; j++) {
			if (productName.equals(apple[j])) {
				System.out.println("Product selected is : " + apple[j]);
				found=true;
			}
		}
		if (!found) {
			System.out.println("Please select a product from the list");

		}
	}

}
