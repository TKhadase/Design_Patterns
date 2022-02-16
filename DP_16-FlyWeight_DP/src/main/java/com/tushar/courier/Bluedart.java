package com.tushar.courier;

public class Bluedart implements Courier {

private String courierVendor;
	
	public Bluedart(){
		System.out.println("-----Bluedart  ----Object initialized");
		courierVendor ="BLUEDART";
	}
	
	@Override
	public void transportOrder_Parcel(int oid) {
		System.out.println("Bluedart parcel service---Order ID:"+oid);
	}

}
