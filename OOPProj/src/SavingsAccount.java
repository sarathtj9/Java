
public class SavingsAccount {
	
	//fields or non-static variables or instances variables
	int accountNo;
	float balance;
	String status;
	int pin;
	String branch;
	
	
	final static float interestRate = 2.25f;
	//default constructor
	public SavingsAccount() {
		
	}
	
	
	//parameterized constructor
	public SavingsAccount(int accountNo, float balance, String status, int pin, String branch) {
		//super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.status = status;
		this.pin = pin;
		this.branch = branch;
	}
    
	public static float getInterestrate() {
		return interestRate;
	}
	public void readDetails() {
		System.out.println("accountno :"+accountNo);
	}

	 public void withdraw(int pin,int withdrawalAmount) {
		 if(this.pin == pin) {
			 if(withdrawalAmount <= 40000) {
				 
				 withdraw(withdrawalAmount);
				 
				 
			 }
			 else {
				 System.err.println("withdrawalamount exceeeded");
			 }
		 }
	 }
	 //instance method or non-static method 
	 //withdraw(int)
  public void withdraw(int withdrawalAmount) {
		//business logic
	  if(withdrawalAmount <= balance) {
		  balance = balance - withdrawalAmount;
	  }
		  else
			  System.err.println("U have insufficient funds");
	  
  }
  
  public void deposit(int depositAmount) {
	  
	  balance = balance + depositAmount;
  }
   
}
