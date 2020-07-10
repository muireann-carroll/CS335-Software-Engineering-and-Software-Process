package atm;

/**
 * This class performs calculations on a bank account.
 * It includes a methods for withdrawing and depositing money.
 * @author u180610
 * @version 1.0
 *@since 11 Feb 2020
 */

public class BankAccount {

/**
* balance attribute
*/
    private double balance;

//Constructors
public BankAccount()
{
balance = 0;
}

/**
*Get initial balance
*@param initialBalance double
*/
public BankAccount(double initialBalance)
{
balance = initialBalance;
}

/**
* Calculate the balance after deposit has been added.
* @param amount double
*/
public void deposit(double amount)
  {      
balance = balance + amount;
     
   }

/**
* Calculate balance after money has been withdrawn.
* @param amount
*/
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
/**
* Gets initial balance in account
* @return
*/
public double getBalance()
{
return balance;
}

/**
* Calculates the new total in bank account.
* @param newTotal
* @return
*/
public double setBalance(double newTotal)
{
balance = newTotal;
return balance;
}

}