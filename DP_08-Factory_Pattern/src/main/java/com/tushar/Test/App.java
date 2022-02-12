package com.tushar.Test;

import com.tushar.developer.Code_Developer;
import com.tushar.developer.Code_Developer_Factory;
import com.tushar.developer.Developer_Types;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "-----------------------developer factory Test---------" );
        Code_Developer developer =Code_Developer_Factory.getRequiredDeveloper(Developer_Types.BACKEND);
        developer.coding();
        developer.buildingProject();
        developer.TestingProject();
    }
}
