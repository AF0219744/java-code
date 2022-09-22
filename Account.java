
public class Account {

	public static void main(String[] args) {}
		
		 private double balance;
		
	
		 // Set balance to 0.00
		 public Account ()  {
			 Balance = 0.0;
			 
		 }

		 
		 // Deposite
	     public void deposite(double amount) {
             balance = balance + amount;
	     }
	     
	     
	     
	    // Withdraw
	     public void withdraw(double amount) {
	    	 balance= balance-amount;
	     }
	     
	     
	     // Get Balance
	     public void getBalance() {
	    	 return balance;
	    	 
	    	 
	     
	}

}
