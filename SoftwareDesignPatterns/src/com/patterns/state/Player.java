package com.patterns.state;

public class Player {
	private State state;

	public Player() {
		this.state = new PauseState(this);
	}

	public void changeState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}


