package com.patterns.bridge.implementations;

public interface Device {
	boolean isEnabled();
	void enable();
	void disable();
	int getVolume();
	void setVolume(int percent);
	void printStatus();
}

