
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SavingsAccount account = new SavingsAccount();
       
       account.accountNo = 101;
       account.pin =234;
       account.branch = "xyz";
       account.status ="active";
       account.balance = 5000;
       
       account.readDetails();
       
       
       SavingsAccount account2 = new SavingsAccount(102,5000,"active",2345,"xyz");
       
       System.out.println("InterestRate : "+SavingsAccount.interestRate );
       
	}

}
