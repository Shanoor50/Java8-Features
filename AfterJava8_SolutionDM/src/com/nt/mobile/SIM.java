package com.nt.mobile;

public interface SIM{
	public void call();
	public void sms();
	//not implemented anyever
	public default void videoCall() {
		System.out.println("DF");
	}
}
