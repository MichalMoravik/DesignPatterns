package com.patterns.bridge;

import com.patterns.bridge.abstractions.AdvancedRemote;
import com.patterns.bridge.abstractions.BasicRemote;
import com.patterns.bridge.implementations.Device;
import com.patterns.bridge.implementations.Radio;
import com.patterns.bridge.implementations.Tv;

public class Client {
	public static void main(String[] args) {

		Device device = new Radio();

		System.out.println("********* Basic remote ********* ");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();


		Device device2 = new Tv();

		System.out.println("********* Advanced remote ********* ");
		AdvancedRemote advancedRemote = new AdvancedRemote(device2);
		advancedRemote.power();
		advancedRemote.mute();
		device2.printStatus();
	}
}
