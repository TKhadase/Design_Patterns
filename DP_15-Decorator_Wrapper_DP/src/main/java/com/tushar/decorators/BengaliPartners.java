package com.tushar.decorators;

import com.tushar.comp.MarriageSeekerMembership;

public class BengaliPartners extends seekerDecorator {

	public BengaliPartners(MarriageSeekerMembership membership){
		super(membership);
	}
	
	@Override
	public void buySeekerMembershipPack() {
		super.buySeekerMembershipPack();
		addBengaliPartners();
	}
	
	private void addBengaliPartners() {
		System.out.println("Bengali Partners added as preference");
	}

}
