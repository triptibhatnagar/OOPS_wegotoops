// Attributes and methods

package Practice;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if(initialBalance >= 0) {
            this.balance = initialBalance;
        }else {
            this.balance = 0.00;
            System.out.println("Insufficient funds!");
        }
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        }else {
            System.out.println("Insufficient funds!");
        }
    }
    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance : %.2f\n" , balance);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(accountNumber, balance);
        double addBalance = sc.nextDouble();
        acc.deposit(addBalance);

        double withdrawBalance = sc.nextDouble();
        acc.withdraw(withdrawBalance);

        acc.displayDetails();

        sc.close(); 
    }
}