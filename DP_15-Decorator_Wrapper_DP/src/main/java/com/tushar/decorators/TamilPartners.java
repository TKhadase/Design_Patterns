package com.tushar.decorators;

import com.tushar.comp.MarriageSeekerMembership;

public class TamilPartners extends seekerDecorator {

	public TamilPartners(MarriageSeekerMembership membership){
		super(membership);
	}
	
	@Override
	public void buySeekerMembershipPack() {
		super.buySeekerMembershipPack();
		addTamilPartners();
	}
	
	private void addTamilPartners() {
		System.out.println("Tamil Partners added as preference");
	}

}
