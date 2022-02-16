package com.tushar;

import java.util.Random;

import com.tushar.courier.Bluedart;
import com.tushar.courier.Courier;
import com.tushar.courier.CourierFactory;
import com.tushar.courier.DHFL;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "--------------FlyWeight DP-----------------" );
        
        for(int i =1; i<=20;i++) {
        Courier courier  =CourierFactory.getCourierInstance("DHFL", DHFL.class);
        courier.transportOrder_Parcel(new Random().nextInt(99999));
        }//for
        
    }//main
}//class
