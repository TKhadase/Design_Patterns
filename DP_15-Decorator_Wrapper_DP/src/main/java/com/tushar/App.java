package com.tushar;

import com.tushar.comp.MarriageSeekerMembership;
import com.tushar.comp.PlatinumMembership;
import com.tushar.comp.classicMembership;
import com.tushar.decorators.GujratiPartners;
import com.tushar.decorators.MarathiPartners;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "--------------Decorator DP-----------------" );
        MarriageSeekerMembership membership = new MarathiPartners(new GujratiPartners(  new PlatinumMembership() ));
        membership.buySeekerMembershipPack();
    }
}
