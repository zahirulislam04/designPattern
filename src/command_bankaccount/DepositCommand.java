package command_bankaccount;

import javax.security.auth.login.AccountNotFoundException;

public class DepositCommand implements ICommand {

	BankAccount account;
	
	double amount;	
	
	public DepositCommand(BankAccount acct, double amt) {
		this.account = acct;
		this.amount=amt;		
	}
	
	@Override
	public void execute() {
		account.DepositAmount(amount);
		
	}

	@Override
	public void undo() {		
		account.WithdrawAmount(amount);
	}
	
}
