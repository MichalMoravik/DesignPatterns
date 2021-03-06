package com.patterns.bridge.implementations;

public class Radio implements Device {
	private boolean on = false;
	private int volume = 30;

	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void enable() {
		on = true;
	}

	@Override
	public void disable() {
		on = false;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		} else if (volume < 0) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}
	}

	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
		System.out.println("| Radio ");
		System.out.println("| I'm " + (on ? "enabled" : "disabled"));
		System.out.println("| Current volume is " + volume + "%");
		System.out.println("------------------------------------\n");
	}
}
