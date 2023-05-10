package bankOperations;

import java.util.Scanner;

public class BankOperations {
    private CustomerAccount customer; // Declare a private variable to hold the CustomerAccount instance

//    public BankOperations() {
//        customer = new CustomerAccount(); // Create a new instance of the CustomerAccount class and assign it to the variable
//    }

    Scanner sc = new Scanner(System.in);

    void withdraw() {
        System.out.println("Please enter the amount you want to withdraw");
        int withdrawAmount = sc.nextInt();
        double balance = customer.getCurrentBalance(); // Access the CustomerAccount instance to get the current balance
        double updatedCurrentBalance = balance - withdrawAmount;
        System.out.println(updatedCurrentBalance);

    }

    void deposit() {
    	System.out.println("Please enter the amount you want to deposite");
        int depositeAmount = sc.nextInt();
        double balance = customer.getCurrentBalance(); // Access the CustomerAccount instance to get the current balance
        double updatedCurrentBalance = balance + depositeAmount;
        System.out.println(updatedCurrentBalance);

        
    }

    void viewBalance() {
    	 double balance = customer.getCurrentBalance(); // Access the CustomerAccount instance to get the current balance
         
         System.out.println(balance);
    }

	public void selectOperation() {
		// TODO Auto-generated method stub
		
	}

}
