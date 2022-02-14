package com.tushar;

import com.tushar.converters.BombayStockImpl;
import com.tushar.converters.IBombayStock;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "------------------Adapter DP-------------------------" );
        IBombayStock stock =new BombayStockImpl();
        String name = "NOKIA";
        int value = stock.getStockPrice(name);
        System.out.println("Stock:: "+name+" , Value:"+value);
    }
}
