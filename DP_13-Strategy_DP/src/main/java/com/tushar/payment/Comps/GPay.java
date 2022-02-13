package com.tushar.payment.Comps;

public class GPay implements Payment_Broker {

	@Override
	public boolean doPayment(int amt) {
		System.out.println("GPay  Payment:"+amt);
		return true;
	}

}
