package com.tushar.decorators;

import com.tushar.comp.MarriageSeekerMembership;

public abstract class seekerDecorator implements MarriageSeekerMembership {

	private MarriageSeekerMembership membership;

	seekerDecorator(MarriageSeekerMembership membership){
		this.membership=membership;
	}
	
	@Override
	public void buySeekerMembershipPack() {
		membership.buySeekerMembershipPack();
	}

}
