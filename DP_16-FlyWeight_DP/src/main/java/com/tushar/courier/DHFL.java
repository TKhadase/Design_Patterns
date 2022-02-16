package com.tushar.courier;

public class DHFL implements Courier {
	private String courierVendor;
	
	public DHFL(){
		System.out.println("-----DHFL  ----Object initialized");
		courierVendor ="DHFL";
	}
	
	@Override
	public void transportOrder_Parcel(int oid) {
		System.out.println("DHFL parcel service---Order ID:"+oid);
	}

}
