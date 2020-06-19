package command_bankaccount;

public interface ICommand {
	public void execute();
	public void undo();	
}
