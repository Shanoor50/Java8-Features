package com.nt.mobile;

public class Airtel implements SIM{

	@Override
	public void call() {
		System.out.println("Calling using Airtel");
	}

	@Override
	public void sms() {
		System.out.println("Sending message using Airtel");
	}
}
