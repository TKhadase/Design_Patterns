package com.tushar.factory;

import com.tushar.payment.UPI_Payment;
import com.tushar.payment.Comps.GPay;
import com.tushar.payment.Comps.PayTM;
import com.tushar.payment.Comps.Payment_Broker;
import com.tushar.payment.Comps.PhonePay;

public class Payment_Processor {

	public static UPI_Payment getInstance(String type) {
		Payment_Broker broker = null;
		
		System.out.println("Payment_Processor.getInstance()");
		if(type.equalsIgnoreCase("GPay")) 
			broker = new GPay();
		else if(type.equalsIgnoreCase("PayTM")) 
			broker = new PayTM();
		else if(type.equalsIgnoreCase("PhonePay")) 
			broker = new PhonePay();
		
		UPI_Payment pay = new  UPI_Payment(broker);
		return pay;
	}
	
}
