package com.nt.mobile;

//To achieve the loose Coupling and run time polimarphizam
class Mobile{
	public void insertSIM(SIM sim) {
		sim.call();
		sim.sms();
		//calling vedioCall 
		//sim.vedioCall(); //problem ===>compile time error
	}
}
