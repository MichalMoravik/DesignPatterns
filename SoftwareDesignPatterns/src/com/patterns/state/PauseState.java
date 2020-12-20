package com.patterns.state;

public class PauseState extends State {

	PauseState(Player player) {
		super(player);
	}

	@Override
	public void onPlay() {
		System.out.println("Play pressed!");
		player.changeState(new PlayState(player));
	}
}

