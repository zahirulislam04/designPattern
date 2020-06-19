package command_bankaccount;

import java.util.Stack;

public class SimpleTransaction {
	ICommand command;
	ICommand undoCommand;
	Stack<ICommand> commandStack = new Stack<ICommand>();
	
	public SimpleTransaction(ICommand com) {
		this.command = com;
	}
	
	public void SetCommand(ICommand com) {
		this.command = com;
	}
	
	public void PerformTransaction() {
		commandStack.push(command);
		command.execute();		
	}
	
	public void UndoTransaction() {
		undoCommand = (ICommand)commandStack.pop();
		undoCommand.undo();		
	}
	
}
