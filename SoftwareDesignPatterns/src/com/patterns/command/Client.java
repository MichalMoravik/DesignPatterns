package com.patterns.command;

public class Client {

	public static void main(String[] args) {
		Terminal terminal = new Terminal();
		ICommand changeTextCommand = new ChangeTextCommand(terminal);

		changeTextCommand.execute();
		changeTextCommand.execute();
		changeTextCommand.undo();
	}
}

