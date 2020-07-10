package atm;
//@version 1.0;
//@author Muireann
public class BankAccount {

    private double balance;
    double newTotal;
	//Constructors
	public BankAccount()
	{
		balance = 0;
	}
	
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	// Methods
	public void deposit(double amount)
	   {      
		balance = balance + amount;
	       
	    } 
	
	public boolean withdraw(double amount)    
	{ 
		if (balance>= amount)
			{
			balance = balance - amount;
			return true;
			}
		else
			return false;
        
    } 
	
	public double getBalance() 
	{ 
		return balance;
	}
	
	public double setBalance(double newTotal)
	{
		balance = newTotal;
		return balance;
	}
}

