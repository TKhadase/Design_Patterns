package com.tushar.decorators;

import com.tushar.comp.MarriageSeekerMembership;

public class GujratiPartners extends seekerDecorator {

	public GujratiPartners(MarriageSeekerMembership membership){
		super(membership);
	}
	
	@Override
	public void buySeekerMembershipPack() {
		super.buySeekerMembershipPack();
		addGujratiPartners();
	}
	
	private void addGujratiPartners() {
		System.out.println("Gujrati Partners added as preference");
	}

}
