package bank;

import java.util.Scanner;

public class BankOperations {
    private CustomerAccount customer; // Declare a private variable to hold the CustomerAccount instance

    public BankOperations() {
        customer = new CustomerAccount(); // Create a new instance of the CustomerAccount class and assign it to the variable
    }

    Scanner sc = new Scanner(System.in);
//    String name = customer.getCustomerName();
//    String accountNumber = customer.getAccountNumber();
//    double balance = customer.getCurrentBalance();

    void withdraw() {
        System.out.println("Please enter the amount you want to withdraw");
        int withdrawAmount = sc.nextInt();
        String name = customer.getCustomerName();
        String accountNumber = customer.getAccountNumber();
        double balance = customer.getCurrentBalance(); // Access the CustomerAccount instance to get the current balance
        if(balance>withdrawAmount) {
        double updatedCurrentBalance = balance - withdrawAmount;
        System.out.println(name +", with account number "+ accountNumber+ " , has a remaining balance of $"+ updatedCurrentBalance);
        }
        else {
        	System.out.println("You do not have enough balance");
        }
    }

    void deposit() {
    	System.out.println("Please enter the amount you want to deposite");
        int depositeAmount = sc.nextInt();
        String name = customer.getCustomerName();
        String accountNumber = customer.getAccountNumber();
        double balance = customer.getCurrentBalance(); // Access the CustomerAccount instance to get the current balance
        double updatedCurrentBalance = balance + depositeAmount;
        System.out.println(name +", with account number "+ accountNumber+ " , has a remaining balance of $"+ updatedCurrentBalance);

        
    }

    void viewBalance() {
    	 String name = customer.getCustomerName();
         String accountNumber = customer.getAccountNumber();
    	 double balance = customer.getCurrentBalance(); // Access the CustomerAccount instance to get the current balance
         
    	 System.out.println(name +", with account number "+ accountNumber+ " , has a remaining balance of $"+ balance);
    }
}

