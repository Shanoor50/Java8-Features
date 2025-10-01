package com.nt.mobile;

public interface SIM{
	public void call();
	public void sms();
	//problem ==>try to add new method in existing Interface but throws compile time error occurs(before java8)
	//public void videoCall();
}
