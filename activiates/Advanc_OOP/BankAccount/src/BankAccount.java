import java.util.*;
import java.lang.*;

public class BankAccount {
	
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int accountNums = 0;
	private static double moneyTotal = 0;
	
	public BankAccount() {
		accountNums++;
	}
	
	// returns a random ten digit account number
	public void accountNums() {
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			int rand_int = rand.nextInt(10);
			
			
			// sending the int to a string
			String acctnum = Integer.toString(rand_int);
			System.out.println(rand_int);  	
		}
		
	}
	
	public double getCheckingBalance() {
        return checkingBalance;
    }

	
    public double getSavingsBalance() {
        return savingsBalance;
    }
    
    public void deposit(String account, double amount) {
    	if (account == "checking") {
            checkingBalance += amount;
            moneyTotal += amount;
        } 
    	else if (account == "savings") {;
            savingsBalance += amount;
            moneyTotal += amount;
        } 
    	else {
            System.out.println("Please enter a correct account type for the deposit (use checking or savings).");
        }
    }
    
    public void moneyCount() {
        System.out.println("Checking account balance: " + checkingBalance + ", Savings account balance: " + savingsBalance);
    }
	
	
}
