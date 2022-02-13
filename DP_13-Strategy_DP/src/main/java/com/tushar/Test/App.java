package com.tushar.Test;

import com.tushar.factory.Payment_Processor;
import com.tushar.payment.UPI_Payment;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "------------strategy DP---------------" );
        UPI_Payment payment  =Payment_Processor.getInstance("PayTM");       
        payment.performTransaction(100);
        
    }
}
