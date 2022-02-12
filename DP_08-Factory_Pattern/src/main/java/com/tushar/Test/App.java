package com.tushar.Test;

import com.tushar.developer.Code_Developer;
import com.tushar.developer.Developer_Types;
import com.tushar.developer.factory.Code_Developer_Factory;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "-----------------------developer factory Test---------" );
        Code_Developer developer =Code_Developer_Factory.getRequiredDeveloper(Developer_Types.BACKEND);
      
    }
}
