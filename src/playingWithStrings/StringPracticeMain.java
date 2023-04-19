package playingWithStrings;

import java.util.Scanner;

public class StringPracticeMain {

	public static void main(String[] args) {
		StringPractice str = new StringPractice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter thr city you want to search");
		String city = sc.next();
		boolean result = str.findingCityName(city);
		if (result) {
			System.out.println(city+" found in the list");
		}else {
			System.out.println(city +" is not presrnt in the list");
		}
		System.out.println("*************************");
		str.findingCityNameEndingWithTon();
		System.out.println("*************************");
		str.splitingAddress();

	}

}
