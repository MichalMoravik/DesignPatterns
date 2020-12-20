package com.patterns.state;

public class PlayState extends State {

	PlayState(Player player) {
		super(player);
	}

	@Override
	public void onPlay() {
		System.out.println("You already play music!");
	}
}


