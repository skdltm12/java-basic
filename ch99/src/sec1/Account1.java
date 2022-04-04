package sec1;

public class Account1 {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	int Balance;
	public Account1() {};
	public Account1(int balance) {
		this.Balance = balance;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		if(balance <= MAX_BALANCE && balance >= MIN_BALANCE) {Balance+=balance;}	
	}
		
		
		
	}

	
	
	

