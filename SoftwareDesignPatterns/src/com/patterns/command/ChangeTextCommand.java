package com.patterns.command;

public class ChangeTextCommand implements ICommand {
	public Terminal terminal;

	ChangeTextCommand(Terminal terminal) {
		this.terminal = terminal;
	}

	@Override
	public void execute() {
		terminal.addToStack(" *NEW* ");
	}

	@Override
	public void undo() {
		terminal.removeFromStack();
	}
}

