package homework.HW6;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

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
			else
			{
				System.out.println("What do you want to do?");
				System.out.println("Type '1' to view the current balance.");
				System.out.println("Type '2' to make a withdrawal.");
				System.out.println("Type '3' to deposit money.");
				System.out.println("Type '4' to exit\n");
				
				int choice = scanner.nextInt();
				NumberFormat formatter = NumberFormat.getCurrencyInstance();
				
				switch(choice)
				{
					case 1:
						System.out.println("Current Balance: " + formatter.format(curAccount.getBalance()) + "\n");
						break;
					case 2:
						System.out.println("Enter Amount (USD) to Withdraw: ");
						double withdrawAmount = scanner.nextDouble();
						if(withdrawAmount > curAccount.getBalance())
						{
							System.out.println("The amount you entered is greater than the current balance.\nWithdrawing all funds from account.");
							curAccount.withdraw(withdrawAmount);
							System.out.println("New Balance: " + formatter.format(curAccount.getBalance()) + "\n");
						}
						else
						{
							System.out.println("Previous Balance: " + formatter.format(curAccount.getBalance()));
							curAccount.withdraw(withdrawAmount);
							System.out.println("New Balance: " + formatter.format(curAccount.getBalance()) + "\n");
						}
						break;
					case 3:
						System.out.println("Enter Amount (USD) to Deposit: ");
						double depositAmount = scanner.nextDouble();
						System.out.println("Previous Balance: " + formatter.format(curAccount.getBalance()));
						curAccount.deposit(depositAmount);
						System.out.println("New Balance: " + formatter.format(curAccount.getBalance()) + "\n");
						break;
					case 4:
						boolean newAccountSet = false;
						while(!newAccountSet)
						{
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