package checkPrimeNumber;

import java.util.Scanner;

public class PrimeNumberClass {
void checkingPrimeNumber(){
	int number;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number ");
	number = sc.nextInt();
//	System.out.println(number);
	int i=2;
	while(i<=number/2) {
		if(number%i==0) {
			//System.out.println("Entered number is non prime");
			break;
		}else {
			i++;
		}
	}if(i==(number/2)+1) {
		System.out.println("Entered number is prime");
	}else {
		System.out.println("Entered number is non prime");
	}
}
}

