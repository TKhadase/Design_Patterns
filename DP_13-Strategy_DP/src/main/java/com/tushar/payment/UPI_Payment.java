package com.tushar.payment;

import com.tushar.payment.Comps.Payment_Broker;

public class UPI_Payment {

	private Payment_Broker broker;

	public  UPI_Payment(Payment_Broker broker) {
		this.broker = broker;
	}
	
	public boolean performTransaction(int amt){
		System.out.println("UPI_Payment.performTransaction amt:"+amt);
		broker.doPayment(amt);
		return true;
	}
	
}
