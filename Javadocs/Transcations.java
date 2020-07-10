package atm;
import javax.swing.JOptionPane;
/**
 * This class performs calculations on a bank account.
 * @author u190014
 * @version 1.0
 *@since 11 Feb 202
 */
public class Transcations
{
/**
*
*/
public int answer1,answer2,amount;
public boolean withdrawOK = true;
public BankAccount ba;
   
public Transcations() {
    answer1=0;
    answer2=0;
    amount=0;
    ba = new BankAccount(1000);
   
    }
   
/**
 * Main method gets input value from from getinput() method.
 */
public static void main(String[] args)
{
 Transcations transaction = new Transcations();
 transaction.getInput();
 System.exit(0);
 
 }
 
/**
 * getInput() gets the input amount from user.
 */
   public void getInput() {  
  answer1 = JOptionPane.showConfirmDialog(null,
               "Make a Depoist?", null, JOptionPane.YES_NO_OPTION);
   
  if (answer1 == JOptionPane.YES_OPTION){
     String depString =
            JOptionPane.showInputDialog(
                                  "Enter amount:");
     amount = Integer.parseInt(depString);
   
     //deposit an amount in the account
     JOptionPane.showMessageDialog(
      null, ba.getBalance()+amount);
     
   

       
     }
 
  else if (answer1 == JOptionPane.NO_OPTION){
  answer2 = JOptionPane.showConfirmDialog(null,
               "Make a Withdraw?", null, JOptionPane.YES_NO_OPTION);
 
  if (answer2 == JOptionPane.YES_OPTION){
     String withString =
            JOptionPane.showInputDialog(
                                  "Enter amount:");
     amount = Integer.parseInt(withString);
     
  //withdraw an amount from the account  
     JOptionPane.showMessageDialog(
      null, ba.getBalance()-amount);
 
  }


  }
  if (!withdrawOK)
  JOptionPane.showMessageDialog(
        null, "Your Balance  = " + ba.getBalance()+ " which is not enough for this withdraw ");

       
     }
}
