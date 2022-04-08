package sec3;
//
public class Account {
	private int balance;
	
	public Account() {}

	public int getBalance() {return balance;}

	public void setBalance(int balance) {this.balance = balance;}
	
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) throws BalanceUnderflowException {
		if(balance < money) {
			throw new BalanceUnderflowException((money-balance)+"원 만큼 잔액이 부족합니다.");
		}
		balance-=money;
	}
}
