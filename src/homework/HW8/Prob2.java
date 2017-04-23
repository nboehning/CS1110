package homework.HW8;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

public class Prob2 
{
	public static void main(String[] args) 
	{
		System.out.println("Creating a savings and checking account . . .");
		CheckingAccount check1 = new CheckingAccount(1111, 5000,100);
		SavingsAccount save1 = new SavingsAccount(1112, 500);
		
		System.out.println(check1.toString());
		System.out.println(save1.toString());
		
		System.out.println("\nDepositing $500 into checking and savings account . . .");
		save1.deposit(500);
		check1.deposit(500);
		System.out.println(check1.toString());
		System.out.println(save1.toString());
		
		System.out.println("\nWithdrawing $5550 from checking and savings account . . .");
		check1.withdraw(5550);
		save1.withdraw(5550);
		//System.out.println(check1.getBalance());
		System.out.println(check1.toString());
		System.out.println(save1.toString());
		
		System.out.println("\nWithdrawing $100 from checking and savings account . . .");
		check1.withdraw(100);
		save1.withdraw(100);
		//System.out.println(check1.getBalance());
		System.out.println(check1.toString());
		System.out.println(save1.toString());
	}
}

// Base account class
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

// Checking account child of base account class
class CheckingAccount extends Account
{
	// Variables
	private double overDraftAmt;
	
	// Constructor
	CheckingAccount(int id, double balance, double overdraft)
	{
		setId(id);
		setBalance(balance);
		if(overdraft > 0)
			overDraftAmt = overdraft;
		else
			overDraftAmt = overdraft * -1;
	}
	
	// Methods
	public void withdraw(double amt)
	{
		
		if((getBalance() * -1 ) + amt > overDraftAmt)
			setBalance(overDraftAmt * -1);
		else
			setBalance(getBalance() - amt);
	}
	
	public String toString()
	{	
		// Negative balance fix gotten from: 
		// http://stackoverflow.com/questions/2056400/format-negative-amount-of-usd-with-a-minus-sign-not-brackets-java
		DecimalFormat formatter = (DecimalFormat)NumberFormat.getCurrencyInstance();
		String symbol = formatter.getCurrency().getSymbol();
		formatter.setNegativePrefix(symbol+"-"); // or "-"+symbol if that's what you need
		formatter.setNegativeSuffix("");
		
		// Ran into bug where formatter wouldn't display negative balance correctly
		//NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		return "Checking Account " + getId() + " balance: " + 
			formatter.format(getBalance()) + "\n              Overdraft Limit: " +  
				formatter.format(overDraftAmt);
	}
}

// Savings account child of base account class
class SavingsAccount extends Account
{
	// Constructor
	SavingsAccount(int id, double balance)
	{
		setId(id);
		setBalance(balance);
	}
	
	// Base account class already ensures that balance cannot go below zero.
	
	// Method
	public String toString()
	{		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		return "Savings Account " + getId() + " balance: " + formatter.format(getBalance());
	}
}