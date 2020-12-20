package com.patterns.state;

public abstract class State {
	Player player;

	State(Player player) {
		this.player = player;
	}

	public abstract void onPlay();
}

