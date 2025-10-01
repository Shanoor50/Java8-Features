package com.nt.mobile;

//To achieve the loose Coupling and run time polimarphizam
class Mobile{
	public void insertSIM(SIM sim) {
		sim.call();
		sim.sms();
		// Only if SIM supports videoCall
        if (sim instanceof SIM3G) {
            ((SIM3G) sim).videoCall();
        }
	}
}
