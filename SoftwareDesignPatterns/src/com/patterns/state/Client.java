package com.patterns.state;

public class Client {
	public static void main(String[] args) {
		Player player = new Player();
		player.getState().onPlay();

		player.changeState(new PlayState(player));
		player.getState().onPlay();
	}
}

