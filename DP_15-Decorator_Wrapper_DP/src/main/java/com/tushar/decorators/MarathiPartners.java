package com.tushar.decorators;

import com.tushar.comp.MarriageSeekerMembership;

public class MarathiPartners extends seekerDecorator {

	public MarathiPartners(MarriageSeekerMembership membership){
		super(membership);
	}
	
	@Override
	public void buySeekerMembershipPack() {
		super.buySeekerMembershipPack();
		addMarathiPartners();
	}
	
	private void addMarathiPartners() {
		System.out.println("Marathi Partners added as preference");
	}

}
