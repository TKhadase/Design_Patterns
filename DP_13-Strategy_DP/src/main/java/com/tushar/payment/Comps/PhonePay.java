package com.tushar.payment.Comps;

public class PhonePay implements Payment_Broker {

	@Override
	public boolean doPayment(int amt) {
		System.out.println("PhonePay  Payment:"+amt);
		return true;
	}

}
