package command_bankaccount;

import java.util.ArrayList;
import java.util.List;

public class BankTransactionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance;
		double trAmount;
		
		balance = 105.10;
		BankAccount acc = new BankAccount(balance);
					
		List<SimpleTransaction> lstTransaction = new ArrayList<SimpleTransaction>();
		
		lstTransaction.add(new SimpleTransaction(new DepositCommand(acc,20)));
		lstTransaction.add(new SimpleTransaction(new DepositCommand(acc,25)));
		lstTransaction.add(new SimpleTransaction(new WithdrawCommand(acc,21)));
		lstTransaction.add(new SimpleTransaction(new WithdrawCommand(acc,2.5)));
		
		for(SimpleTransaction trans:lstTransaction) {
			trans.PerformTransaction();
		}
		
		for(SimpleTransaction trans:lstTransaction) {
			trans.UndoTransaction();
		}
	}

}
