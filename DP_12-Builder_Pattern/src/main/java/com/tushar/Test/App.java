package com.tushar.Test;

import com.tushar.factory.Software_Factory;
import com.tushar.product.Software;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "------Builder DP----------------" );
        Software software =  Software_Factory.getSoftware("JAVA");
        System.out.println("software:: "+software);
    }
}
