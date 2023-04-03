package calculator;

import java.util.Scanner;

public class CalculatorClass {
	Scanner sc = new Scanner(System.in);

	void addTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 ");
		double number1 = sc.nextDouble();

		System.out.println("Enter number2 ");
		double number2 = sc.nextDouble();
		double result = number1 + number2;
		System.out.println("Addition is:- " + result);

	}

	void subtractionTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 ");
		double number1 = sc.nextDouble();

		System.out.println("Enter number2 ");
		double number2 = sc.nextDouble();
		double result = number1 - number2;
		System.out.println("Subtraction is:- " + result);

	}

	void multipicationTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 ");
		double number1 = sc.nextDouble();

		System.out.println("Enter number2 ");
		double number2 = sc.nextDouble();
		double result = number1 * number2;
		System.out.println("Multipication is:- " + result);

	}

	void quotientTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 ");
		double number1 = sc.nextDouble();

		System.out.println("Enter number2 ");
		double number2 = sc.nextDouble();
		double result = number1 / number2;
		System.out.println("Quotient is:- " + result);

	}

	void square() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		double number1 = sc.nextDouble();
		double result = number1 * number1;
		System.out.println("Square is:- " + result);
	}
	void cube() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		double number1 = sc.nextDouble();
		double result = number1 * number1*number1;
		System.out.println("Cube is:- " + result);
	}
}
