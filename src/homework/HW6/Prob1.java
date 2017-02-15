package homework.HW6;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

// Author: Nathan Boehning
// Purpose: Demonstrate use of the account class. Create a basic "ATM" that allows you to manage 10 different accounts
public class Prob1 
{
	// Create and initialize array of accounts
	static Account[] accounts = new Account[10];
	
	public static void main(String[] args)
	{
		// Create and initialize array of accounts
		Account[] accounts = new Account[10];
		
		for(int i = 0; i < 10; i++)
			accounts[i] = new Account(i, 100);
		
		// Start a scanner, initialize variables		
		Scanner scanner =  new Scanner(System.in);
		int curAccountNum = -1;
		Account curAccount = new Account();		
		boolean firstTime = true;
		
		while(true)
		{
			// If it's the first time, they have to choose an account number
			if(firstTime)
			{
				System.out.println("Enter your account number: ");
				curAccountNum = scanner.nextInt();
			
				if(curAccountNum < 0 || curAccountNum > 9)
					System.out.println("Invalid account number, try again.");
				else
				{
					curAccount = accounts[curAccountNum];
					firstTime = false;
				}
			}
			// Only accessible once they've chosen an account for the first time
			else
			{
				// Print out options available to user
				System.out.println("What do you want to do?");
				System.out.println("Type '1' to view the current balance.");
				System.out.println("Type '2' to make a withdrawal.");
				System.out.println("Type '3' to deposit money.");
				System.out.println("Type '4' to exit\n");
				
				// scan in their choice
				int choice = scanner.nextInt();
				
				// formatter to put values in currency
				NumberFormat formatter = NumberFormat.getCurrencyInstance();
				
				// switch on the choice
				switch(choice)
				{
					// BALANCE
					case 1:
						// Display the balance
						System.out.println("Current Balance: " + formatter.format(curAccount.getBalance()) + "\n");
						break;
					// WITHDRAW
					case 2:
						//Prompt for amount to withdraw
						System.out.println("Enter Amount (USD) to Withdraw: ");
						
						// Get the amount
						double withdrawAmount = scanner.nextDouble();
						
						// If withdrawal is more than amount of funds available
						if(withdrawAmount > curAccount.getBalance())
						{
							// Tell user and withdraw the money, auto corrects to zero, display the new balance
							System.out.println("The amount you entered is greater than the current balance.\nWithdrawing all funds from account.");
							curAccount.withdraw(withdrawAmount);
							System.out.println("New Balance: " + formatter.format(curAccount.getBalance()) + "\n");
						}
						// User has sufficient funds
						else
						{
							// Display previous and current balances
							System.out.println("Previous Balance: " + formatter.format(curAccount.getBalance()));
							curAccount.withdraw(withdrawAmount);
							System.out.println("New Balance: " + formatter.format(curAccount.getBalance()) + "\n");
						}
						break;
					// DEPOSIT
					case 3:
						// Prompt user to enter deposit amount
						System.out.println("Enter Amount (USD) to Deposit: ");
						// Read deposit amount
						double depositAmount = scanner.nextDouble();
						
						// Display previous and current balances
						System.out.println("Previous Balance: " + formatter.format(curAccount.getBalance()));
						curAccount.deposit(depositAmount);
						System.out.println("New Balance: " + formatter.format(curAccount.getBalance()) + "\n");
						break;
					// MAIN MENU
					case 4:
						// bool to force the repeat until valid account chosen
						boolean newAccountSet = false;
						
						// loop to force valid account choice
						while(!newAccountSet)
						{
							// prompt, check, and set the new account
							System.out.println("Enter your account number: ");
							curAccountNum = scanner.nextInt();
						
							if(curAccountNum < 0 || curAccountNum > 9)
								System.out.println("Invalid account number, try again.");
							else
							{
								curAccount = accounts[curAccountNum];
								newAccountSet = true;
							}
						}
						break;
					// INVALID CHOICE
					default:
						System.out.println("Invalid Choice.");
						break;
				}
			}

		}
		
	}

}

class Account
{
	// Variables
	int id = 0;
	double balance = 0.0;
	static double annualInterestRate = 0.0;
	Date dateCreated;
	
	// Constructors
	Account()
	{
		dateCreated = new Date();
	}
	
	Account(int newId, double newBalance)
	{
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	
	// Getters and Setters
	int getId()
	{
		return id;
	}
	
	void setId(int newId)
	{
		id = newId;
	}
	
	double getBalance()
	{
		return balance;
	}
	
	void setBalance(double newBalance)
	{
		balance = newBalance;
	}
	
	double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	void setAnnualInterestRate(double newRate)
	{
		annualInterestRate = newRate;
	}
	
	Date getDateCreated()
	{
		return dateCreated;
	}
	
	double getMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	
	double getMonthlyInterest()
	{
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	
	// Methods
	void withdraw(double amt)
	{
		balance -= amt;
		if(balance < 0)
			balance = 0;
	}
	
	void deposit(double amt)
	{
		balance += amt;
	}
}