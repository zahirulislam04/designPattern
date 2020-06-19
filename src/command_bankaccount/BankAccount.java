package command_bankaccount;

public class BankAccount {
	double balance;
	double prevBalance;
	
	public BankAccount(double bal) {
		this.balance=bal;
		DisplayBalance();
	}
	
	public void DepositAmount(double amt) {
		this.prevBalance = balance;
		this.balance = this.balance  + amt;
		
		DisplayBalance();
	}
	
	public void WithdrawAmount(double amt) {
		this.prevBalance = balance;
		this.balance = this.balance  - amt;
		DisplayBalance();
	}
	
	public void UndoTransaction() {
		DisplayBalance();
	}
	
	private void DisplayBalance() {
		System.out.println("Current Balance is :" + this.balance);
	}
}
