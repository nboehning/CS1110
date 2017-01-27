package homework.HW4;

import java.util.Date;

// Author: Nathan Boehning
// Purpose: Create an account class and demonstrate several methods of that class

public class Prob2 
{

	public static void main(String[] args) 
	{
		Account acct1 = new Account(1122, 20000);
		acct1.SetAnnualInterestRate(4.5);
		
		System.out.println("Initial Values");
		System.out.println("Balance: " + acct1.GetBalance());
		System.out.println("Date Created: " + acct1.GetDateCreated());
		System.out.println("Monthly Interest: " + acct1.GetMonthlyInterest());
		
		acct1.Withdraw(2500);
		System.out.println("After 2,500 Withdraw");
		System.out.println("Balance: " + acct1.GetBalance());
		System.out.println("Date Created: " + acct1.GetDateCreated());
		System.out.println("Monthly Interest: " + acct1.GetMonthlyInterest());
		
		acct1.Deposit(3000);
		System.out.println("After 3,000 Deposit");
		System.out.println("Balance: " + acct1.GetBalance());
		System.out.println("Date Created: " + acct1.GetDateCreated());
		System.out.println("Monthly Interest: " + acct1.GetMonthlyInterest());
	}

}


class Account
{
	int id = 0;
	double balance = 0.0;
	static double annualInterestRate = 0.0;
	Date dateCreated;
	
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
	
	int GetId()
	{
		return id;
	}
	
	void SetId(int newId)
	{
		id = newId;
	}
	
	double GetBalance()
	{
		return balance;
	}
	
	void SetBalance(double newBalance)
	{
		balance = newBalance;
	}
	
	double GetAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	void SetAnnualInterestRate(double newRate)
	{
		annualInterestRate = newRate;
	}
	
	Date GetDateCreated()
	{
		return dateCreated;
	}
	
	double GetMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	
	double GetMonthlyInterest()
	{
		return balance * (GetMonthlyInterestRate() / 100);
	}
	
	void Withdraw(double amt)
	{
		balance -= amt;
		if(balance < 0)
			balance = 0;
	}
	
	void Deposit(double amt)
	{
		balance += amt;
	}
}