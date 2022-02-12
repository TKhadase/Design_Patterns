package com.tushar.developer.factory;

public class FreeLance_Code_Developer_Factory extends Dev_Factory {

	@Override
	public boolean checkQualification() {
		System.out.println("FreeLance_Code_Developer_Factory.checkQualification()");
		return true;
	}

	@Override
	public boolean  checkEligibility() {
		System.out.println("FreeLance_Code_Developer_Factory.checkEligibility()");
		return true;
	}
	
}
