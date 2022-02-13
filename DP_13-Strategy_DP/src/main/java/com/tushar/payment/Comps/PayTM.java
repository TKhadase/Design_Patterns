package com.tushar.payment.Comps;

public class PayTM implements Payment_Broker {

	@Override
	public boolean doPayment(int amt) {
		System.out.println("PayTM  Payment:"+amt);
		return true;
	}

}
