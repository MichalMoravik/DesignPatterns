package com.patterns.bridge.abstractions;

import com.patterns.bridge.implementations.Device;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super.device = device;
	}

	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}


