package com.umitunal.behavioralpatterns.command;

//Receiver
public class Light {
	@SuppressWarnings("unused")
	private boolean on;

	public void switchOn() {
		on = true;
	}

	public void switchOff() {
		on = false;
	}

}