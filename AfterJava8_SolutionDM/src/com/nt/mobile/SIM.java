package com.nt.mobile;

public interface SIM{
	public void call();
	public void sms();
	public default void videoCall() {
		System.out.println("DF");
	}
}
