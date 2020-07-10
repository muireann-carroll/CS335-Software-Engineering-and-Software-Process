package atm;
import javax.swing.JOptionPane;
/**
* This class calculations on a bank account.
* It includes 2 methods for calculating area and circumference of a circle
* @author Muireann
* @version 1.0
* @since 12 Feb 2020
*/

public class Transcations
{
	public int answer1,answer2,amount;
	public double newTotal;
	public boolean withdrawOK = true;
	public BankAccount ba;
    
	public Transcations() {
    	answer1=0;
    	answer2=0;
    	amount=1000;
    	ba = new BankAccount(amount);
    	 
    }
    
	
	public static void main(String[] args)
	{
	  Transcations transaction = new Transcations();
	  transaction.getInput();
	  System.exit(0);
		  
	  }
	   
   public void getInput() {	   
	   answer1 = JOptionPane.showConfirmDialog(null,
	                "Make a Deposit?", null, JOptionPane.YES_NO_OPTION);
	     
	   if (answer1 == JOptionPane.YES_OPTION){
	    	  String depString =
	    		         JOptionPane.showInputDialog(
	    		                               "Enter amount:");
	    	  amount = Integer.parseInt(depString);
	    	  
	    	  newTotal = ba.getBalance() + (double)amount;
	    	// System.out.println(ba.getBalance() + (double) amount);
	   
	    	   
	    	  
	    		     
	      }
	   
	   else if (answer1 == JOptionPane.NO_OPTION){
		   answer2 = JOptionPane.showConfirmDialog(null,
	                "Make a Withdraw?", null, JOptionPane.YES_NO_OPTION);
	   
		   if (answer2 == JOptionPane.YES_OPTION){
		    	  String withString =
		    		         JOptionPane.showInputDialog(
		    		                               "Enter amount:");
		    	  amount = Integer.parseInt(withString);
		    	  newTotal = ba.getBalance() - (double)amount;
		 	  
		    	 
	   
	   }
		 
			
	   }
	   if (!withdrawOK)
		   JOptionPane.showMessageDialog(
			         null, "Your Balance  = " + ba.getBalance()+ " which is not enough for this withdraw ");
	   else
		   JOptionPane.showMessageDialog(
				  
				     null, " Your balance is " +  ba.setBalance(newTotal)); //gets newTotal to appear on popup screen

		      	   
	      }
}


