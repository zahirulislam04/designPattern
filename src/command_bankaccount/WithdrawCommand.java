package command_bankaccount;

public class WithdrawCommand implements ICommand {

	BankAccount account;
	double amount;
	
	public WithdrawCommand(BankAccount acct,double amt) {
		this.account = acct;
		this.amount = amt;
	}
	
	@Override
	public void execute() {
		account.WithdrawAmount(amount);		
	}

	@Override
	public void undo() {
		account.DepositAmount(amount);
	}

}
